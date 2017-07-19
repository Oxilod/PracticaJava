package practica4;

public class SubastaLimitada extends Subastas {

    private int limiteSubasta;
    private int counter;

    SubastaLimitada(String nombreProducto, Usuario propietario, int limiteSubasta) {
        super(nombreProducto, propietario);
        setNombreProducto(nombreProducto);
        setPropietario(propietario);
        setLimiteSubasta(limiteSubasta);
    }

    public void pujar(Usuario usuario, int cantdadPuja){
        if (getPujasSize() < limiteSubasta){
            super.pujar(usuario, cantdadPuja);
        }else if (getPujasSize() == limiteSubasta){
            ejecutarSubasta();
        }
    }
    void pujasPendientes(){
        if (limiteSubasta <=1){
            System.out.println("Subasta ejecutada");
        }else {
            System.out.println("Subastas pendientes: " + (limiteSubasta - (getPujasSize() - 1)));
        }
    }
    void setLimiteSubasta(int limiteSubasta){
        this.limiteSubasta = limiteSubasta;
    }
}
