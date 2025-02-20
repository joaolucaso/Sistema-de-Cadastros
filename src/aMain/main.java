package aMain;
import cadastros.printFormulario;
import cadastros.newCadastros;
public class main {
    public static void main(String[] args) {
printFormulario printar = new printFormulario();
printar.leituraFormulario();

newCadastros cadastros =new newCadastros();
cadastros.salvar();



    }
}
