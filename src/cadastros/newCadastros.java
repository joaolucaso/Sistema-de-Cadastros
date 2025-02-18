package cadastros;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class newCadastros  {

    private String nome;
    private String gmail;
    private int idade;
    private double altura;


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

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String salvar() {
        FileWriter leitura = null;
        PrintWriter escrita = null;
        try {
            leitura = new FileWriter("cadastro.txt", true);
            escrita = new PrintWriter(leitura);


        } catch (IOException ex) {
            System.out.println(ex);
        }

        return "";
    }

}

