import java.util.List;

public class AnalizadorPartido {

    public static Jugador obtenerMaximoGoleador(List<Jugador> equipo1, List<Jugador> equipo2) {
        Jugador maxGoleador = null;

        for (Jugador j : equipo1) {
            if (maxGoleador == null || j.getGolesEnPartido() > maxGoleador.getGolesEnPartido()) {
                maxGoleador = j;
            }
        }

        for (Jugador j : equipo2) {
            if (maxGoleador == null || j.getGolesEnPartido() > maxGoleador.getGolesEnPartido()) {
                maxGoleador = j;
            }
        }

        return maxGoleador;
    }
}
