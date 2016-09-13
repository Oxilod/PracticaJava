package practica3;

/**
 * Created by shugu on 07/09/2016.
 */
public class Prueba {
    public static void main(String[] args) {
        Fruta premio1[] = {Fruta.Fresa,Fruta.Fresa,Fruta.Melocoton};
        Fruta premio2[] = {Fruta.Pera, Fruta.Platano, Fruta.Sandia};
        Premio prem = new Premio(premio1,10);
        Maquina maquina = new Maquina(3,10,premio1, premio2);
        maquina.jugar();
    }
}
