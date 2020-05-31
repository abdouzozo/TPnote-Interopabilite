package fr.ensim.interop.eval.exo2;

import metierExo2.PlantationMetierImpl;

import java.net.URI;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import javax.validation.constraints.NotNull;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import metierExo2.Plantation;

//import javax.ws.rs.Path;
//@Path("/plantation")

@RestController
public class PlantationRestController {

	// TODO Exercice 2 - Implémentation d'une API REST pour la gestion de plantation
	
	private PlantationMetierImpl metier;
	
	// Simulation d'un séquenceur pour générer l'identifiant des équipes
    private AtomicInteger fakeSeq = new AtomicInteger(0);

	
	public PlantationRestController() {
		metier = new PlantationMetierImpl();
	}
	
	@GetMapping("/plantations")
	public List<Plantation> listerPlantations(){
		return metier.listerPlantation();
	}
	
	@PostMapping(path= "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Plantation> ajouterPlantation(@RequestBody Plantation p) {
		p.setId(fakeSeq.incrementAndGet());
		// URI de localisation de la ressource
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(p.getId());
        
        metier.ajouterPlantation(p);

        // réponse 201 avec la localisation et la ressource créée
        return ResponseEntity.created(location).body(p);
		
	}
	
	
	
	@DeleteMapping("/plantation/delete/{id}")
	public  ResponseEntity<Plantation> supprimerPlantation(@PathVariable("id") @NotNull long pId) {
		metier.supprimerPlantation(pId);
		return ResponseEntity.noContent().build();
	}
	
	
	
	
	
	
	/*
	
	@GetMapping("/plantations")
	public ResponseEntity<Collection<Plantation>> listerPlantations(){
		return ResponseEntity.ok().body(metier.listerPlantation()); 
	}
	
	@PostMapping("/plantation/add/{date}/{parcelle}/{nomCommum}/{famille}")
	public ResponseEntity<Plantation> ajouterPlantation(@RequestParam("date") Date date,@RequestParam("parcelle") String parcelle,
			@RequestParam("nomCommum") String nomCommun,@RequestParam("famille") String famille) {
		Plantation p = new Plantation(date,parcelle,nomCommun,famille);
		p.setId(fakeSeq.incrementAndGet());
		// URI de localisation de la ressource
        URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").build(p.getId());

        // réponse 201 avec la localisation et la ressource créée
        return ResponseEntity.created(location).body(p);
		
	}
	
	@DeleteMapping("/plantation/delete/{id}")
	public  ResponseEntity<Plantation> supprimerPlantation(@PathVariable("id") @NotNull long pId) {
		metier.supprimerPlantation(pId);
		return ResponseEntity.noContent().build();
	}
	
*/
}