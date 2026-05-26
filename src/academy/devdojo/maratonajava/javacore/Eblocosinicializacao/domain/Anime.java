package academy.devdojo.maratonajava.javacore.Eblocosinicializacao.domain;

public class Anime {
    private String nome;
    private int[] episodios;
    // 1- Alocado espaço em memória para objeto
    // 2- Cada atributo de classe é criado e inicializado com valores defukt ou o quer for passado
    // 3- Bloco de inicialização é executado
    // 4- Contrutor é executado
    {
        System.out.println("Dentro do bloco de inicialização");
        episodios = new int[100];
        for ( int i = 0; i < episodios.length; i++){
            episodios[i] = i+1;
        }
    }

    public Anime(String nome){
        this.nome = nome;
    }

    public int[] getEpisodios(){
        return this.episodios;
    }

    public String getNome(){
        return this.nome;
    }

    public void imprimeEpisodios(){
        for (int episodio : this.episodios){
            System.out.print(episodio + " ");
        }

    }
}
