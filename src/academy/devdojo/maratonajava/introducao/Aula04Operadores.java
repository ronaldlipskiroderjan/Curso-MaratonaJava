package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        //+ - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println("Valor "+resultado);

        // %
        int resto = 21 % 7;
        System.out.println(resto);

        // <, >, <=, >=, ==, !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 20;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);


        // && (AND), || (or), ! (Negação)
        // &&

        int idade = 29;
        float salario = 3500F;
        boolean isDentrodaLeiMaiorQueTrinta =  idade >= 30 && salario >= 4612;
        boolean isDentrodaLeiMenorQueTrinta =  idade < 30 && salario >= 3381;

        System.out.println("isDentrodaLeiMenorQueTrinta "+isDentrodaLeiMenorQueTrinta);
        System.out.println("isDentrodaLeiMaiorQueTrinta "+isDentrodaLeiMaiorQueTrinta);

        // ||

        double valorTotalContaCorrente = 3500;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystationCinco = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente >= valorPlaystationCinco || valorTotalContaPoupanca >= valorPlaystationCinco;

        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        // =, +=, -=, *=, /=, %=

        double bonus = 1800;
        bonus += 1000; // 2800
        bonus -= 1000; // 1800
        bonus *= 2; // 3600
        bonus /= 2; // 1800
        bonus %= 2; // 0.0

        System.out.println(bonus);

        // ++, --

        int contador = 0;
        contador += 1; // contador = contador + 1;
        contador++;
        contador--;
        ++contador;
        --contador;

        int contador2 = 0;

        System.out.println(++contador2);


    }

}
