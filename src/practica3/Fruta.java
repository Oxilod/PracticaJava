package practica3;

/**
 * Created by shugu on 07/09/2016.
 */
public enum Fruta {
    Fresa(0), Sandia(1), Platano(2), Melocoton(3), Pera(4);

    private final int i;

    Fruta(int i) {
        this.i = i;
    }

    public int getValue(){
        return i;
    }
}
