package packageAnimal;

public class ApplicationAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Création des instances chien et chat
		
		ChienClass myDog = new ChienClass();
		ChatClass myCat = new ChatClass();
		
		// SETTERS mes attributs 
		
		myDog.setAge(45);
		myDog.setComportement("Super Vénère");
		myDog.setCouleur("Gold");
		myDog.setMaladie("Rage");
		myDog.setEspece("ChienDuPérou");
		myDog.setNom("Bailey");
		myDog.setPrenom("Ethan");
		myDog.setRace("Doberman");
	}

}
