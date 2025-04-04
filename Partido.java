
import java.util.List;

public class Partido {

    private List<Jugador> equipoA;
    private Integer golesEquipoA;
    private List<Jugador> equipoB;
    private Integer golesEquipoB;

    public Partido(List<Jugador> equipoA, List<Jugador> equipoB, Integer golesEquipoA, Integer golesEquipoB) {
        this.equipoA = equipoA;
        this.equipoB = equipoB;
        this.golesEquipoA = golesEquipoA;
        this.golesEquipoB = golesEquipoB;
    }

    public List<Jugador> getEquipoA() {
        return equipoA;
    }

    public void setEquipoA(List<Jugador> equipoA) {
        this.equipoA = equipoA;
    }

    public Integer getGolesEquipoA() {
        return golesEquipoA;
    }

    public void setGolesEquipoA(Integer golesEquipoA) {
        this.golesEquipoA = golesEquipoA;
    }

    public List<Jugador> getEquipoB() {
        return equipoB;
    }

    public void setEquipoB(List<Jugador> equipoB) {
        this.equipoB = equipoB;
    }

    public Integer getGolesEquipoB() {
        return golesEquipoB;
    }

    public void setGolesEquipoB(Integer golesEquipoB) {
        this.golesEquipoB = golesEquipoB;
    }

    public String DetallesPartido() {
        return "El equipo A lleva " + getGolesEquipoA() + "\nEl equipo B lleva " + getGolesEquipoB();
    }
}
