package practica4;

/**
 * Created by ioangiurgiu on 09/09/16.
 */
public class Listas {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Juan", 100);
        Usuario u2 = new Usuario("Pedro", 150);
        Usuario u3 = new Usuario("Enrique",300);
        Subastas subasta = new Subastas("Telefono movil",u1);
        subasta.pujar(u2, 100);
        System.out.println(subasta.getPujas().getLast());
        System.out.println(subasta.getUsuarios().getLast().getNombre());
        subasta.pujar(u3, 50);
        System.out.println(subasta.getPujas().getLast());
        subasta.ejecutarSubasta();
        subasta.pujar(u2, 200);
        System.out.println(u1.getCredito() + " Nombre: " + u1.getNombre() );
        System.out.println(u2.getCredito() + " Nombre: " + u2.getNombre() );
        System.out.println(u3.getCredito() + " Nombre: " + u3.getNombre());
    }
}
