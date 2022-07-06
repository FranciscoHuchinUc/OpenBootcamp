public class Main {

  public static void main(String[] args) {
    Cliente cliente = new Cliente();
    cliente.setNombre("Juan");
    cliente.setEdad(20);
    cliente.setTelefono(123456789);
    cliente.setCredito("credito");
    System.out
        .println(
            cliente.getNombre() + " " + cliente.getEdad() + " " + cliente.getTelefono() + " " + cliente.getCredito());

    Trabajador trabajador = new Trabajador();
    trabajador.setNombre("Pedro");
    trabajador.setEdad(28);
    trabajador.setTelefono(1563789245);
    trabajador.setSalario(1000);
    System.out
        .println(
            trabajador.getNombre() + " " + trabajador.getEdad() + " " + trabajador.getTelefono() + " "
                + trabajador.getSalario());
  }

}

class Persona {
  private String nombre;
  private int edad;
  private int telefono;

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public int getEdad() {
    return edad;
  }

  public void setEdad(int edad) {
    this.edad = edad;
  }

  public int getTelefono() {
    return telefono;
  }

  public void setTelefono(int telefono) {
    this.telefono = telefono;
  }

}

class Cliente extends Persona {
  private String credito;

  public String getCredito() {
    return credito;
  }

  public void setCredito(String credito) {
    this.credito = credito;
  }

}

class Trabajador extends Persona {

  private int salario;

  public int getSalario() {
    return salario;
  }

  public void setSalario(int salario) {
    this.salario = salario;
  }

}
