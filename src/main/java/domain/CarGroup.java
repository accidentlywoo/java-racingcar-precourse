package domain;

public class CarGroup {
  private Car[] cars;

  public CarGroup(String[] cars) {
    this.cars = new Car[cars.length];

    for (int i = 0; i < cars.length; i++){
      putCarInGroup(new Car(cars[i]), i);
    }
  }

  private void putCarInGroup(Car car, Integer index){
    cars[index] = car;
  }

  public Car[] getCarGroup(){
    return this.cars;
  }
}
