package practica4;

/**
 * Created by ioangiurgiu on 09/09/16.
 */
public class Usuario {
    private final String nombre;
    private int credito;

    public Usuario(String nombre){
        this.nombre = nombre;
    }
    public Usuario(String nombre, int credito){
        this.nombre  = nombre;
        this.credito = getCredito() + credito;
    }

    public void incrementarSaldo(int incremento){
        credito = credito + incremento;
    }
    public void decrementarSaldo(int decremento){
        if (credito >= decremento){
            credito = credito - decremento;
        }else
            System.out.println("Saldo insuficiente");
    }
    public int getCredito(){
        return credito;
    }

    public String getNombre(){
        return nombre;
    }
}
