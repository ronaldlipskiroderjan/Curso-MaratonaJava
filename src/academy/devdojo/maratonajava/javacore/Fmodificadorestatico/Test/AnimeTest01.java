package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Test;


import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime1 = new Anime("Ronald");
        Anime anime2 = new Anime("Ana Luiza");
        Anime anime3 = new Anime("Zero2");

        anime1.imprimeEpisodios();
        anime2.imprimeEpisodios();
        anime3.imprimeEpisodios();
    }
}