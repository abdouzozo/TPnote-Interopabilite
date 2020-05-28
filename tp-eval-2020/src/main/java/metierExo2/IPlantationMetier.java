package metierExo2;

import java.util.List;

public interface IPlantationMetier {
	public Plantation ajouterPlantation(Plantation p);
	public boolean supprimerPlantation(long pId);
	public List<Plantation> listerPlantation();
	
}
