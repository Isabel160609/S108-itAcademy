/*Crea una Functional Interface que continga  un m�tode abstracte getPiValue (), que retorn a un valor double;
 *  en una  altra classe, instancie la  interf�cie i assigneu-li  mitjan�ant una lambda el valor 3.1415. Invoca 
 *   el  m�tode getPiValue de la  inst�ncia d'interf�cie i  imprimeix el resultat . */
package s108Nivell1Fase2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiClase clase=new MiClase();
		double respuesta=clase.getPiValue();
		System.out.println(respuesta);

	}

}
