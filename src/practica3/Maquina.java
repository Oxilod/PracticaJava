package practica3;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

/**
 * Created by shugu on 07/09/2016.
 */
public class Maquina extends Premio {
    private final int numeroCasillas;
    private int jugada[];
    private int precioJugada;
    private static int credito = 15;
    private int creditoRestante;
    private Fruta premios[];
    private Fruta premios2[];

    public Maquina(int numeroCasillas, int precioJugada, Fruta premios[], Fruta premios2[]){
        this.numeroCasillas = numeroCasillas;
        this.precioJugada = precioJugada;
        this.premios = Arrays.copyOf(premios,numeroCasillas);
        this.premios2 = Arrays.copyOf(premios2, numeroCasillas);
    }

    public void incrementarCredito(int incremento){
        credito += credito;
    }

    public int cobrar(){
        creditoRestante = credito;
        credito = 0;
        System.out.println(credito);
        System.out.println(creditoRestante);
        return credito;
    }

    public void jugar(){
            int i = 0;
            credito = credito - precioJugada;
            jugada = new int[numeroCasillas];
            Random generator = new Random();
            while (i <= jugada.length-1) {
                jugada[i] = generator.nextInt(5);
                if (jugada[i] == Fruta.Fresa.getValue()) {
                    System.out.println("Fresa");
                } else if (jugada[i] == Fruta.Sandia.getValue()) {
                    System.out.println("Sandia");
                } else if (jugada[i] == Fruta.Platano.getValue()) {
                    System.out.println("Platano");
                } else if (jugada[i] == Fruta.Melocoton.getValue()) {
                    System.out.println("Melocoton");
                } else if (jugada[i] == Fruta.Pera.getValue()) {
                    System.out.println("Pera");
                }
                i++;
            }
        if (jugada.equals(premios)){                        //Nu aplica premiu la combinatie castigatoare
            incrementarCredito(getCantidadPremio());
            System.out.println("GANADOR!!!");
        }
        if (jugada.equals(premios2)){
            incrementarCredito(getCantidadPremio());
            System.out.println("GANADOR PREMIO2 ");
        }
        System.out.println(credito);
    }

    public int getNumeroCasillas(){
        return numeroCasillas;
    }
}
