package practica2;

import practica1.Punto;

/**
 * Created by shugu on 05/09/2016.
 */
public class Programa {
    public static void main(String[] args) {
        Punto punto1 = new Punto(2,3);              //Punct nou
        punto1.desplazar(3,5);                      //Deplasam punctul 3 unitati pe X si 5 unitati pe Y
        punto1.desplazar(Direccion.ARRIBA);         //Deplasam punctul 1 unitate in sus
        System.out.println("X: " + punto1.getX() + " Y: " + punto1.getY());
        Punto punto2 = new Punto(4,2);              //Punctul 2
        Punto puntos[] = new Punto[2];              //Array de puncte pentru mayorDistancia
        puntos[0] = punto1;
        puntos[1] = punto2;
        System.out.println(punto1.mayorDistancia(puntos));
        Circulo circulo1 = new Circulo(punto1,3);
        Circulo circulo2 = new Circulo(punto1,5);
        circulo1.desplazar(3,2);                    //deplasam Cercul 3 pe X si 2 pe Y
        System.out.println("X: " + circulo1.getCentro().getX() + " Y: " + circulo1.getCentro().getY());
        System.out.println("X: " + circulo2.getCentro().getX() + " Y: " + circulo2.getCentro().getY());
        Punto centro = new Punto(circulo2.getCentro().getX(), circulo2.getCentro().getY());
        centro.desplazar(Direccion.ABAJO);
        System.out.println("X: " + centro.getX() + " Y: " + centro.getY());
        System.out.println(circulo1.estaSolapado(circulo2));
        circulo2.escalar(150);
        System.out.println("X: " + circulo2.getCentro().getX() + " Y: " + circulo2.getCentro().getY() + " radio: " + circulo2.getRadio());
    }
}
