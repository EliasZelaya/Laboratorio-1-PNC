public class Jugador {

    private int id;
    private String nombre;
    private int golesMarcados;
    private int partidosJugados;
    int golesTotales; // TODO : unificar las variables despues 
    int golesEnPartido; //


    // Constructor de la clase Jugador
    public Jugador(int id, String nombre, int golesMarcados, int partidosJugados) {
        this.id = id;
        this.nombre = nombre;
        this.golesMarcados = golesMarcados;
        this.partidosJugados = partidosJugados;
        this.golesEnPartido = 0; // var aux
        this.golesTotales = 0; // var aux
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
    //TODO : ELIMINAR DESPUES 

    public void anotarGoles(int goles) {
        this.golesEnPartido = goles;
    }
    //ACTUALIAR ESTADISTICAS 
    public void actualizarEstadisticas() {
        this.golesTotales += this.golesEnPartido;
        this.partidosJugados += 1;
    }
    // MOSTRAR ESTADISTICAS
    public void mostrarEstadisticas() {
        System.out.println("Jugador: " + nombre);
        System.out.println(" - Goles en este partido: " + golesEnPartido);
        System.out.println(" - Goles totales: " + golesTotales);
        System.out.println(" - Partidos jugados: " + partidosJugados);
        System.out.println(" - Promedio de goles por partido: " +
            (partidosJugados > 0 ? (double)golesTotales / partidosJugados : 0));
        System.out.println();
    }

    public int getGolesEnPartido() {
        return golesEnPartido;
    }
    //// HASTA AQUI 

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
