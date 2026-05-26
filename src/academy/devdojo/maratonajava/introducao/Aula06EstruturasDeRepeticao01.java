package academy.devdojo.maratonajava.introducao;

import java.sql.SQLOutput;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while
        int count = 0;

        while(count < 10){
            System.out.println(++count);
        }

        // do while
        int number = 12;

        do {
            System.out.println("Dentro do do-while");
        } while (number < 10);

        // for
        for(int i=0; i < 10; i++){
            System.out.println("For"+ i);
        }
    }
}
