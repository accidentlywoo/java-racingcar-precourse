package domain;

public class CarGroup {
  private Car[] cars;

  public CarGroup(Car[] cars) {
    this.cars = cars;
  }

  public Car[] getCars() {
    return this.cars;
  }
}
