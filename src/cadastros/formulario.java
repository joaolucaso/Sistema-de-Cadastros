package cadastros;


import java.io.*;
import java.util.Scanner;
import java.util.WeakHashMap;

public class formulario {
    public formulario() throws IOException {

        FileReader leitor = new FileReader("formulario.txt");
        int data = leitor.read();
        while (data != -1) {
            System.out.print((char) data);
            data = leitor.read();
        }
leitor.close();
    }
}

