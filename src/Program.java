import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        /*
Fazer um programa para ler o caminho de um arquivo .csv
contendo os dados de itens vendidos. Cada item possui um
nome, preço unitário e quantidade, separados por vírgula. Você
deve gerar um novo arquivo chamado "summary.csv", localizado
em uma subpasta chamada "out" a partir da pasta original do
arquivo de origem, contendo apenas o nome e o valor total para
aquele item (preço unitário multiplicado pela quantidade),
conforme exemplo.
*/
        String path = "C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\fileExercise-java\\file.csv";
        List<Product> products = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();// Vai ler uma linha do arquivo, caso o arquivo esteja no final ele vai retorna null
            while (line != null) {
                System.out.println(line);
                line = bf.readLine();
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}