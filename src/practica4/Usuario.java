package practica4;


public class Usuario{
    private final String nombre;
    private int credito;
    // Falta lista de pujas de cada usuario.

    public Usuario(String nombre){
        this.nombre = nombre;
    }
    Usuario(String nombre, int credito){
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
