package construtores;

public class ConstrutorConsulta {

	public static void main(String[] args) {

		Consulta consulta1 = new Consulta ("13", "Ananda", "Rebecca");
		Consulta consulta2 = new Consulta("14", "Olga", "Luzia");
		Consulta consulta3 = new Consulta("15", "Carla", "Bianca");

		System.out.println(consulta1.getdata());
		System.out.println(consulta1.getnomeDents());
		System.out.println(consulta1.getnomePcnt());
		System.out.println(consulta2.getdata());
		System.out.println(consulta2.getnomeDents());
		System.out.println(consulta2.getnomePcnt());
		System.out.println(consulta3.getdata());
		System.out.println(consulta3.getnomeDents());
		System.out.println(consulta3.nomePcnt);

	}
}


