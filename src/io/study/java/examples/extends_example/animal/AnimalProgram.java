package io.study.java.examples.extends_example.animal;

/**
 * @author dlgusrn0808@gmail.com
 */
public class AnimalProgram {

	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.run();

		Cat cat = new Cat();
		cat.run();


		Animal animal = new Dog();
		animal.run();

		Animal catAnimal = new Cat();
		catAnimal.run();

		animalRun(dog);
		animalRun(cat);
	}

	public static void animalRun(Animal animal) {
		animal.run();
	}

}
