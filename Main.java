import java.util.*;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;

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

        jugadores.add(jugador1);
        jugadores.add(jugador2);
        jugadores.add(jugador3);
        jugadores.add(jugador4);
        jugadores.add(jugador5);
        jugadores.add(jugador6);
        jugadores.add(jugador7);
        jugadores.add(jugador8);
        jugadores.add(jugador9);


        //Filtro de jugadores con mas de 5 goles
           List<Jugador> jugadoresFiltrados = jugadores.stream()
            .filter(jugador -> jugador.getGolesMarcados() > 5)
            .collect(Collectors.toList());


            jugadoresFiltrados.forEach(jugador -> System.out.println(jugador));
    }
}