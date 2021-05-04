package generator;

import domain.Car;
import domain.CarGroup;

public class CarGroupGenerator {
  private final CarGroup carGroup;

  public CarGroupGenerator(String[] cars) {
    int carLength = cars.length;

    Car[] cars1 = new Car[carLength];

    for (Integer i = 0; i < carLength; i++) {
      cars1[i] = new Car(cars[i].trim());
    }

    carGroup = new CarGroup(cars1);
  }

  public CarGroup getRaceCarGroup() {
    return carGroup;
  }
}
