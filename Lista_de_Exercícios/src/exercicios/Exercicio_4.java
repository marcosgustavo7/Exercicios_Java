package exercicios;

public class Exercicio_4 {


	//UTF-8
	
    public static void main(String[] args) {
      
        int a1 = 1, a2 = 3, a3 = 5, a4 = 7;
        int proximoA = a4 + 2;
        System.out.println("a) 1, 3, 5, 7, ___ é: " + proximoA);

        
        int b1 = 2, b2 = 4, b3 = 8, b4 = 16, b5 = 32, b6 = 64;
        int proximoB = b6 * 2;
        System.out.println("b) 2, 4, 8, 16, 32, 64, ____ é: " + proximoB);

      
        int c1 = 0, c2 = 1, c3 = 4, c4 = 9, c5 = 16, c6 = 25, c7 = 36;
        int proximoC = (int) Math.pow(Math.sqrt(c7) + 1, 2);
        System.out.println("c) 0, 1, 4, 9, 16, 25, 36, ____ é: " + proximoC);

      
        int d1 = 4, d2 = 16, d3 = 36, d4 = 64;
        int proximoD = (int) Math.pow(Math.sqrt(d4) + 2, 2);
        System.out.println("d) 4, 16, 36, 64, ____ é: " + proximoD);

    
        int e1 = 1, e2 = 1, e3 = 2, e4 = 3, e5 = 5, e6 = 8;
        int proximoE = e5 + e6;
        System.out.println("e) 1, 1, 2, 3, 5, 8, ____ é: " + proximoE);

   
        int f1 = 2, f2 = 10, f3 = 12, f4 = 16, f5 = 17, f6 = 18, f7 = 19;
        int proximoF = f7 + 1; 
        System.out.println("f) 2, 10, 12, 16, 17, 18, 19, ____ é: " + proximoF);
    }
}
