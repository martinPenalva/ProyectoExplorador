// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        int[] notas = {5, 10, 27, 11, 21};

        System.out.println("El valor maximo es: " + calcularPares(notas));
    }

    public static int calcularPares(int[] valores){

        int maximo = valores[0];

        for (int i = 0; i < valores.length; i++) {

            if (valores[i] % 2) {
                 = valores[i];
            }
        }
        return maximo;
    }
    }
