import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

        public static void main(String[] args) {
        
        List<Jugador> jugadores = new ArrayList<>();

        // Crear Jugador y agregarlos a la lista (id, nombre, golesMarcados, partidosJugados)
        Jugador jugador1 = new Jugador(1, "Juan", 5, 10);
        Jugador jugador2 = new Jugador(2, "Carlos", 8, 15);
        Jugador jugador3 = new Jugador(3, "Luis", 3, 7);
        Jugador jugador4 = new Jugador(4, "Raul", 8, 10);
        Jugador jugador5 = new Jugador(5, "Santiago", 6, 15);
        Jugador jugador6 = new Jugador(6, "Chele", 1, 7);
        Jugador jugador7 = new Jugador(7, "Gabriel", 2, 10);
        Jugador jugador8 = new Jugador(8, "Mario", 8, 15);
        Jugador jugador9 = new Jugador(9, "Alfredo", 10, 7);
        Jugador jugador10 = new Jugador(10, "Paquito", 7, 12);

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);
        jugadores.add(jugador7);
        jugadores.add(jugador8);
        jugadores.add(jugador9);
        jugadores.add(jugador10);

        List<Jugador> equipoA = new ArrayList<>();
        List<Jugador> equipoB = new ArrayList<>();
        equipoA.add(jugador1);
        equipoA.add(jugador2);
        equipoA.add(jugador3);
        equipoA.add(jugador4);
        equipoA.add(jugador5);
        equipoB.add(jugador6);
        equipoB.add(jugador7);
        equipoB.add(jugador8);
        equipoB.add(jugador9);
        equipoB.add(jugador10);

        Partido partido = new Partido(equipoA, equipoB, 2, 4);
        System.out.println(partido.DetallesPartido());

        System.out.println("Listado de jugadores con mas de 5 goles: \n");

        //Filtro de jugadores con mas de 5 goles
           List<Jugador> jugadoresFiltrados = jugadores.stream()
            .filter(jugador -> jugador.getGolesMarcados() > 5)
            .collect(Collectors.toList());

            jugadoresFiltrados.forEach(jugador -> System.out.println(jugador));

        // ACTUALIZACION 
        // Simular goles en el partido
        jugador6.anotarGoles(1);
        jugador1.anotarGoles(2);
        jugador8.anotarGoles(1);
        jugador4.anotarGoles(3);
        jugador5.anotarGoles(0);

        // Actualizar estadísticas
        for (Jugador j : equipoA) j.actualizarEstadisticas();
        for (Jugador j : equipoB) j.actualizarEstadisticas();

        // Mostrar estadísticas
        System.out.println("Estadísticas después del partido:\n");
        for (Jugador j : equipoA) j.mostrarEstadisticas();
        for (Jugador j : equipoB) j.mostrarEstadisticas();

        // MAXIMO GOLEADOR 
        Jugador maxGoleador = AnalizadorPartido.obtenerMaximoGoleador(equipoA, equipoB);
        System.out.println("El maximo goleador del partido fue: " +
        maxGoleador.getNombre() + " con " + maxGoleador.getGolesEnPartido() + " goles.");
    }
}