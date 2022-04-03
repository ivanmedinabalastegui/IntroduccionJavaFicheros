import java.io.FileInputStream;
import java.io.BufferedInputStream;
public class LeerNumeros128 {
    public static void main(String[] args) throws java.io.IOException {
        byte bufferEntrada[] = new byte[50];
        int numBytesLeidos;
        FileInputStream fis = new FileInputStream("src/datosbuf.dat");
        BufferedInputStream entrada = new BufferedInputStream(fis);
        while (true) {
            numBytesLeidos = entrada.read(bufferEntrada);
            System.out.println("Leidos " + numBytesLeidos + " bytes");
            if (numBytesLeidos <= 0) break;
            for (int i = 0; i < 50; i++) {
                System.out.println("En "+i+" hay " + bufferEntrada[i]);
                bufferEntrada[i] = 0;
            }
        }
        fis.close();
    }
}