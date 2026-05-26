package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor  = new Professor();

        professor.nome = "Celso";
        professor.idade = 47;
        professor.sexo = 'M';

        System.out.println("O professor " + professor.nome + " possui " + professor.idade +" Anos e é do sexo " + professor.sexo);
        System.out.println("Nome: " + professor.nome + " Idade: " + professor.idade +" Sexo: " + professor.sexo);
    }
}
