package Empresa;
/**
 * Clase derivada que representa a un empleado contratado a tiempo completo.
 * Hereda de la clase Empleado y añade lógica específica para bonos anuales.
 */
public class EmpleadoTiempoCompleto extends Empleado {
    
	// Atributo exclusivo de esta subclase
    private double bonoAnual;

    /**
     * Constructor que utiliza la palabra clave 'super' para reutilizar el constructor de la clase base.
     */
    public EmpleadoTiempoCompleto(String nombre, String idEmpleado, double salarioBase, double bonoAnual) {
        super(nombre, idEmpleado, salarioBase); 
        this.bonoAnual = bonoAnual;
    }

   
    @Override
    public double calcularSalario() {
       
        double salarioMensualConBono = super.calcularSalario() + (bonoAnual / 12);
        return salarioMensualConBono;
    }

    /**
     * Método exclusivo de esta subclase para gestionar beneficios de tiempo completo.
     */
    public void programarRevisionMedica() {
        System.out.println(">> [Beneficio T.C.] Se ha programado la revisión médica anual para " + nombre);
    }

    
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion(); // Reutiliza la lógica de impresión de la clase base
        System.out.println("Tipo: Empleado de Tiempo Completo");
        System.out.println("Bono Anual: $" + bonoAnual);
        System.out.println("Salario Total Calculado (Mensual con bono): $" + calcularSalario());
    }
}