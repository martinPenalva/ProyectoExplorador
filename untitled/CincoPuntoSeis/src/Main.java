// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        double[] notas = {1, 3};

        System.out.println("La media es" + calcularSumar(notas));
    }

    public static double calcularSumar(double[] notas) {
        double sumaNotas = 0;
        for (int i = 0; i < notas.length; i++) {
            sumaNotas += notas[i];

        }
        return sumaNotas / notas.length;
    }
    public static int calcularMaximo(int[] valores) {

        int maximo = valores[0];

        System.out.println("El valor máximo es: " + maximo);
        for(int i = 1; i < valores.length; i++);
        {
            if (valores[i] > maximo) {
                maximo = valores[i];
            }
        }
        return maximo;
    }
}


