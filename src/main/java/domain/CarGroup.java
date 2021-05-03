package domain;

public class CarGroup {
  private Car[] cars;

  public CarGroup(Integer carsLength) {
    cars = new Car[carsLength];
  }

  public void putCarInGroup(Car car, Integer index){
    cars[index] = car;
  }
}
