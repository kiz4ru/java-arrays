public class Principal {
    public static void main(String[] args) {

        Alumno a[] = new Alumno[2];

        a[0].setCodalu(1);
        a[0].setNombre("DAAAAA");
        a[0].setTel(943237282);
        a[0].setDomici("calle");

        for (int i=0; i<a.length;i++){
            System.out.println("Poncodifgo");
            System.out.println("Dime nombre");
            System.out.println("Telefono");
            System.out.println("Dime domiciolio");
        }

    }
}
