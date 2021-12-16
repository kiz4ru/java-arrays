public class Alumno {

       private int codalu;
       private String nombre;
       private  int tel;
       private String domici;


    public Alumno(){
        nombre = "";
        codalu = 0;
        tel = 0;
        domici ="";
    }

    public String getDomici() {
        return domici;
    }

    public void setDomici(String domici) {
        this.domici = domici;
    }

    public int getCodalu() {
        return codalu;
    }

    public void setCodalu(int codalu) {
        this.codalu = codalu;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTel() {
        return tel;
    }

    public void setTel(int tel) {
        this.tel = tel;
    }

}
