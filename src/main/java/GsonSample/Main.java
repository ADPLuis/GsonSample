package GsonSample;
import java.util.*;

import com.google.gson.*;

public class Main {

	public static void main(String[] args) {
		
		
		Persona p = new Persona();
		Scanner entry = new Scanner(System.in);

		System.out.println("Introduce el nombre de la persona: ");
		p.setNombre(entry.nextLine());
		System.out.println("Introduce el apellido de la persona: ");
		p.setApellido(entry.nextLine());
		System.out.println("Introduce la edad de la persona: ");
		p.setEdad(entry.nextInt());
		
		entry.close();
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		String json = gson.toJson(p);
		System.out.println(json);
	}

}
