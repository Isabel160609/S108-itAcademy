/*Crea una clase Alumne que tingui com a  propietats: Nom, edat, curs i nota.  Omple la llista amb 10 alumnes */
package s108Nivell3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Alumne>alumnes=new ArrayList<Alumne>();
		
		alumnes.add(new Alumne("Isabel",18,"PHP",8));
		alumnes.add(new Alumne("Josep",12,"Java",10));
		alumnes.add(new Alumne("Toni",20,"Python",9));
		alumnes.add(new Alumne("Dani",19,"Angular",6));
		alumnes.add(new Alumne("Ana",18,"React",4));
		alumnes.add(new Alumne("Raul",18,"Node",9));
		alumnes.add(new Alumne("Maria",20,"PHP",3));
		alumnes.add(new Alumne("Eva",19,"PHP",8));
		alumnes.add(new Alumne("Sandra",20,"Java",7));
		alumnes.add(new Alumne("Manel",18,"Java",5));
		
		
		/*Mostra per pantalla el nom i l’edat de cada alumne . */
		System.out.println("nom i l’edat de cada alumne");
		alumnes.forEach(x->System.out.println(x.getNom()+" "+x.getEdat()+"anys"));
		
		/*Filtra la llista per tots els alumnes que el  nom comensi per “a”, asigna-ho a un altre  llista
		 *  y  mostra per pantalla la nova llista (tot  amb lambdas) */
		
		System.out.println(" alumnes que el  nom comensi per a");
		List<Alumne> empiezaA=alumnes.stream().filter(x->x.getNom().startsWith("A")).collect(Collectors.toList());
		empiezaA.forEach(System.out::println);
		
		/*Filtra y mostra per pantalla els alumnes que  tinguin un 5 o mes de nota. */
		
		System.out.println("alumnes que  tinguin un 5 o mes de nota");
		alumnes.stream().filter(x->x.getNota()>=5).forEach(x->System.out.println(x.getNom()+", "+ x.getCurs()+", "+ x.getNota()));
		
		/*Filtra y mostra per pantalla els alumnes que  tinguin un 5 o mes de nota y que no siguin  de PHP. */
		
		System.out.println("alumnes que  tinguin un 5 o mes de notay que no siguin  de PHP");
		alumnes.stream().filter(x->x.getNota()>=5&& !x.getCurs().equalsIgnoreCase("PHP")).forEach(x->System.out.println(x.getNom()+", "+ x.getCurs()+", "+ x.getNota()));
		
		/*Mostra tots  els alumnes que facin JAVA i siguin   majors d’edat. */
		System.out.println("alumnes que facin JAVA i siguin   majors d’edat");
		alumnes.stream().filter(x-> x.getCurs().equalsIgnoreCase("Java")&& x.getEdat()>=18).forEach(x->System.out.println(x.getNom()+", "+ x.getCurs()+", "+ x.getEdat()));
	}

}
