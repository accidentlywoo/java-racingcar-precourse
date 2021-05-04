package generator;

import domain.CarGroup;
import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.jupiter.api.Assertions.*;

class RaceGeneratorTest {

  @Test
  public void 자동차_레이싱_테스트_GREEN(){
    // given
    final CarGroup carGroup = 자동차그룹_픽스처();

    int InputCount = 10;

    // when
    RaceGenerator raceGenerator = new RaceGenerator(InputCount, carGroup);

    raceGenerator.run();

    raceGenerator.getWinRaceCar();
    // than
	}

	@Test
  @DisplayName("레이싱 생성기에서 run 메소드를 실행하지 않고, 승리자를 구하려 했을 때. ")
	public void 자도차_레이싱_테스트_RED(){
    // given
    final CarGroup carGroup = 자동차그룹_픽스처();

    int InputCount = 10;

    // when // than
    RaceGenerator raceGenerator = new RaceGenerator(InputCount, carGroup);

    assertThatThrownBy(raceGenerator::getWinRaceCar)
        .isInstanceOf(UnsupportedOperationException.class)
        .hasMessageContaining("게임을 실행시켜야. 승리자를 구분할 수 있습니다.");

	}

	private CarGroup 자동차그룹_픽스처(){
    String test1 = "test1";
    String test2 = "test2";
    String test3 = "test3";

    String[] cars = new String[]{test1, test2, test3};

    // when
    CarGroupGenerator carGroupGenerator = new CarGroupGenerator(cars);

    // than
    assertThat(carGroupGenerator.getRaceCarGroup()).isNotNull();

    assertThat(carGroupGenerator.getRaceCarGroup().getCars())
        .extracting("name", "runCount")
        .contains(
            Tuple.tuple(test1, 0),
            Tuple.tuple(test2, 0),
            Tuple.tuple(test3, 0)
        );
    return carGroupGenerator.getRaceCarGroup();
  }
}