import java.io.DataInputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
public class Leer {
    public static void main(String[] args) {
        FileInputStream fis = null;
        DataInputStream entrada = null;
        int num;
        try {
            fis = new FileInputStream("src/datos.dat");
            entrada = new DataInputStream(fis);
            while (true) {
                //Lectura de un número entero del fichero
                num = entrada.readInt();
                //Se muestra lo leído en pantalla
                System.out.println(num);
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (EOFException eofe) {
            System.out.println("Fin de fichero");
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (entrada != null) {
                    entrada.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}