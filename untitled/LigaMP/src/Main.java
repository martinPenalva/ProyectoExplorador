public class Main {
    private static liga miLiga;
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Inserte el país de la liga:");
        String pais = teclado.nextLine();
        miLiga = new Liga(pais);
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
