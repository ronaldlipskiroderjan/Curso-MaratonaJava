package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays03 {
    public static void main(String[] args) {
        int [] numeros = new int [3];
        int [] numeros2 = {10,2,30,4,50};
        int [] numeros3 = new int []{1,2,3,4,5};

        for (int i = 0; i < numeros.length; i++) {
            System.out.println(numeros[i]);
        }

        // foreach
        for (int num: numeros2 ){
            System.out.println(num);
        }
    }
}
