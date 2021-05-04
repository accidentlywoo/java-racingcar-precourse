package generator;

import domain.CarGroup;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class RandomNumberGeneratorTest {
  @Test
  public void 랜덤수_생성_후_3_이상_GO_미만_STOP(){
    // given
    String test1 = "test1";
    String test2 = "test2";
    String test3 = "test3";

    String[] cars = new String[]{test1, test2, test3};

    CarGroupGenerator carGroupGenerator = new CarGroupGenerator(cars);

    final RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator(carGroupGenerator.getRaceCarGroup());

    // when
    final CarGroup carGroup = randomNumberGenerator.gogoCar();

    // than
    assertThat(carGroup.getCars()).isNotEmpty();

    assertThat(carGroup.getCars())
        .extracting("name")
        .contains(
						test1,
						test2,
						test3
				);

		assertThat(carGroup.getCars())
				.extracting("runCount")
				.isNotEqualTo(0);
	}
}