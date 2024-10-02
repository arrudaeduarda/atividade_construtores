package construtores;

public class ConstrutorCarro {

	public static void main(String[] args) {
		Carro carro1 = new Carro("fusca",5432);
		Carro carro2 = new Carro("Mercedes", 1234);
		Carro carro3 = new Carro("Opalla", 4321);
		
		System.out.println(carro2.getplaca());
		System.out.println(carro2.getnumChassi());
		System.out.println(carro3.getplaca());
		System.out.println(carro3.getnumChassi());
		System.out.println(carro1.getplaca());

	}

}
