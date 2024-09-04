package exercicios;

import java.util.Random;

public class Exercicio_5 {

	//UTF-8
	
    public static void main(String[] args) {
        
        Lampada[] lampadas = new Lampada[3];
        Interruptor[] interruptores = new Interruptor[3];

       
        for (int i = 0; i < 3; i++) {
            lampadas[i] = new Lampada(i);
            interruptores[i] = new Interruptor(i);
        }

      
        Random random = new Random();
        for (int i = 0; i < 3; i++) {
            int lampadaIndex;
            do {
                lampadaIndex = random.nextInt(3);
            } while (lampadas[lampadaIndex].getInterruptor() != null);
            lampadas[lampadaIndex].setInterruptor(interruptores[i]);
        }

     
        simularDescoberta(interruptores, lampadas);
    }

    private static void simularDescoberta(Interruptor[] interruptores, Lampada[] lampadas) {
       
        interruptores[0].ligar();
        System.out.println("Interruptor 1 ligado.");

       
        tentarEsperar(2000); 

      
        interruptores[0].desligar();
        interruptores[1].ligar();
        System.out.println("Interruptor 1 desligado. Interruptor 2 ligado.");

      
        tentarEsperar(1000); 

        
        identificarLampadas(lampadas, interruptores);
    }

    private static void identificarLampadas(Lampada[] lampadas, Interruptor[] interruptores) {
        for (Lampada lampada : lampadas) {
            if (lampada.isAcesa()) {
                System.out.println("Lâmpada " + lampada.getId() + " está acesa. Controlada pelo interruptor " + lampada.getInterruptor().getId());
            } else if (lampada.isQuente()) {
                System.out.println("Lâmpada " + lampada.getId() + " está quente. Controlada pelo interruptor " + lampada.getInterruptor().getId());
            } else {
                System.out.println("Lâmpada " + lampada.getId() + " está fria. Controlada pelo interruptor " + lampada.getInterruptor().getId());
            }
        }
    }

    private static void tentarEsperar(long milissegundos) {
        try {
            Thread.sleep(milissegundos);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

class Interruptor {
    private int id;
    private boolean ligado;

    public Interruptor(int id) {
        this.id = id;
        this.ligado = false;
    }

    public void ligar() {
        ligado = true;
    }

    public void desligar() {
        ligado = false;
    }

    public boolean isLigado() {
        return ligado;
    }

    public int getId() {
        return id;
    }
}

class Lampada {
    private int id;
    private Interruptor interruptor;
    private boolean acesa;
    private boolean quente;

    public Lampada(int id) {
        this.id = id;
        this.acesa = false;
        this.quente = false;
    }

    public void setInterruptor(Interruptor interruptor) {
        this.interruptor = interruptor;
        if (interruptor.isLigado()) {
            acesa = true;
            quente = true; 
        }
    }

    public Interruptor getInterruptor() {
        return interruptor;
    }

    public int getId() {
        return id;
    }

    public boolean isAcesa() {
        return acesa;
    }

    public boolean isQuente() {
        return quente;
    }
}
	

