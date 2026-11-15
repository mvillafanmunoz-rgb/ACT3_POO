package Empresa;
/**
 * Clase principal para probar la jerarquía de herencia, polimorfismo y métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE EMPLEADOS ===");

     //Instanciación de objetos de las subclases
        EmpleadoTiempoCompleto emp1 = new EmpleadoTiempoCompleto("Ana Gómez", "TC-101", 18000.0, 2400.0);
        EmpleadoPorHoras emp2 = new EmpleadoPorHoras("Carlos Pérez", "PH-202", 120, 150.0);

     //Probando métodos heredados, sobrescritos y exclusivos para EmpleadoTiempoCompleto
        System.out.println("\n--- DATOS DE EMPLEADO 1 ---");
        emp1.mostrarInformacion(); 
        emp1.programarRevisionMedica(); 

     //Probando métodos para EmpleadoPorHoras
        System.out.println("\n--- DATOS DE EMPLEADO 2 ---");
        emp2.mostrarInformacion(); 
        emp2.registrarHorasExtra(15); 
        System.out.println("Salario actualizado tras horas extra: $" + emp2.calcularSalario());
    }
}