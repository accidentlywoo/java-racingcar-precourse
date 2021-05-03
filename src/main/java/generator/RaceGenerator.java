package generator;

import domain.CarGroup;

public class RaceGenerator {
  private final Integer count;
  private final CarGroup carGroup;

  public RaceGenerator(Integer count, CarGroup carGroup) {
    this.count = count;
    this.carGroup = carGroup;
  }

  public void run() {
    final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(carGroup);

    for (int i = 0; i < count; i ++){
      randomNumberGenerator.gogoCar();
    }

  }
}
