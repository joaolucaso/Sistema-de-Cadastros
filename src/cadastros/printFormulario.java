package cadastros;

import java.io.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class printFormulario {

    public String leituraFormulario() throws FileNotFoundException {

        Scanner scanner = null;
        try {
            scanner = new Scanner(new File("formulario.txt"));

            while (scanner.hasNextLine()) {
                System.out.println(scanner.nextLine());
            }
            scanner.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return "";
    }
}
