package exerciciosApostila2007;
import java.util.Scanner;
public class Ex05Antecessor {
	
public static void main(String[] args) {
	Scanner scn = new Scanner (System.in);


System.out.print("Digite um n�mero:");
	int numero = scn.nextInt();
	int antecessor = numero - 1;
	System.out.println("O antecessor de " + numero + " � " + antecessor + ".");
	
	scn.close();


}
	
	
	
}
