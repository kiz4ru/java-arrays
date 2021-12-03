import javax.swing.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        char mayusculas[] = new char[26];
        for (int i = 65, j = 0; i <= 90; i++, j++) {
            mayusculas[j] = (char) i;
        }

        String cadena = "";
        int eleccion = -1;

        do {
            JOptionPane.showMessageDialog(null,"Elija en la terminal un indice entre 0 y "
                    + (mayusculas.length - 1));
            eleccion = sc.nextInt();

            if (!(eleccion >= 0 && eleccion <= mayusculas.length - 1)) {
                JOptionPane.showMessageDialog(null,"Error, inserte otro numero");

            } else {
                if (eleccion != -1) {
                    cadena += mayusculas[eleccion];
                }
            }

        } while (eleccion != -1);

        JOptionPane.showMessageDialog(null, (cadena));


    }
}
