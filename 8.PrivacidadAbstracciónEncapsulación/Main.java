
public class Main {

  public static void main(String[] args) {
    Persona persona = new Persona();
    persona.setNombre("Juan");
    persona.setEdad(20);
    persona.setTelefono(123456789);
    System.out.println(persona.getNombre());
    System.out.println(persona.getEdad());
    System.out.println(persona.getTelefono());
  }

}
