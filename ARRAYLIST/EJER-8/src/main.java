import com.sun.xml.internal.ws.handler.HandlerException;
import jdk.nashorn.internal.ir.WhileNode;

import javax.swing.*;
import java.time.LocalDate;

public class main {
    public static void main(String[] args) {
        try {

            String nombre = JOptionPane.showInputDialog(null,"Pon el nombre");

            String dire = JOptionPane.showInputDialog(null,"Pon tu dirección");

            String ciudad= JOptionPane.showInputDialog(null,"Pon tu ciudad");

            int codigo = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon tu codigo-postal"));

            int aNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon el Año de nacimeineto"));

            int mNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon el Mes de nacimeineto"));

            int dNacimiento = Integer.parseInt(JOptionPane.showInputDialog(null,"Pon el Dia de nacimeineto"));


            LocalDate fecha = LocalDate.of(aNacimiento, mNacimiento, dNacimiento);

            System.out.println("TU FECHA DE NACIMIENTO ES " + fecha +  "\n" + "Nombre" +  nombre + "\n" + "direccion" + dire );

        }catch (HandlerException e){
            JOptionPane.showMessageDialog(null,"ERROR");
        }


    }
}
