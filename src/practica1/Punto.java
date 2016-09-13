package practica1;


import practica2.Direccion;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static java.lang.Math.*;

/**
 * Created by shugu on 05/09/2016.
 */
public class Punto {
    private double x;
    private double y;

    public Punto(double x, double y){
        this.x = x;
        this.y = y;
    }

    public Punto(){
        x = 0;
        y = 0;
    }

    public Punto(Punto punto){
        x = punto.getX();
        y = punto.getY();
    }

    public boolean adyacente(Punto punto){
        if ((x+1) == punto.getX() || (x-1) == punto.getX()){
            return true;
        }else if ((y+1) == punto.getY() || (y-1) == punto.getY()){
            return true;
        }else return false;
    }

    public double distancia(Punto punto){
        return sqrt(((punto.getX()-x)*(punto.getX()-x))+((punto.getY()-y)*(punto.getY()-y)));
    }

    public void desplazar(double x, double y){
        setX(this.x + x);
        setY(this.y + y);
    }

    public void desplazar(Direccion direccion){
        if (direccion == Direccion.ARRIBA){
            setX(x+1);
        }else if (direccion == Direccion.ABAJO){
            setX(x-1);
        }else if (direccion == Direccion.DERECHA){
            setY(y+1);
        }else if (direccion == Direccion.IZQUIERDA){
            setY(y-1);
        }
    }

    public Punto mayorDistancia(Punto puntos[]){
        int i = 0;
        double a = 0;
        ArrayList lista = new ArrayList();
        Punto punto = new Punto(this.x,this.y);
        for (Punto yo : puntos){
            lista.add(yo.distancia(punto));
        }
        Object obj = Collections.max(lista);
        i = lista.indexOf(obj) + 1;
        return Arrays.asList(puntos).get(i-1);
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }
    }
