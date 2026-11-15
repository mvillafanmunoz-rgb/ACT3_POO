package Empresa;

/**
 * Clase derivada que representa a un empleado que cobra por horas laboradas.
 */
public class EmpleadoPorHoras extends Empleado {
    
	// Atributos exclusivos de esta subclase
    private int horasTrabajadas;
    private double tarifaPorHora;

    /**
     * Constructor que reutiliza los atributos básicos con super() e inicializa los propios.
     */
    public EmpleadoPorHoras(String nombre, String idEmpleado, int horasTrabajadas, double tarifaPorHora) {
       
        super(nombre, idEmpleado, 0.0);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaPorHora = tarifaPorHora;
    }

    /**
     * Sobrescribimos el cálculo del salario basado en las horas trabajadas por la tarifa.
     */
    @Override
    public double calcularSalario() {
        return this.horasTrabajadas * this.tarifaPorHora;
    }

    /**
     * Método exclusivo para agregar más horas trabajadas al registro.
     */
    public void registrarHorasExtra(int horasExtra) {
        if (horasExtra > 0) {
            this.horasTrabajadas += horasExtra;
            System.out.println(">> Se han sumado " + horasExtra + " horas extra a " + nombre);
        }
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Tipo: Empleado por Horas");
        System.out.println("Horas Trabajadas: " + horasTrabajadas);
        System.out.println("Tarifa por Hora: $" + tarifaPorHora);
        System.out.println("Salario Total Calculado: $" + calcularSalario());
    }
}