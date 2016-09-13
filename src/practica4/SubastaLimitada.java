package practica4;

/**
 * Created by ioangiurgiu on 13/09/16.
 */
public class SubastaLimitada extends Subastas {

    private int limiteSubasta;
    private int counter;

    public SubastaLimitada(String nombreProducto, Usuario propietario, int limiteSubasta) {
        super(nombreProducto, propietario);
        setNombreProducto(nombreProducto);
        setPropietario(propietario);
        this.limiteSubasta = limiteSubasta;
    }

    public void pujar(Usuario usuario, int cantdadPuja){
        if (getPujasSize() < limiteSubasta){
            super.pujar(usuario, cantdadPuja);
        }else if (getPujasSize() == limiteSubasta){
            ejecutarSubasta();
        }
    }
}
