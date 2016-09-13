package practica4;

/**
 * Created by ioangiurgiu on 09/09/16.
 */
public class Puja {
    private Usuario usuario;
    private int oferta;

    public Puja(Usuario usuario, int oferta){
        this.usuario = usuario;
        this.oferta = oferta;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public int getOferta() {
        return oferta;
    }

    public void setOferta(int oferta) {
        this.oferta = oferta;
    }

}
