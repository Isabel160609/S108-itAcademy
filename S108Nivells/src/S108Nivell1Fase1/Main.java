/*Tenint una llista de cadenes de noms propis, */
package S108Nivell1Fase1;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> cadenes = new ArrayList<String>();
		cadenes.add("Josep");
		cadenes.add("Ana");
		cadenes.add("Isabel");
		cadenes.add("Arnau");
		cadenes.add("ana");
		/* escriu un mètode que retorn e una llista de totes les cadenes que  comencen 
		 * amb la lletra 'a' (mayuscula ) i  tenen exactament 3  lletres. Imprimeix el resultat . */
		System.out.println("comencen per A");
		cadenes.stream().filter(x->x.startsWith("A") && x.length()==3).forEach(System.out::println);
		
		/*Escriu un mètode que retorne una cadena separada per comes basada en una llista d’Integers.
		 *  Cada element  hauria d'anar precedit per la  lletra  "e" si el nombre és parell , i precedit de la lletra 
		 *   "o" si el nombre és im parell. Per exemple, si la llista  d'entrada és (3,44), la  sortida hauria
		 *    de ser "o3, e44".  Imprimeix el  resultat.*/
		
		
		List<Integer> numeros= new ArrayList<Integer>();
		 numeros.add(1);
		 numeros.add(22);
		 numeros.add(34);
		 numeros.add(17);
		 
		 System.out.println("parells o senars");
		 
		 numeros.forEach(x-> {
			 if (x%2==0)System.out.print("o"+x+", ");
			 else System.out.print("e"+x+", ");
		 });
		System.out.println();
		/*Tenint una llista de Strings, escriu un mètode  que retorne una llista de totes les  cadenes  que continguen 
		 * la lletra ‘o’ i  imprimeix el resultat . */
		 
		System.out.println("tenen una o ");
		 cadenes.stream().filter(x->x.contains("o")).forEach(System.out::println);
		 
		 /*Has de fer el mateix que en el punt anterior,  però retornant una llista que  incloga els elements amb
		  *   més de 5 lletres. Imprimeix  el  resultat. */
		 
		 System.out.println("tenen una o o mes de 5 lletres");
		 cadenes.stream().filter(x->x.contains("o")||x.length()>5).forEach(System.out::println);
		 
		 /*Crea una llista amb  els nombs dels mesos de  l’any. Imprimeix tots els  elements de la llista amb  una lambda. */
		 ArrayList<String> ListMeses=new ArrayList<String>();
			
			ListMeses.add("Enero");
			ListMeses.add("Febero");
			ListMeses.add("Marzo");
			ListMeses.add("Abril");
			ListMeses.add("Mayo");
			ListMeses.add("Junio");
			ListMeses.add("Julio");
			ListMeses.add("Aosto");
			ListMeses.add("Septiembre");
			ListMeses.add("Octubre");
			ListMeses.add("Noviembre");
			ListMeses.add("Diciembre");
			
			System.out.println("llista mesos amb lambda");
			
			ListMeses.forEach(x->System.out.println(x));
			
			/*Has de  fer la mateixa impressió del punt  anterior  però fent-ho mitjançant method   reference*/
			System.out.println("llista mesos amb method reference");
			
			ListMeses.forEach(System.out::println);
			
	}
	
	

}
