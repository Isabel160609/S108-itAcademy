/*Feu una matriu  que contingui algunes cadenes de  text  y numeros. Ordeneu-lo per:  */

package s108Nivell2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String > NumerosyLetras= Arrays.asList("hola","c3po","isabel","o24","josep","44");
		
		/*longitud ( de més curta a més llarga) */
		
		List<String > menorLongitud=NumerosyLetras.stream().sorted(Comparator.comparing(String::length))
				.collect(Collectors.toList());
		System.out.println("ordenada per longitud");
		menorLongitud.forEach(System.out::println);
		
		/*longitud inversa (de  més llarga a  més curta) */
		List<String > majorLongitud=NumerosyLetras.stream().sorted(Comparator.comparing(String::length).reversed())
				.collect(Collectors.toList());
		
		System.out.println("ordenada per longitud inversa");
		majorLongitud.forEach(System.out::println);
		
		/*alfabèticament pel primer caràcter ( Nota: charAt (0) retorna el  codi numèric del primer  caràcter) */
		
		List<String > alfabeticament=NumerosyLetras.stream().sorted(Comparator.comparing(i->i.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println("ordenada alfabeticament");
		alfabeticament.forEach(System.out::println);
		
		/*Les cadenes que contenen "e" primer, tota la resta en segon lloc. De moment , poseu el 
		 * codi directament a la lambda.  */
		
		List<String > tenenE=NumerosyLetras.stream().sorted(Comparator.comparing(i->!i.contains("e")))
				.collect(Collectors.toList());
		
		System.out.println("ordenada Les cadenes que contenen \"e\" primer");
		tenenE.forEach(System.out::println);
		
		/*Modifica tots els elements de la  matriu per canviar els caracters  “a” a “4”  */
		
		List<String > canviaAPer4=NumerosyLetras.stream().map(x->x.replace("a", "4"))
				.collect(Collectors.toList());
		
		System.out.println("ordenada Les cadenes que contenen \"e\" primer");
		canviaAPer4.forEach(System.out::println);
		
		//Mostra només els elements que siguin 100% numerics . (tot i que  estigui guardats com strings) 
		
		List<String > nomesNumeros=NumerosyLetras.stream().filter(x->x.matches("[0-9]+"))
				.collect(Collectors.toList());
		
		System.out.println("Mostra només els elements que siguin 100% numerics ");
		nomesNumeros.forEach(System.out::println);
		
		
		/*Crea una Functional Interface que continga un mètode abstracte operacio (), que retorne un valor float;
		 *  injecta a la interfície creada mitjançant una lambda el cos del mètode, de manera que pugis transformar
		 *   la operació a una suma, resta, multiplicació i divisio. */
		
		System.out.println("la suma es: "+operar("suma",3.1f,1.5f).operacio());
		System.out.println("la resta es: "+operar("resta",1.1f,1.2f).operacio());
		System.out.println("la multiplicacio es: "+operar("\"la suma es: \"+",3.1f,1.5f).operacio());
		System.out.println("la divisio es: "+operar("divisio",3.1f,1.5f).operacio());
	}
	public static MiOperacion operar(String tipoOperacio,float a,float b) {
		MiOperacion tipoOperacion;
		if (tipoOperacio.equals("suma")) {
			tipoOperacion=()->a+b;
		}else if(tipoOperacio.equals("resta")) {
			tipoOperacion=()->a-b;
		}else if(tipoOperacio.equals("\"la suma es: \"+")) {
			tipoOperacion=()->a*b;
		}else{
			tipoOperacion=()->a/b;
			
		}
		return tipoOperacion;
		
	}
}
