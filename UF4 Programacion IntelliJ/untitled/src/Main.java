
// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        escribirArray1();
        System.out.println(encontrarNombreDia(2));
    }
        public void crearArrays(int n){

        double[] precios = new double[20];
        boolean[] plazasParking = new boolean[n];
        final int MAX = 25;
        String[] nombres = new String[MAX];
        double[] lluvia = new double[30];
        System.out.print(lluvia.length);

        int[] diaMes  = new int[12];
        int numeroElementos = diaMes.length;
        diaMes[1] = 29;

    }
        public static void escribirArray1(){
            int[] miArray = new int[]{1, 2 , 3, 4, 5, 6, 7, 8, 9, 10};
            System.out.println("Valores de mi tabla:");
            for (int i = 0; i < miArray.length; i++){
                System.out.println("Elemento " + i + ": " + miArray[i]);
            }

        }
        public static String encontrarNombreDia(int diaSemana){
            String dia = "";
            String[] nombres ={"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sabado", "Domingo"};
            for (int i = 0; i < nombres.length; i++){
                if (diaSemana == i + 1){
                    dia = nombres[i];

                }


            }
            return dia;
        }
    }
