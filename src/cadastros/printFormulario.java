package cadastros;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class printFormulario {

    public String leituraFormulario() {
        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("formulario.txt"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }

            scanner.close();
        } catch (
                IOException e) {
            System.out.println("Erro ao Abrir arquivo");
        }
        return "";
    }
}

