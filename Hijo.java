public class Hijo extends Persona {
    // Atributo específico de la clase Hijo
    private String escuela;

    // Constructor que utiliza el constructor de la clase madre
    public Hijo(String nombre, int edad, String direccion, String escuela) {
        super(nombre, edad, direccion);  // Llamada al constructor de Persona
        this.escuela = escuela;
    }

    // Getter y Setter para el atributo escuela
    public String getEscuela() {
        return escuela;
    }

    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    // Método toString para imprimir la información del hijo
    @Override
    public String toString() {
        return super.toString() + ", Escuela: " + escuela;
    }
}
