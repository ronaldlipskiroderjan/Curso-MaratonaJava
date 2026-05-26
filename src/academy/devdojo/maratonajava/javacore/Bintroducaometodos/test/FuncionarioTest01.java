package academy.devdojo.maratonajava.javacore.Bintroducaometodos.test;


import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();

        funcionario.setNome("Ronald");
        funcionario.setIdade(18);
        funcionario.setSalario(new double[]{12000, 3000, 15000});
        funcionario.imprimeFuncionario();
        System.out.println("Média: " + funcionario.getMedia());

    }
}
