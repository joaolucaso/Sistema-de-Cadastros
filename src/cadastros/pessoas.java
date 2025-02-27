package cadastros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class pessoas {

    private String nome;
    private String gmail;
    private String idade;
    private String altura;

    public String[] getResposta() {
        return resposta;
    }

    public void setResposta(String[] resposta) {
        this.resposta = resposta;
    }

    private String[] resposta = new String[3];


    public String salvar() {

Scanner line = new Scanner(System.in);
        try {


            FileWriter fw = new FileWriter("cadastro.txt", true);
            PrintWriter pw = new PrintWriter(fw);
            System.out.println("entre com seus dados:");
            System.out.print("-");
            pw.print(nome=line.next());
            System.out.print("-");
            pw.print(gmail=line.next());
            System.out.print("-");
            pw.print(idade=line.next());
            System.out.print("-");
            pw.print(altura=line.next());
            pw.flush();
            pw.close();
            fw.close();
            line.close();

        } catch (IOException e) {
            System.out.println("Erro no Arquivo Cadastro.txt");
        }
        return null;
    }

}
