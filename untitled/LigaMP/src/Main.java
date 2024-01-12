import java.util.Objects;
import java.util.Scanner;

public class Main {
    private static liga miLiga;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el país de la liga:");
        String pais = teclado.nextLine();
        miLiga = new liga(pais);
        int opcion = 0;
        while (opcion != 6) {
            System.out.println("MENU DE LA LIGA DE " + miLiga.getPais());
            System.out.println("1-  Insertar Equipo");
            System.out.println("2-  Insertar Jugador");
            System.out.println("3-  Ver equipos de la liga");
            System.out.println("4-  Ver jugadores de un equipo");
            System.out.println("5-  Vender jugador");
            System.out.println("6-  Salir");
            opcion = teclado.nextInt();
            if (opcion == 1)
            {
                insertarEquipo();
            }
            else if (opcion == 2)
            {
                insertarJugador();
            }
            else if (opcion == 3)
            {
                VerLiga();
            }
            else if (opcion == 4)
            {
                verJugadores();
            }
            else if (opcion == 5)
            {
                venderJugador();
            }
            else if (opcion == 6)
            {
                break;
            }
            else
            {
                System.out.println("Error, esta opcion no esta en la lista, Volviendo al menu...");
            }
        }
    }
    public static void insertarEquipo()
    {
        if(miLiga.getNumEquipos() >= 20)
        {
            System.out.println("La liga está llena.");
        }
        else {
            Scanner equipo = new Scanner(System.in);
            System.out.println("Inserte el Nombre del equipo");
            String nombre = equipo.nextLine();
            System.out.println("Inserte la ciudad del equipo");
            String ciudad = equipo.nextLine();
            System.out.println("Creando equipo…");
            equipo miEquipo = new equipo(nombre, ciudad);
            System.out.println("Insertando equipo…");
            miLiga.anadirEquipo(miEquipo);
            System.out.println("Equipo " + nombre + " insertado");
        }
    }
    public static void insertarJugador()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el nombre del equipo donde quiere insertar el jugador:");
        equipo miEquipo = miLiga.getEquipo(teclado.nextLine());
        if(miEquipo == null)
        {
            System.out.println("El equipo indicado no existe.");
        }
        else if (miEquipo.getNumJugadores() >= 22)
        {
            System.out.println("El equipo está lleno.");
        }
        else
        {
            System.out.println("Indique el nombre del jugador:");
            String jugador = teclado.nextLine();
            System.out.println("Indique la nacionalidad del jugador:");
            String nacionalidad = teclado.nextLine();
            System.out.println("Indique la edad del jugador:");
            int edad = teclado.nextInt();
            System.out.println("Indique la posición del jugador:");
            String posicionn = teclado.nextLine();
            while (!Objects.equals(posicionn, "POR") && !Objects.equals(posicionn, "DEF") && !Objects.equals(posicionn, "CTC") && !Objects.equals(posicionn, "DEL"))
            {
                posicionn = teclado.nextLine();
                if (!Objects.equals(posicionn, "POR") && !Objects.equals(posicionn, "DEF") && !Objects.equals(posicionn, "CTC") && !Objects.equals(posicionn, "DEL")) {
                    System.out.println("Posición no valida");
                    System.out.println("Inserte la posición del jugador:");
                    posicionn = teclado.nextLine();
                }
                else {
                    break;
                }
            }
            System.out.println("Creando Jugador...");
            jugador miJugador = new jugador(jugador, nacionalidad, edad, posicionn);
            System.out.println("Insertando Jugador...");
            miEquipo.adquirirJugador(miJugador);
        }
    }
    public static void VerLiga()
    {
        System.out.println("**********COMPOSICIÓN DE LA LIGA*************************");
        System.out.println("Equipo\t\tCiudad\t\tNumero jugadores");
        miLiga.mostrarListadoEquipos();
        System.out.println("*********************************************************");
    }
    public static void verJugadores()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el equipo que quiere visualizar:");
        String equipo = teclado.nextLine();
        equipo miEquipo = miLiga.getEquipo(equipo);
        if (miEquipo == null)
        {
            System.out.println("El equipo indicado no existe.");
        }
        else
        {
            System.out.println("*********" + miEquipo.getNombre() + "***********************");
            System.out.println("NOMBRE\t\t" + "POSICIÓN\t\t" + "EDAD\t" + "NAC\t\t\t" + "LESIONADO");
            miEquipo.mostrarListaJugadores();
            System.out.println("***************************************");
        }
    }
    public static void venderJugador()
    {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el nombre del equipo donde quiere vender el jugador:");
        String equipo = teclado.nextLine();
        equipo miEquipo = miLiga.getEquipo(equipo);
        if(miEquipo == null)
        {
            System.out.println("El equipo indicado no existe.");
        }
        else
        {
            System.out.println("Inserte el nombre del jugador:");
            String nombre = teclado.nextLine();
            miEquipo.venderJugador(nombre);
        }
    }
}


