public class Asesor implements Trabajador{

  private double ventas;

  public Asesor(double ventas){
    this.ventas=ventas;
  }

  public double ventas(){
    return ventas;
  }

  public double pagar(){
    return ventas *1.30;
  }
}
