package packageAnimal;

public class ApplicationAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Cr�ation des instances chien et chat
		
		ChienClass myDog = new ChienClass();
		ChatClass myCat = new ChatClass();
		
		// SETTERS mes attributs 
		
		myDog.setAge(45);
		myDog.setComportement("Super V�n�re");
		myDog.setCouleur("Gold");
		myDog.setMaladie("Rage");
		myDog.setEspece("ChienDuP�rou");
		myDog.setNom("Bailey");
		myDog.setPrenom("Ethan");
		myDog.setRace("Doberman");
	}

}
