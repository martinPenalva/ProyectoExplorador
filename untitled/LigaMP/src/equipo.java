
import java.util.Objects;

public class Equipo {
    private String nombre;
    private String ciudad;
    private final int numMaxJugadores = 22;
    private Jugador[] ListaJugadores;

    public Equipo(String nombEquipo, String nombCiudad)
    {
        nombre = nombEquipo;
        ciudad = nombCiudad;
        ListaJugadores = new Jugador[numMaxJugadores];
    }

    public String getNombre() {
        return nombre;
    }
