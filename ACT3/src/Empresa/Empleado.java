package Empresa;


public class Empleado {
	// Atributos protegidos para que las clases derivadas puedan acceder a ellos directamente
    protected String nombre;
    protected String idEmpleado;
    protected double salarioBase;

   
    public Empleado(String nombre, String idEmpleado, double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }
    /**
     * Método para calcular el salario. 
     * En la clase base retorna el salario base, pero será sobrescrito en las subclases.
     */
    public double calcularSalario() {
        return this.salarioBase;
    }
    /**
     * Muestra la información general del empleado.
     * Reutilizable por todas las clases derivadas.
     */
    public void mostrarInformacion() {
        System.out.println("----------------------------------------");
        System.out.println("ID Empleado: " + idEmpleado);
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario Base: $" + salarioBase);
    }
}