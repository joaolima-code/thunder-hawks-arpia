package arpiaSegundaSemana;
import java.util.Scanner;

//1) Usuario vai entrar com 5 valores (numeros naturais) e ser� exibido o maior valor informado

//Ex: INPUT => "Digite o valor 1 / Digite o valor 2/" ...  OUTPUT => "O Maior valor informado � XXX"

public class ExercicioUm {

	public static void main(String[] args) {
		
	Scanner scan = new Scanner (System.in);

	
	int maiorNumero = 0;
	
	
	for (int i=1; i <= 5 ; i++) {
        
         int numerosDigitados; 
         
	    do {
        	System.out.println("Digite o " + i + "� n�mero natural: ");
        	numerosDigitados = scan.nextInt();
	 
	 }  while(numerosDigitados < 0);
	    
	    if  (numerosDigitados > maiorNumero){
            maiorNumero = numerosDigitados;
	  
            }
	 
	} System.out.println("O maior n�mero natural digitado foi " + maiorNumero + "!");	 

    }
}