
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
    public String getCiudad() {
        return ciudad;
    }
    public int getNumJugadores()
    {
        int cuantos = 0;
        for(int posicion = 0;posicion< ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null)
            {
                cuantos ++;
            }
        }
        return cuantos;
    }
    public void mostrarListaJugadores()
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null) {
                String situacion = "";
                if (ListaJugadores[posicion].getLesionado()) {
                    situacion = "SI";
                } else {
                    situacion = "NO";
                }
                System.out.println(ListaJugadores[posicion].getNombre() + "\t\t" + ListaJugadores[posicion].getPosicion() + "\t\t\t\t" + ListaJugadores[posicion].getEdad() + "\t\t" + ListaJugadores[posicion].getNacionalidad() + "\t\t" + situacion);
            }
        }
    }
    public void adquirirJugador(Jugador jugador)
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if(ListaJugadores[posicion] == null)
            {
                ListaJugadores[posicion] = jugador;
                break;
            }
        }
    }

