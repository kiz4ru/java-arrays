import javax.swing.*;

public class main {
    public static void main(String[] args){

        String frase;//
        int [] numeVec;//contador de cada letra

        frase= JOptionPane.showInputDialog("Introduce una frase ");
       frase = frase.toLowerCase(); /*PONEMOS QUE TODO SEA MINUSCULAS PARA CONTBILIZAR LAS MAYUSCULAS*/

       /*
 cada posicion de numevec guardara el numero de ocurrencias de una letra

'Z'es un char con un valor integral de 90.
'A'es un char con un valor integral de 65.

90 - 65 + 1 = 26

 */
       numeVec = new int['z'-'a' +1];//tantos componentes como letras


        //1:recorre caracter a caracter
       for (int i=0; i<frase.length(); i++){

            if (Character.isLetter(frase.charAt(i))){
                //si el i-esimo es una letra

                numeVec[frase.charAt(i) - 'a']++;
                //incrementa el contador de esa letra
            }
       }

        for (int i=0; i<'z'-'a';i++){
            //mostramos numevec
            if (numeVec[i] != 0){
                //solo las letras que estan en la frase
                JOptionPane.showMessageDialog(null," La letra " + (char) (i +'a') + " se repite " + numeVec[i] + " veces");
            }
        }

    }
}
