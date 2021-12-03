import javax.swing.*;

public class main {
    public static void main(String [] args) {
        double importe=0;

        do{
            try{

               importe=Double.parseDouble(JOptionPane.showInputDialog("Ingresa un precio:"));


            }catch(Exception e){

                JOptionPane.showMessageDialog(null,"Dato erroneo.");
                JOptionPane.showMessageDialog(null,"");

            }
        } while(importe<=0);

        calcular(importe);
    }

    public static void calcular(double importe)
    {
        double [] euro={200, 100, 50, 20, 10, 5, 2, 1, 0.5, 0.20, 0.10, 0.05, 0.02, 0.01};

        // Este array contendra las monedas que tiene que devolver
        double [] devolver={0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};


        for(int i=0; i<euro.length; i++)

        {
            // Si el importe actual, es superior a la moneda
            if(importe>=euro[i])

            {
                // obtenemos cantidad de monedas
                devolver[i]=Math.floor(importe/euro[i]);

                // actualizamos el valor del importe que nos queda por didivir
                importe=importe-(devolver[i]*euro[i]);
            }
        }

        // Bucle para mostrar el resultado
        for(int i=0;i<euro.length;i++)

        {
            if(devolver[i]>0)
            {
                if(euro[i]>2)
                {
                    // Indicamos que es un billete
                    JOptionPane.showMessageDialog(null,"Hay "+devolver[i]+" billetes de: "+euro[i]+" Euros");

                }else
                {
                    // Indicamos que es una moneda
                    JOptionPane.showMessageDialog(null,"Hay "+devolver[i]+" monedas de: "+euro[i]+" Euros");
                }

            }

        }

    }

}
