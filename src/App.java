import java.util.Scanner;
import processamento.ProcNota;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Nome: " + nome);

        System.out.print("Digite sua idade: ");
        int idade = sc.nextInt();
        System.out.println("Idade: " + idade);
        
        System.out.print("Digite sua idade: ");
        Double altura = sc.nextDouble();
        System.out.println("Idade: " + altura);

        ProcNota pn = new ProcNota(nome);
        pn.baixarNota();
        System.out.println("Data da Baixa: " + pn.getDataDaBaixa());
    }
}
