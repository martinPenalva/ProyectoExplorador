// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    int[] numeros = {1, 2, 3, 4, 5};
 public constructor(){

 }
    public void insertarn(int valor)
    {
        if (!valor==null) {
            int i = pos – 1;
            while (i >= 0 && elementos[i] > valor) {
                elementos[i + 1] = elementos[i];
                i -– ;
            }
            elementos[i + 1] = valor;
            pos ++;
        }
    }
}