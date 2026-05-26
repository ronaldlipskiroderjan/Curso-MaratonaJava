package academy.devdojo.maratonajava.introducao;

import javax.swing.*;
import java.net.SocketOption;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int age = (int) 100000000000000L;
        long numberLong = (long) 153.33;
        float salaryFloat = 2500.0F;
        double salaryDouble = 2000.0;
        byte salaryByte = 10;
        short salaryShort = 10;
        boolean falseBooolean = false;
        boolean trueBoolean = true;
        char caractere = 'a';
        String nome = "Ronald";

        System.out.println(age);
        System.out.println(salaryFloat);
        System.out.println(salaryDouble);
        System.out.println(salaryByte);
        System.out.println(salaryShort);
        System.out.println(falseBooolean);
        System.out.println(trueBoolean);
        System.out.println(caractere);
        System.out.println(numberLong);
        System.out.println("Meu nome é "+nome);
        System.out.println("char "+caractere );
    }
}
