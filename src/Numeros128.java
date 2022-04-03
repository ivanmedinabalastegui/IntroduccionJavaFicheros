import java.io.FileOutputStream;
import java.io.BufferedOutputStream;
public class Numeros128 {
    public static void main(String[] args) throws java.io.IOException {
        FileOutputStream fos = new FileOutputStream("src/datosbuf.dat");
        BufferedOutputStream salida = new BufferedOutputStream(fos);
        for (int i = 0; i < 128; i++) {
            salida.write(i);
        }
        salida.flush();
        fos.close();
    }
}