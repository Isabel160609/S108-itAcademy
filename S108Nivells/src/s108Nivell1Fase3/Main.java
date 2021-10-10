/*Crea  una Functional Interface que conting a un mètode abstracte reverse (), que retorn e un valor String;
 *  en una  altra classe,  injecta a la interfície  creada mitjançant una lambda el cos de l  mètode, de manera
 *   que torne la  mateixa cadena que rep  com a paràmetre  però a l'inrevés. Invo ca la instància de la  interfície
 *    passant-li una cadena i  comprovant el resultat. */

package s108Nivell1Fase3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MiInterface stringAlReves=(cadena)->{
			String resultado="";
			for (int i =cadena.length()-1;i>=0;i--) {
				resultado+=cadena.charAt(i);
			}
			return resultado;
		};
		System.out.println(stringAlReves.reverse("Hola it academy"));
	}

}
