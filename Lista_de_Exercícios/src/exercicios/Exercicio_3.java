package exercicios;

public class Exercicio_3 {
	
	//UTF-8

    public static void main(String[] args) {
     
        int indice = 12;
        int soma = 0;
        int k = 1;

     
        while (k < indice) {
            k = k + 1;  
            soma = soma + k;  
        }

      
        System.out.println("O valor final de SOMA é: " + soma); //77
    }
}
