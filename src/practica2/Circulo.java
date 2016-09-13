package practica2;

import practica1.Punto;


/**
 * Created by shugu on 05/09/2016.
 */
public class Circulo extends Punto {
    private Punto centro = new Punto();
    private int radio = 5;
    private double perimetro = (2*Math.PI*radio);

    public Circulo(Punto centro, int radio){
        this.centro = centro;
        this.radio = radio;
    }

    public Circulo(int x, int y, int radio){
        centro.setX(x);
        centro.setY(y);
        this.radio = radio;
    }

    public Circulo(Circulo circulo){
        circulo.radio = radio;
        circulo.centro = centro;
        circulo.perimetro = perimetro;
    }

    public void desplazar(int x, int y){
        Punto punto = new Punto(y,x);
        centro = punto;
    }

    public int escalar(int porciento){
        radio = radio + (radio*(porciento)/100);
        return radio;
    }

    public boolean estaSolapado(Circulo circulo){
        boolean solapado;
        if ((circulo.getCentro().distancia(centro)>radio+circulo.getRadio())){
            solapado = false;
        }else {
            solapado = true;
        }
        return solapado;
    }

    public Punto getCentro() {
        return centro;
    }

    public int getRadio() {
        return radio;
    }
}
