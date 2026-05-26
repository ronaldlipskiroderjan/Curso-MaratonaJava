package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Jogador;
import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Time;

public class JogadorTest03 {
    public static void main(String[] args) {
        Time time2 = new Time("Brasil 2");
        Time time1 = new Time("Brasil");
        Jogador j1 = new Jogador("Ronald");
        Jogador j2 = new Jogador("Lucas");

        Jogador[] jogadores = {j1, j2};

        j1.setTime(time1);
        j2.setTime(time1);
        time1.setJogadores(jogadores);

        j1.imprime();
        j2.imprime();
        time1.imprime();

        time2.imprime();



    }
}
