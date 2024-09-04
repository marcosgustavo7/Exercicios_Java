package exercicios;
import java.util.Scanner;

public class Exercicio_2 {

	//UTF-8

		    public static void main(String[] args) {
		 
		        Scanner scanner = new Scanner(System.in);

		
		        System.out.print("Digite uma string: ");
		        String entrada = scanner.nextLine();

		   
		        scanner.close();

		  
		        int contagem = contagemDeVezes(entrada);

		  
		        if (contagem > 0) {
		            System.out.println("A letra A  aparece " + contagem + " vezes na string.");
		        } else {
		            System.out.println("A letra A  não está na string.");
		        }
		    }


		    private static int contagemDeVezes(String entrada) {
		        int contagem = 0;
	
		        String minuscula = entrada.toLowerCase();
		        
		
		        for (char c : minuscula.toCharArray()) {
		            if (c == 'a') {
		            	contagem++;
		            }
		        }
		        
		        return contagem;
		    }
		}


