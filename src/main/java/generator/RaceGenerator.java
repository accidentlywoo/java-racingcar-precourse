package generator;

import domain.CarGroup;
import domain.WinRaceCar;
import ui.RacingDrawing;

import java.util.List;

public class RaceGenerator {
  private final String GET_WINNER_EXCEPTION_MESSAGE = "게임을 실행시켜야. 승리자를 구분할 수 있습니다.";

  private final Integer count;
  private final CarGroup carGroup;
  private WinRaceCar winRaceCar;

  public RaceGenerator(Integer count, CarGroup carGroup) {
    this.count = count;
    this.carGroup = carGroup;
  }

  public void run() {
    final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(carGroup);
    CarGroup carGroup;

    for (Integer i = 0; i < count; i ++){
      carGroup = randomNumberGenerator.gogoCar();

      new RacingDrawing(carGroup.getCars());

      this.winRaceCar = new WinRaceCar(carGroup);
    }
  }

  public List<String> getWinRaceCar() {
    if (winRaceCar == null) {
      throw new UnsupportedOperationException(GET_WINNER_EXCEPTION_MESSAGE);
    }

    return this.winRaceCar.getCarNames();
  }
}
