/*Crea una Functional Interface que continga  un mètode abstracte getPiValue (), que retorn a un valor double;
 *  en una  altra classe, instancie la  interfície i assigneu-li  mitjançant una lambda el valor 3.1415. Invoca 
 *   el  mètode getPiValue de la  instància d'interfície i  imprimeix el resultat . */
package s108Nivell1Fase2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiClase clase=new MiClase();
		double respuesta=clase.getPiValue();
		System.out.println(respuesta);

	}

}
