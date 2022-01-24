package ventana;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ventana {

    static class MiVentana extends JFrame implements ActionListener {

        private JLabel texto;
        private JTextField caja;
        private JButton boton;


        public MiVentana() {
            super();
            configurarVentana();        // configuramos la ventana
            inicializarComponentes();   // inicializamos los atributos o componentes

        }

        private void inicializarComponentes() {

            texto = new JLabel();
            caja = new JTextField();
            boton = new JButton();

            // configurar los componentes
            texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
            texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
            caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
            boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
            boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
            boton.addActionListener((ActionListener) this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase

            // adicionamos los componentes a la ventana
            this.add(texto);
            this.add(caja);
            this.add(boton);

        }

        private void configurarVentana() {

            this.setTitle("Mi primera Ventana GUI");                 // colocamos titulo a la ventana
            this.setSize(300, 300);                    //TAMAÑO DE NUESTRA VENTANA CON set.Size
            this.setLocationRelativeTo(null);                       // centramos la ventana en la pantalla
            this.setLayout(null);                                   // no usamos ningun layout, solo asi podremos dar posiciones a los componentes
            this.setResizable(false);                               // hacemos que la ventana no sea redimiensionable
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    /* hacemos que cuando se cierre la ventana termina todo proceso*/
        }


        public void actionPerformed(ActionEvent e) {
            String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
            JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
        }
    }
    public static void main(String[] args) {
        MiVentana V = new MiVentana();
        V.setVisible(true); //hacer visible la ventana con (set.Visible)
    }
}


















/*public class ventana {

    static class Ventana extends JFrame  {

       public Ventana() {

        }

        private void configurarVentana() {

        }

        private void inicializarComponentes() {// creamos los componentes
            texto = new JLabel();
            caja = new JTextField();
            boton = new JButton();
            // configuramos los componentes
            texto.setText("Inserte Nombre");    // colocamos un texto a la etiqueta
            texto.setBounds(50, 50, 100, 25);   // colocamos posicion y tamanio al texto (x, y, ancho, alto)
            caja.setBounds(150, 50, 100, 25);   // colocamos posicion y tamanio a la caja (x, y, ancho, alto)
            boton.setText("Mostrar Mensaje");   // colocamos un texto al boton
            boton.setBounds(50, 100, 200, 30);  // colocamos posicion y tamanio al boton (x, y, ancho, alto)
            boton.addActionListener(this);      // hacemos que el boton tenga una accion y esa accion estara en esta clase
            // adicionamos los componentes a la ventana
            this.add(texto);
            this.add(caja);
            this.add(boton);
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String nombre = caja.getText();                                 // obtenemos el contenido de la caja de texto
            JOptionPane.showMessageDialog(this, "Hola " + nombre + ".");    // mostramos un mensaje (frame, mensaje)
        }

        public static void main(String[] args) {
            Ventana V = new Ventana();      // creamos una ventana
            V.setVisible(true);             // hacemos visible la ventana creada
        }
    }

}*/





















