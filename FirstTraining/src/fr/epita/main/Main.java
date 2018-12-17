package fr.epita.main;

import fr.epita.datamodel.Mammal;
import fr.epita.datamodel.Snake;

public class Main {

	public static void main(String[] args) {
		Mammal cat = new Mammal("Fluffy", 3);   // constructor with name and age
		Snake snake = new Snake ("Rex", 2, 8,6);   // constructor with name, age and length
		
		cat.setAlive(true);
		cat.setWeight(4);
		snake.setAlive(true);
		snake.setWeight(10);
		System.out.println("Information on " + cat.getName() + " : Age is " + cat.getAge() + ", Weight is " + cat.getWeight());
		System.out.println("Information on " + snake.getName() + " : Age is " + snake.getAge() + ", Weight is " + snake.getWeight() + ", length is " + snake.getLength());

		// TODO make these println work by adding relations and methods to the existing code
	}
}
