package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao04 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode der parcelado
        // Condição valorParcela >= 1000
        double valorTotal = 50000.0;
        for (int parcela = 1; parcela <= valorTotal; parcela++ ){
                double valorParcela = valorTotal / parcela;
                System.out.println("Parcela: " +parcela+ " Valor da parcela: " + valorParcela);
                if (valorParcela < 1000){
                    break;
                }

        }


    }
}
