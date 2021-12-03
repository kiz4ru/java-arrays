import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args) {

        int[] alu = new int[5];
        int codigo;
        int[] faltas = new int[5];

        int contador = 0;
        try {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo: "));
        } catch(Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Datos errones");
        }


        do {
            try {
                faltas[contador] = Integer.parseInt(JOptionPane.showInputDialog("Indica las faltas por dia"));

                contador++;
            } catch (HeadlessException e) {
                JOptionPane.showMessageDialog(null, "Dato erroneo.");
            }

            calcular(faltas);
        } while(JOptionPane.showConfirmDialog(null, "Desea añadir más faltas ?", "Añadir mas ?",
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION);



    }
    public static void calcular(int[] faltas){
        int todo = 0;

        for (int i=0; i<faltas.length; i++){
            todo += faltas[i];
        }

        System.out.println("Total de faltas " + todo);

    }
}



