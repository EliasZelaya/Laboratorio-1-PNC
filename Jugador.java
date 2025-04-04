public class Jugador {

    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;


    // Constructor de la clase Jugador
    public Jugador(int id, String nombre, int golesMarcados, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.golesMarcados = golesMarcados;
        this.partidosJugados = partidosJugados;
    }


    // Métodos getters y setters
    //Id
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Nombre
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Goles
    public int getGolesMarcados() {
        return golesMarcados;
    }

    public void setGolesMarcados(int golesMarcados) {
        this.golesMarcados = golesMarcados;
    }

    //Partidos por jugador
    public int getPartidosJugados() {
        return partidosJugados;
    }

    public void setPartidosJugados(int partidosJugados) {
        this.partidosJugados = partidosJugados;
    }

    //Metodo toString
    @Override
    public String toString() {
        return "Jugador{" +
               "ID=" + id +
               ", Nombre='" + nombre + '\'' +
               ", Goles Marcados=" + golesMarcados +
               ", Partidos Jugados=" + partidosJugados +
               '}';
    }
}
