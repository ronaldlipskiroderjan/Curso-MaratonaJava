package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Funcionario {
    private String nome;
    private int idade;
    private double[] salarios;
    private double media;

    public void imprimeFuncionario() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");

        System.out.println(this.nome);
        System.out.println(this.idade);
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            System.out.println(salario + "");
        }

        mediaSalarios();

    }

    public void mediaSalarios() {
        System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
        if (salarios == null) {
            return;
        }
        for (double salario : salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println("A média salarial é: " + media);

    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(double[] salarios){
        this.salarios = salarios;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome(){
        return this.nome;
    }

    public int getIdade(){
        return this.idade;
    }

    public double[] getSalarios(){
        return this.salarios;
    }

    public double getMedia(){
        return this.media;
    }


}
