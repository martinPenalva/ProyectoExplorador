import java.util.Objects;

public class liga {
    private String pais;
    private final int numMaxEqupos = 20;
    private equipo[] listadoEquipos;

    public liga(String liPais)
    {
        pais = liPais;
        listadoEquipos = new equipo [numMaxEqupos];
    }
    public void mostrarListadoEquipos()
    {
        for(int equipo = 0;equipo<listadoEquipos.length;equipo++)
        {
            if (listadoEquipos[equipo] != null)
            {
                System.out.println(listadoEquipos[equipo].getNombre() + "\t\t" + listadoEquipos[equipo].getCiudad() + "\t\t" + listadoEquipos[equipo].getNumJugadores());
            }
        }
    }
