

import java.util.Scanner;

public class circu {

    private String entradaTeclado;
    Scanner sc = new Scanner(System.in);

    public circu() {
        entradaTeclado = "";
    }

    public String recogerPalabra() {
        entradaTeclado = sc.nextLine();
        return entradaTeclado;
    }

}