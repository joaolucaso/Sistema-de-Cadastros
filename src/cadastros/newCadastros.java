package cadastros;


import java.io.*;
import java.util.Scanner;

public class newCadastros {

    private String nome;
    private String gmail;
    private String idade;
    private String altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getGmail() {
        return gmail;
    }

    public void setGmail(String gmail) {
        this.gmail = gmail;
    }

    public String getIdade() {
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade;
    }

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String salvar() {
        Scanner line = new Scanner(System.in);
        try {
            line = new Scanner(System.in);
            FileWriter fw = new FileWriter("cadastro.txt", true);
            PrintWriter pw = new PrintWriter(fw);
        System.out.println("entre com seus dados:");
        if (true) {
            line.useDelimiter(pw+",");
            pw.println(nome+line.nextLine());
            pw.println(gmail+line.nextLine());
            pw.println(idade+line.nextLine());
            pw.println(altura+line.nextLine());
            pw.flush();
            pw.close();
            fw.close();
        }else {
            line.close();
        }
        } catch (IOException e) {
            System.out.println("Erro no Arquivo Cadastro.txt");
            ;
        }
        return "";
    }

}


