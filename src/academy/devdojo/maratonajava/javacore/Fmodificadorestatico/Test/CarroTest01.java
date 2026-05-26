package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.Test;

import academy.devdojo.maratonajava.javacore.Fmodificadorestatico.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro01 = new Carro("BMW", 280);
        Carro carro02 = new Carro("MERCEDES", 320);
        Carro carro03 = new Carro("AUDI", 260);

        Carro.setVelocidadeLimite(180);

        carro01.imprime();
        carro02.imprime();
        carro03.imprime();
    }
}
