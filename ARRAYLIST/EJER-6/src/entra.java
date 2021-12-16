

public class entra {
    private static final float PI = 3.1416f;
    //double radio;

    public entra() {
    }


    public void areaCirculo(double radio) {
        double area;
        area = PI * Math.pow(radio, 2);
        System.out.println("El area del circulo es: " + area);
    }

    public void longitudCirculo(double radio) {
        double longitud;
        longitud = (2 * PI) * radio;
        System.out.println("La longitud del circulo es: " + longitud);
    }

        public void volum(double radio){
        double volume;
        volume = 4 * PI * Math.pow(radio,3) /3;
            System.out.printf("El volumen es de: " + volume);
    }
}
