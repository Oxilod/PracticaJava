package practica4;


public class Pruebas {
    public static void main(String[] args) {
        Usuario u1 = new Usuario("Juan", 100);
        Usuario u2 = new Usuario("Pedro", 150);
        Usuario u3 = new Usuario("Enrique",300);
        Subastas subasta = new Subastas("Telefono movil",u1);
        SubastaLimitada subastaLimitada = new SubastaLimitada("Casa", u1, 6);
        subasta.pujar(u2, 100);
        subastaLimitada.pujar(u2, 20);
        subastaLimitada.pujasPendientes();
        System.out.println(subasta.getUsuarios().getLast().getNombre() + " ha pujado: " + subasta.getPujas().getLast());
        subasta.pujar(u3, 50);
        System.out.println("La mayor puja es: " + subasta.getPujas().getLast());
        subasta.ejecutarSubasta();
        subasta.pujar(u2, 200);
        System.out.println(u1.getNombre() + " tiene: " + u1.getCredito() + " creditos" );
        System.out.println(u2.getNombre() + " tiene: " + u2.getCredito() + " creditos" );
        System.out.println(u3.getNombre() + " tiene: " + u3.getCredito() + " creditos" );
        SubastaTemporal subastaTemporal = new SubastaTemporal("Casa", u2, 24);
        subastaTemporal.getTime();
        System.out.println(u3.getNombre());
        subastaTemporal.getTime();
        subastaTemporal.getTime();
        subastaTemporal.getTime();
    }
}
