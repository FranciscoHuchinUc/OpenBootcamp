
class segundaParte {

  public static void main(String[] args) {
    coche miCoche = new coche();
    miCoche.agregarPuerta();
    System.out.println(miCoche.numeroPuerta);
  }

}

class coche {

  public int numeroPuerta = 0;

  public void agregarPuerta() {
    this.numeroPuerta++;
  }

}
