package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Funcionario extends Pessoa {

    private double salario;
    static {
        System.out.println("Bloco de inicialização statico classe funcionario");
    }
    {
        System.out.println("Bloco de inicialização classe funcionario 1");
    }
    {
        System.out.println("Bloco de inicialização classe funcionario 2 ");
    }

    public Funcionario(String nome) {
        super(nome);
        System.out.println("Dentro do Constructor Funcionario");
    }

    public void imprime() {
        super.imprime();
        System.out.println("Salário: " + this.salario);
    }
    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}