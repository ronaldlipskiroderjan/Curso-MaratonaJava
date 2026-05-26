package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.Test;

import academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Ronald");

        for (int episodio : anime.getEpisodios()){
            System.out.print(episodio + " ");
        }


    }
}
