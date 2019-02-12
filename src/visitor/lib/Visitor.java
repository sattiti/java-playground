package lib;

public interface Visitor{
  public void visit(Wheel wheel);
  public void visit(Engine engine);
  public void visit(Body body);
  public void visitCar(Car car);
  public void visitVehicle(Vehicle vehicle);
}
