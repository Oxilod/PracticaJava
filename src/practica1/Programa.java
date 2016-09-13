package practica1;

/**
 * Created by shugu on 05/09/2016.
 */
public class Programa {
    public static void main(String[] args) {
        Punto punto1 = new Punto(5,7);          //Creamos el punto1
        Punto punto2 = new Punto();             //Creamos el punto2
        System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());         //Mostramos por consola el valor de x e y del punto2
        Punto punto3 = new Punto(punto1);           //Creamos el punto3 apartir de las coordenadas del punto1
        System.out.println("X: " + punto3.getX() + " Y: " + punto3.getY());         //Mostramos por consola el valor de x e y del punto2
        Punto punto[] = new Punto[4];           //Creamos un array de puntos con los puntos anteriores
        Punto punto4 = new Punto(0,0);
        punto[0] = punto1;
        punto[1] = punto2;
        punto[2] = punto3;
        punto[3] = punto4;
        for (int i = 0; i<punto.length; i++){           //Recorremos el array de puntos y mostramos por consola el valor de x e y de cada punto
            System.out.println("X: " + punto[i].getX() + " Y: " + punto[i].getY());
        }

        punto2.setX(4);             //Modificamos el valor de la x del punto2
        punto2.setY(6);
        System.out.println("X: " + punto2.getX() + " Y: " + punto2.getY());         //Mostramos por consola el valor de x e y del punto2
        System.out.println("X: " + punto[1].getX() + " Y: " + punto[1].getY());         //Mostramos por consola el valor de x e y de la segunda posicion del array
        System.out.println(punto1.adyacente(punto3));           //Mostramos por consola si el punto1 y el punto3 son adyacentes

        Punto punto5 = new Punto(2,3);
        Punto punto6 = new Punto(8,10);
        System.out.println(punto1.mayorDistancia(punto));
        System.out.println(punto1.distancia(punto4));
        System.out.println(punto5.distancia(punto6));
    }
}
