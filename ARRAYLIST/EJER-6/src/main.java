

public class main {
    public static void main(String[] args) {
        entra circulo = new entra();
        circu entrada = new circu();
        volum volumen = new volum();


        System.out.println("Ingrese el radio.");

        double radio = Double.valueOf(entrada.recogerPalabra());
        circulo.areaCirculo(radio);
        circulo.longitudCirculo(radio);
        volumen.volum(radio);
    }

}
