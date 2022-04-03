import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;
public class Añadir {
    public static void main(String[] args) {
        Scanner pt = new Scanner(System.in);
        FileOutputStream fos = null;
        DataOutputStream salida = null;
        int num;
        try {
            //Abre el fichero existente para escribir por el final
            fos = new FileOutputStream("src/datos.dat", true);
            salida = new DataOutputStream(fos);
            //Lee de teclado
            System.out.print("Introduce nº entero. (-1 = FIN)");
            num = pt.nextInt();
            while (num != -1) {
                //Graba en el fichero el dato tecleado
                salida.writeInt(num);
                System.out.print("Introduce nº entero. (-1 = FIN)");
                num = pt.nextInt();
            }
        } catch (FileNotFoundException fnfe) {
            System.out.println(fnfe.getMessage());
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (salida != null) {
                    salida.close();
                }
            } catch (IOException ioe) {
                System.out.println(ioe.getMessage());
            }
        }
    }
}