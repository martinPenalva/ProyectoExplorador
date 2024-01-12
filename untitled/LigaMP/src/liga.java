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
    public int getNumEquipos()
    {
        int nume = 0;
        for(int equipo = 0;equipo<listadoEquipos.length;equipo++)
        {
            if(listadoEquipos[equipo] != null)
            {
                nume ++;
            }
        }
        return nume;
    }
    public equipo getEquipo(String nombreEquipo)
    {
        equipo EquipoNombre = null;
        for (int nombre = 0;nombre< listadoEquipos.length;nombre++)
        {
            if (listadoEquipos[nombre] != null) {
                if (Objects.equals(listadoEquipos[nombre].getNombre(), nombreEquipo)) {
                    EquipoNombre = listadoEquipos[nombre];
                    break;
                }
            }
        }
        return EquipoNombre;
    }

    public String getPais() {
        return pais;
    }
    public void anadirEquipo(equipo equipo)
    {
        for (int posicion = 0;posicion < listadoEquipos.length;posicion++)
        {
            if(listadoEquipos[posicion] == null)
            {
                listadoEquipos[posicion] = equipo;
                break;
            }
        }
    }
}

