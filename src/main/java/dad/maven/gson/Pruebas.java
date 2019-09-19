package dad.maven.gson;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Pruebas {

	
		public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		String nombre,apellidos;
		int edad;
		System.out.println("Introduce nombre: ");
		nombre=entrada.nextLine();
		System.out.println("Introduce apellidos: ");
		apellidos=entrada.nextLine();
		System.out.println("Introduce edad: ");
		edad=entrada.nextInt();
		entrada.close();
		Persona p= new Persona(nombre,apellidos,edad);
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
		
}
}
