package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.test;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Celta";
        carro1.modelo = "Chevrolet";
        carro1.ano = 2021;

        carro2.nome = "F80";
        carro2.modelo = "Ferrari";
        carro2.ano = 2026;

        System.out.println("\nCarro 1:");
        System.out.println("Nome: " + carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: " +  carro1.ano);
        System.out.println("\nCarro 2:");
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " +  carro2.ano);

        carro1 = carro2;

        System.out.println("\nCarro 1:");
        System.out.println("Nome: " + carro1.nome + ", Modelo: " + carro1.modelo + ", Ano: " +  carro1.ano);
        System.out.println("\nCarro 2:");
        System.out.println("Nome: " + carro2.nome + ", Modelo: " + carro2.modelo + ", Ano: " +  carro2.ano);




    }
}
