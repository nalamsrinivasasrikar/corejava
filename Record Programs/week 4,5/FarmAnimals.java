package recordprog;
// Base class
	class Animal {
	    String name;
	    String place;
	    String food;
	    String sound;

	    
	    Animal(String name, String place, String food, String sound) {
	        this.name = name;
	        this.place = place;
	        this.food = food;
	        this.sound = sound;
	    }

	    
	    void displayDetails() {
	        System.out.println("The " + name + " lives in the " + place +
	                           ", eats " + food +
	                           ", and makes the sound \"" + sound + "\".");
	    }
	}


	public class FarmAnimals {
	    public static void main(String[] args) {
	        
	        Animal cow = new Animal("Cow", "cowshed", "grass & hay", "Moo Moo");
	        Animal pig = new Animal("Pig", "pigsty", "vegetables & grains", "Oink Oink");
	        Animal horse = new Animal("Horse", "stable", "hay & oats", "Neigh Neigh");
	        Animal goat = new Animal("Goat", "goat pen", "leaves & grass", "Baa Baa");
	        Animal duck = new Animal("Duck", "pond", "insects & grains", "Quack Quack");
	        Animal chicken = new Animal("Chicken", "henhouse", "grains & seeds", "Cluck Cluck");

	        
	        cow.displayDetails();
	        pig.displayDetails();
	        horse.displayDetails();
	        goat.displayDetails();
	        duck.displayDetails();
	        chicken.displayDetails();
	    }
	}

