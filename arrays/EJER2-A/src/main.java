import javax.swing.*;

public class main {
    public static void main (String[] args){

        String pri=JOptionPane.showInputDialog("Introduce un tamaño");
        int num[]=new int[Integer.parseInt(pri)];

        NumAleatorio(num, 0, 9);
        mostrarArray(num);
    }
    public static void NumAleatorio(int nan[], int x, int c){
        for(int i=0;i<nan.length;i++){

            nan[i]=((int)Math.floor(Math.random()*(x-c)+c));
        }
    }
    public static void mostrarArray(int nan[]){
        for(int i=0;i<nan.length;i++){
            JOptionPane.showMessageDialog(null,"En el indice "+i+" esta el valor "+nan[i]);
        }

    }
}

