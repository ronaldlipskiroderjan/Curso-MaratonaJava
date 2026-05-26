package academy.devdojo.maratonajava.javacore.Hheranca.test;

import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Endereco;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Funcionario;
import academy.devdojo.maratonajava.javacore.Hheranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {

        Endereco endereco = new Endereco();
        endereco.setRua("Rua 3");
        endereco.setCep("01011011");

        Pessoa pessoa = new Pessoa("Ronald");
        pessoa.setNome("Ronald Lipski Roderjan");
        pessoa.setCpf("15227512973");
        pessoa.setEndereco(endereco);
        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Ronald");
        funcionario.setNome("Ronald Lipski Roderjan");
        funcionario.setCpf("15227512973");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(10000);
        funcionario.imprime();

    }
}
