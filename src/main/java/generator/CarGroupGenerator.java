package generator;

import domain.CarGroup;

public class CarGroupGenerator {
  private final CarGroup carGroup;

  public CarGroupGenerator(String[] cars) {
    carGroup = new CarGroup(cars);
  }

  public CarGroup getRaceCarGroup() {
    return carGroup;
  }
}
