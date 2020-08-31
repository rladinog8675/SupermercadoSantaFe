package PackageMain;

import java.io.Serializable;

public class Empleado implements Serializable{

    public Empleado(int cedula, String nombre, String departamento, String posicion, double salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.departamento = departamento;
        this.posicion = posicion;
        this.salario = salario;
    }
    
    private int cedula;
    private String nombre;
    private String departamento;
    private String posicion;
    private double salario;

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
}
