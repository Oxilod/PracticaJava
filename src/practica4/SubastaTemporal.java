package practica4;

public class SubastaTemporal extends SubastaLimitada {
    private static long timer;
    private static final int SECOND = 1000;
    private static final int MINUTE = 60 * SECOND;
    private static final int HOUR = 60 * MINUTE;
    private static final int DAY = 24 * HOUR;

    SubastaTemporal(String nombreProducto, Usuario propietario, int limiteTiempo){
        super(nombreProducto, propietario, limiteTiempo);
        setNombreProducto(nombreProducto);
        setPropietario(propietario);
        setLimiteSubasta(limiteTiempo*2);
        limiteTiempo = limiteTiempo * 3600000;
        System.out.println(limiteTiempo);
        timer = System.currentTimeMillis() + limiteTiempo;
    }

    public long getTimer() {
        return timer;
    }

    void getTime(){

// TODO: this is the value in ms

        StringBuffer text = new StringBuffer("");
        if (timer > DAY) {
            text.append(timer / DAY).append(" days ");
            timer %= DAY;
        }
        if (timer > HOUR) {
            text.append(timer / HOUR).append(" hours ");
            timer %= HOUR;
        }
        if (timer > MINUTE) {
            text.append(timer / MINUTE).append(" minutes ");
            timer %= MINUTE;
        }
        if (timer > SECOND) {
            text.append(timer / SECOND).append(" seconds ");
            timer %= SECOND;
        }
        text.append(timer + " ms");
        System.out.println(text.toString());
    }
}
