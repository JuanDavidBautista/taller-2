package Reto4;

public class Ejmpleado extends Persona{
    //atributos
    String cargo;
    double valorHora;
    double horasTrabajadas;
    String departamento;

     //constructor
    public Ejmpleado(String cargo, double valorHora, double horasTrabajadas, String departamento) {
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    public Ejmpleado(String tipoDoc, int documento, String nombre, String apellido, float peso, float estatura,
            int edad, String sexo, String cargo, double valorHora, double horasTrabajadas, String departamento) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
        this.departamento = departamento;
    }
    //metodos accesores
    public String getCargo() {
        return cargo;
    }
    public double getValorHora() {
        return valorHora;
    }
    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public String getDepartamento() {
        return departamento;
    }

    //metodos
    public void calcularHonorarios(){
        double total, reteica, totalPagar;
        total = valorHora * horasTrabajadas;
        reteica = (total * 0.966) / 1000;
        totalPagar  = total - reteica;
    }
   
    
    
}
