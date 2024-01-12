
import java.util.Objects;

public class equipo {
    private String nombre;
    private String ciudad;
    private final int numMaxJugadores = 22;
    private jugador[] ListaJugadores;

    public equipo(String nombEquipo, String nombCiudad)
    {
        nombre = nombEquipo;
        ciudad = nombCiudad;
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
        int cantidad= 0;
        for(int posicion = 0;posicion< ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null)
            {
                cantidad++;
            }
        }
        return cantidad;
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
    public void venderJugador(String nombreJugador)
    {
        for (int posicion = 0;posicion < ListaJugadores.length;posicion++)
        {
            if (ListaJugadores[posicion] != null) {
                if (Objects.equals(ListaJugadores[posicion].getNombre(), nombreJugador))
                {
                    for (int borrar = posicion; borrar < ListaJugadores.length; borrar++)
                    {
                        if (borrar < ListaJugadores.length-1)
                        {
                            ListaJugadores[borrar] = ListaJugadores[borrar + 1];
                        } else
                        if (borrar == ListaJugadores.length-1)
                        {
                            ListaJugadores[posicion] = null;
                            System.out.println("Vendiendo jugador…");
                            System.out.println("Jugador vendido.");
                        }
                    }
                    break;
                }
            }
            else if (posicion >= ListaJugadores.length-1)
            {
                System.out.println("El jugador no existe.");

                break;
            }
        }
    }
}

