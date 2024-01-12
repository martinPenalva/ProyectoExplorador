
import java.util.Objects;
public class equipo {



    private final String nombre;
    private  final String ciudad;
    private final int numMaxJugadores = 22;
    private jugador[] ListaJugadores;

    public equipo(String nombEquipo, String nombCiudad)
    {
        this.nombre = nombEquipo;
        this.ciudad = nombCiudad;
        ListaJugadores = new jugador[numMaxJugadores];
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
        for (int i = 0;i < ListaJugadores.length;i++)
        {
            if (ListaJugadores[i] != null) {
                String situacion = "";
                if (ListaJugadores[i].getLesionado()) {
                    situacion = "SI";
                } else {
                    situacion = "NO";
                }
                if (ListaJugadores[i] != null) {
                    System.out.print(ListaJugadores[i].getNombre() + ListaJugadores[i].getPosicion() + ListaJugadores[i].getEdad() + ListaJugadores[i].getNacionalidad() + " " + situacion);
                }
            }
        }
    }
    public void adquirirJugador(jugador jugador)
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
    public void venderJugador(String nombreJugador)//Error
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null) {
                if (Objects.equals(ListaJugadores[posicion].getNombre(), nombreJugador)) {
                    for (int borrar = posicion; borrar < ListaJugadores.length; borrar++) {
                        if (borrar < 21) {
                            ListaJugadores[borrar] = ListaJugadores[borrar + 1];
                        } else if (borrar == 21) {
                            ListaJugadores[posicion] = null;
                        }
                    }
                }
            }
        }
    }
}
