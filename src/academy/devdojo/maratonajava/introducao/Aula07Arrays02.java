package academy.devdojo.maratonajava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte ,short, int, long, float, e double 0
        // char '\u0000' ' '
        // boolean false
        // String null

        String [] nomes = new String [3];
        nomes [0] = "Ronald";
        nomes [1] = "Ana Luiza";
        nomes [2] = "Davi";

        for (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);

        }
        // Se alterada a Array tudo é apagdo junto com ela com podemos ver nesse caso.

        nomes = new String [4];
        for  (int i = 0; i < nomes.length; i++){
            System.out.println(nomes[i]);
        }
    }
}
