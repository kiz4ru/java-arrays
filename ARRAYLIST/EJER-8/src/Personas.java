import java.time.LocalDate;
import java.time.Period;

public class Personas {
    private String nombre;
    private String fecha;
    private String direccion;
    private int codigo;
    private String ciudad;

    public Personas(String nombre, String fecha, String direccion, int codigo, String ciudad) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.direccion = direccion;
        this.codigo = codigo;
        this.ciudad = ciudad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int calcular(){
        
        LocalDate fechanac = LocalDate.of(fecha);

        LocalDate ahora = LocalDate.now();

        Period periodo = Period.between(LocalDate.parse(fecha),ahora);

        return periodo.getYears();
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}
