package academy.devdojo.maratonajava.javacore.DConstrutores.test;

import academy.devdojo.maratonajava.javacore.DConstrutores.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime("Ronald", "TV", 12, "Ação", "SSS");
        Anime anime02 = new Anime("Ana", "TV", 12, "Ação");
        anime.imprime();
        anime02.imprime();
    }
}
