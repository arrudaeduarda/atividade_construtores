package construtores;

public class ConstrutorAnimal {

	public static void main(String[] args) {
	Animal animal1 = new Animal ("branca", 200);
	Animal animal2 = new Animal ("azul", 543);
	Animal animal3 = new Animal ("verde", 345);
	
	System.out.println(animal1.getcor());
	System.out.println(animal1.gettamanho());
	System.out.println(animal2.getcor());
	System.out.println(animal2.gettamanho());
	System.out.println(animal3.getcor());
	System.out.println(animal3.gettamanho());

	}

}
