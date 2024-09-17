package application;

import entities.Product;

import java.io.*;
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
        List<String> lines = new ArrayList<>();

        try(BufferedReader bf = new BufferedReader(new FileReader(path))) {
            String line = bf.readLine();// Vai ler uma linha do arquivo, caso o arquivo esteja no final ele vai retorna null
            lines.add(line);
            while (line != null) {
                line = bf.readLine();
                lines.add(line);
            }
            /*
            System.out.println("-----------------------------------");
            for(String p : lines) {
                if(p!=null){
                    System.out.println(p);
                }
            }
            */
            for(String p : lines) {
                if(p!=null){
                    String[] split = p.split(",");
                    String n1 = split[0];
                    String n2 = split[1];
                    String n3 = split[2];
                    double price = Double.parseDouble(n2);
                    int quantity = Integer.parseInt(n3);
                    products.add(new Product(n1,price,quantity));
                }
            }
            /*
            System.out.println("-----------------------------------");
            for(Product p : products) {
                System.out.println(p);
            }
            */
            String path2 = "C:\\Users\\felip\\OneDrive\\Documento\\Desinvolvimento\\temp\\ws-intellj\\fileExercise-java\\src";

            File file = new File(path2 + "\\out");
            boolean success = file.mkdir();
            String pathFull = file.getAbsolutePath();

            System.out.println("'out' folder created: "+success);
            String pathFileSummary = pathFull+"\\summary.csv";

            try (BufferedWriter bw = new BufferedWriter(new FileWriter(pathFileSummary))){
                for(Product p : products) {
                    bw.write(p.toString());
                    bw.newLine();
                }
            }
            catch (IOException e){
                System.out.println("Erro: " + e.getMessage());
            }
        }
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        }

    }
}