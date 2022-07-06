public class Switch {

  // Por último, para el Switch, deberás crear la variable estacion, y distintos
  // case para las cuatro estaciones del año. Dependiendo del valor de la variable
  // estacion se deberá mandar un mensaje por consola informando de la estación en
  // la que está. También habrá que poner un default para cuando el valor de la
  // variable no sea una estación.
  public void estacion() {
    String estacion = "Primavera";
    switch (estacion) {
      case "Primavera":
        System.out.println("Estamos en Primavera");
        break;
      case "Otoño":
        System.out.println("Estamos en Otoño");
        break;
      case "Invierno":
        System.out.println("Estamos en Invierno");
        break;
      case "Verano":
        System.out.println("Estamos en Verano");
        break;
      default:
        System.out.println("No estamos en una estación");
        break;
    }
  }

}
