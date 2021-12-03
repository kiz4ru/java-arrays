import javax.swing.*;
import java.awt.*;

public class main {

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        String[][] poductos = {
                {"kit-kat", "chicles", "lacasitos", "palotes",},
                {"kit-kat", "chicles", "lacasitos", "palotes"},
                {"kit-kat", "chicles", "lacasitos", "palotes"},
                {"kit-kat", "chicles", "lacasitos", "palotes"}

        };
        double[][] pre = {
                {1.1, 0.8, 1.5, 0.9},
                {1.8, 1, 1.2, 1},
                {1.8, 1.3, 1, 2, 0.8},
                {1.5, 1.1, 1.1, 1.1}

        };
        int[][] cantidad = new int[4][4];
        rellenarmatriz(cantidad, 5);

        boolean salir = false;
        int opcion = 0;

        while (!salir) {
            JOptionPane.showInputDialog(null, "1: Pedir Golosina" + "\n" + "2: Ver Golosinas" +
                    "\n" + "3: Rellenar Golosinas" + "\n" + "4: Apagar Maquina");
        }
        try {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));

            switch (opcion) {
                case 1:

                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    salir = true;
                    break;
                default:
                    JOptionPane.showInputDialog("");
            }

        } catch (HeadlessException e) {
            JOptionPane.showInternalMessageDialog(null, "ERROR");
        }

    }

    public static void rellenarmatriz(int[][] matriz, int num) {
        for (int i = 0; i < matriz.length; i++) {
            for (int y = 0; y < matriz.length; y++) {
                matriz[i][y] = num;
            }
        }
        public static void posicion(){

        }

    }
}
