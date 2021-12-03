import javax.swing.*;
import java.awt.*;
import java.util.Scanner;
public class main {
    public static void main(String [] args) {
        try {


            int meses[] = new int[12];

            for (int i = 0; i < 12; i++) {
                meses[i] = Integer.parseInt(JOptionPane.showInputDialog("Precipitaciones del mes " + (i + 1) + ": "));
            }

            int máximo = 0;
            int mínimo = 0;

            double suma = 0;

            for (int i = 0; i < 12; i++) {
                if (meses[i] > meses[máximo]) máximo = i;
                if (meses[i] < meses[mínimo]) mínimo = i;
                suma += meses[i];
            }

            JOptionPane.showMessageDialog(null,"Máximo: Mes " + (máximo + 1) + " con " + meses[máximo] +
                    " litros");
            JOptionPane.showMessageDialog(null,"Mínimo: Mes " + (mínimo + 1) + " con " + meses[mínimo] +
                    " litros");

                }catch (HeadlessException e){
                }
            }
        }