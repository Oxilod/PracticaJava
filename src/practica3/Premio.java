package practica3;

import java.util.Arrays;

/**
 * Created by shugu on 07/09/2016.
 */
public class Premio {
    private static Fruta premios[];
    private String nombre;
    private int cantidadPremio;

    public Premio(Fruta premios[], int cantidadPremio){
        this.cantidadPremio = cantidadPremio;
        this.premios = Arrays.copyOf(premios,3);
    }

    public Premio() {
    }

    public Fruta[] getPremios(){
        return premios;
    }

    public String getFruta(int i){
        nombre = premios[i].name();
        return nombre;
    }

    public int valueOfFruta(Fruta  fruta){
        return fruta.getValue();
    }

    public int getCantidadPremio(){
        return cantidadPremio;
    }

}