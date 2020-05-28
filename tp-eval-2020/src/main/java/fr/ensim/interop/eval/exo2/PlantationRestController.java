package fr.ensim.interop.eval.exo2;

import metierExo2.PlantationMetierImpl;

import java.util.Date;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
	
	public List<Plantation> listerPlantations(){
		return metier.listerPlantation(); 
	}
	
	@PostMapping("/plantation/{date}/{parcelle}/{nomCommum}/{famille}")
	public Plantation ajouterPlantation(@RequestParam("date") Date date,@RequestParam("parcelle") String parcelle,
			@RequestParam("nomCommum") String nomCommun,@RequestParam("famille") String famille) {
		Plantation p = new Plantation(date,parcelle,nomCommun,famille);
		p.setId(fakeSeq.incrementAndGet());
		return metier.ajouterPlantation(p);
	}
	
	public boolean supprimerPlantation(long pId) {
		return metier.supprimerPlantation(pId);
	}
	

}