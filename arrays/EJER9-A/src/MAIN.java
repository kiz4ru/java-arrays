import javax.swing.*;
import java.awt.*;

public class MAIN {
    public static void main(String[] args) {
        int[] unidades = new int[10];
        int codif=0;
        char continuar = 0;
        int[] codi= {10,23,30,47,55,65,135,256,526,663};

        try {
            //ORDENAR DE MENOR A MAYOR
            for (int x = 0; x < codi.length; x++) {
                for (int i = 0; i < codi.length-x-1; i++) {
                    if(codi[i] < codi[i+1]){
                        int tmp = codi[i+1];
                        codi[i+1] = codi[i];
                        codi[i] = tmp;
                    }
                }
            }
           codif= Integer.parseInt(JOptionPane.showInputDialog("Ingrese Codigo: "));
        }catch (HeadlessException e){
            JOptionPane.showMessageDialog(null,"error");
        }
        class valid {
            private boolean num;
            private boolean val;

            public valid(char num) {
                this.val=true;
                this.num=false;
            }

            //public boolean esNumro() {}
        }

        do {
            try {
                unidades[continuar] = (Integer.parseInt(JOptionPane.showInputDialog(null,"cuantas unidades hay")));

                continuar++;
            }catch (HeadlessException e){
            }

        }while ((JOptionPane.showConfirmDialog(null, "Desea añadir más?", "Añadir mas ?",
                JOptionPane.YES_NO_CANCEL_OPTION) == JOptionPane.YES_OPTION));
        int total=0;
        for (int i=0; i<unidades.length;i++){
            total +=unidades[i];
        }
        System.out.println("Tienes " + unidades[0] + " Unidades" + " el codigo es " + codif);
    }

}
































































