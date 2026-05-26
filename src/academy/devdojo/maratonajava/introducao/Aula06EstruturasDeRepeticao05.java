package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao05 {
    public static void main(String[] args) {
        // Dado o valor de um carro, descubra em quantas vezes ele pode der parcelado
        // Condição valorParcela >= 1000double valorTotal = 50000.0;
        double valorTotal = 50000.0;
        for (int parcela = (int) valorTotal; parcela >= 1; parcela--){
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                continue;
            }
            System.out.println("Parcela: " +parcela+ " Valor da parcela: " + valorParcela);
        }
    }
}
