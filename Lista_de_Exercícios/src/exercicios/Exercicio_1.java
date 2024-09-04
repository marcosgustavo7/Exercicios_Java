package exercicios;

import java.util.Scanner;
public class Exercicio_1 {

	//UTF-8
	
	   public static boolean isFibonacci(int numero)
{
	        if (numero < 0) {
	            return false; 
	        }

	        int a = 0;
	        int b = 1;

	     
	        if (numero == a || numero == b) {
	            return true;
	        }

	   
	        while (b < numero) {
	            int next = a + b;
	            a = b;
	            b = next;

	            if (b == numero) {
	                return true;
	            }
	        }

	    
	        return false;
	    }

	    public static void main(String[] args) {
	       
	        Scanner scanner = new Scanner(System.in);

	    
	        System.out.print("Digite um numero: ");
	        int numero = scanner.nextInt();

	       
	        if (isFibonacci(numero)) {
	            System.out.println(numero + " está na sequência de Fibonacci.");
	        } else {
	            System.out.println(numero + " não está na sequência de Fibonacci.");
	        }

	       
	        scanner.close();
	    }
	}
