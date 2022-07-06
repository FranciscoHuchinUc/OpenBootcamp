
public class Main {
  public static void main(String[] args) {
    // Usando un if, crear una condición que compare si la variable numeroIf es
    // positivo, negativo, o 0.
    int numeroIf = -5;
    if (numeroIf > 0) {
      System.out.println("El numero es positivo");
    } else if (numeroIf < 0) {
      System.out.println("El numero es negativo");
    }

    // Crea un bucle While, este bucle tendrá que tener como condición que la
    // variable numeroWhile sea inferior a 3
    int numeroWhile = -5;
    while (numeroWhile < 3) {
      numeroWhile++;
      System.out.println(numeroWhile);
    }

    // Para el bucle Do While, deberás crear la misma estructura que en el While,
    // pero solo se debe ejecutar una vez.
    int numeroDoWhile = 1;
    do {
      numeroDoWhile++;
      System.out.println(numeroDoWhile);
    } while (numeroDoWhile < 3);

    // Para el bucle For, crea una variable numeroFor, esta variable tendrá como
    // valor 0 y su condición será que la variable sea igual o menor que 3, se irá
    // incrementando en 1 su valor cada vez que se ejecute y deberá mostrarse por
    // pantalla.
    int numeroFor = 0;
    for (int i = 0; i <= 3; i++) {
      numeroFor++;
      System.out.println(numeroFor);
    }

    // Por último, para el Switch, deberás crear la variable estacion, y distintos
    // case para las cuatro estaciones del año. Dependiendo del valor de la variable
    // estacion se deberá mandar un mensaje por consola informando de la estación en
    // la que está. También habrá que poner un default para cuando el valor de la
    // variable no sea una estación.
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
