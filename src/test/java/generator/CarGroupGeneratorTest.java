package generator;

import org.assertj.core.groups.Tuple;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class CarGroupGeneratorTest {

  @Test
  public void 자동차_그룹_생성_테스트_GREEN(){
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
  }
}