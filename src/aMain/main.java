package aMain;

import cadastros.pessoas;
import cadastros.printFormulario;

import java.io.FileNotFoundException;

public class main {
    public static void main(String[] args) throws FileNotFoundException {

        printFormulario printar = new printFormulario();
        printar.leituraFormulario();
        pessoas cadastro = new pessoas();
        cadastro.salvar();

    }
}
