import lib.*;

public class Main{
  public static void main(String[] args){
    Car car = new Car();

    Visitor printVisitor = new PrintVisitor();
    Visitor doVisitor    = new DoVisitor();

    car.accept(printVisitor);
    car.accept(doVisitor);
  }
}

