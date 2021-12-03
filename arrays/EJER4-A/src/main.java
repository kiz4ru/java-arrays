import javax.swing.*;
import java.awt.*;

public class main {
    public static void main(String[] args){
        try {
            String mes=JOptionPane.showInputDialog("Introduce un mes");

            String[] meses={"Enero", "Febrero", "marzo", "abril", "mayo", "junio", "julio","agosto","septiembre",
                    "Octubre","noviembre","diciembre"};

            int i;

            for ( i=0; i<meses.length && meses[i].compareToIgnoreCase(mes)!=0; i++){
            }
            if (i == meses.length )
                JOptionPane.showMessageDialog(null,"NO ES correcto " );
            else
                JOptionPane.showMessageDialog(null,"ES CORRECTO ");
        }catch (HeadlessException e){

        }


    }
}
