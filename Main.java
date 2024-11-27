public class Main {
    public static void main(String[] args) {
        // Crear un objeto de la clase Persona (madre)
        Persona madre = new Persona("Sophie", 27, "Conocoto");
        
        // Crear un objeto de la clase Hijo
        Hijo hijo = new Hijo("Carlos", 12, "Conocoto", "LEV");
        
        // Imprimir la información
        System.out.println(madre.toString());
        System.out.println(hijo.toString());
    }
}
