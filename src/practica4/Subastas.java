package practica4;


import java.util.*;

/**
 * Created by ioangiurgiu on 09/09/16.
 */
public class Subastas{
    private String nombreProducto;
    private Usuario propietario;
    private boolean abierta = false;
    private boolean pujaAceptada = false;
    private boolean ejecutada = false;
    private LinkedList pujas = new LinkedList();
    private LinkedList<Usuario> usuarios = new LinkedList<>();
    // Falta lista de subastas para cada usuario.

    public Subastas(String nombreProducto, Usuario propietario){
        abierta = true;
        this.nombreProducto = nombreProducto;
        this.propietario = propietario;
        pujas.add(0);
        usuarios.add(propietario);
    }

    public void pujar(Usuario usuario, int cantidadPuja){
        if (abierta){
            if (usuario.getCredito() >= cantidadPuja){
                if (propietario != usuario){
                    if (cantidadPuja > ((int)pujas.getLast())){
                        if (cantidadPuja != 0){
                            pujaAceptada = true;
                            pujas.addLast(cantidadPuja);
                            usuarios.addLast(usuario);
                            System.out.println("Usuario " + usuarios.getLast().getNombre() + " ha pujado " + pujas.getLast());
                        }else System.out.println("No puede pujar 0");
                    }else System.out.println("Cantidad pujada insuficiente");
                }else System.out.println("Usted es el propietario de la subasta");
            }else System.out.println("Credito insuficiente");
        }else System.out.println("La puja esta cerrada");
    }

    public void pujar(Usuario usuario){
        if (usuario != propietario){
            if (pujas.getLast() == null){
                pujas.addLast(1);
                usuarios.addLast(usuario);
            }else {
                pujas.addLast(((int) pujas.getLast()) + 1);
                usuarios.addLast(usuario);
            }
        }
    }

    public void ejecutarSubasta(){
        if (pujas != null){
            abierta = false;
            usuarios.getLast().decrementarSaldo(((int)pujas.getLast()));
            propietario.incrementarSaldo(((int)pujas.getLast()));
            ejecutada = true;
        }
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public void setNombreProducto(String nombreProducto){
        this.nombreProducto = nombreProducto;
    }

    public void setAbierta(boolean abierta){
        this.abierta = abierta;
    }

    public boolean isAbierta() {
        return abierta;
    }

    public LinkedList getPujas() {
        return pujas;
    }

    public Usuario getPropietario() {
        return propietario;
    }

    public void setPropietario(Usuario propietario){
        this.propietario = propietario;
    }

    public boolean isPujaAceptada() {
        return pujaAceptada;
    }

    public LinkedList<Usuario> getUsuarios() {
        return usuarios;
    }

    public int getPujasSize(){
        return pujas.size();
    }
}
