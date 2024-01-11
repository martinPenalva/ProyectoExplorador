public class Main {
    public static void main(String[] args) {

            int[] notas = {5, 10, 27, 11, 21};

            System.out.println("El valor maximo es: " + calcularMaximo(notas));
        }

        public static int calcularMaximo(int[] valores){

            int maximo = valores[0];

            for (int i = 1; i < valores.length; i++) {

                if (valores[i] > maximo) {
                    maximo = valores[i];
                }
            }
            return maximo;
        }
    }