
import java.util.Objects;

public class jugador {

    private String nombre;
    private String nacionalidad;
    private int edad;
    private String posicion;
    private boolean lesionado;

    public Jugador(String nombJugador, String nacionalidadJu, int edadJug, String posicionJu)
    {
        nombre = nombJugador;
        nacionalidad = nacionalidadJu;
        edad = edadJug;
        if (Objects.equals(posicionJu, "POR") || Objects.equals(posicionJu, "DEF") || Objects.equals(posicionJu, "CTC") || Objects.equals(posicionJu, "DEL"))
        {
            posicion = posicionJu;
        }
        lesionado = false;
    }

    public String getNombre() {
        return nombre;
    }
    public String getNacionalidad() {
        return nacionalidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getPosicion() {
        return posicion;
    }

    public boolean getLesionado() {
        return lesionado;
    }

    public void Lesionarse()
    {
        lesionado = true;
    }
    public void Recuperarse()
    {
        lesionado = false;
    }
}
