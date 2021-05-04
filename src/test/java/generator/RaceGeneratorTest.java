package generator;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class RaceGeneratorTest {

  @Test
  public void 자동차_레이싱_테스트(){
    // given
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

    int InputCount = 10;
    // when

    RaceGenerator raceGenerator = new RaceGenerator(InputCount, carGroupGenerator.getRaceCarGroup());
    final List<String> winnerList = raceGenerator.run();

    // than
    assertThat(winnerList)
      .containsAnyOf(
            test1,
            test2,
            test3
        );
	}
}