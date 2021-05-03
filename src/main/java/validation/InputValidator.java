package validation;

import util.CarNameConstant;

public class InputValidator {
  public static void carNamecheck(String[] cars){
    for(String car : cars){
      lengthCheck(car);
    }
  }

  private static void lengthCheck(String car){
    if(car.length() > CarNameConstant.CAR_NAME_MAX_LENGTH){
      throw new IllegalArgumentException("자동차 이름은 " + CarNameConstant.CAR_NAME_MAX_LENGTH + " 글자 이하여야한다.");
    }
  }

  public static Integer countCheck(String count){
    if(!count.matches("^[0-9]*$")){
      throw new IllegalArgumentException("숫자만 입력해주세요.");
    }
    return Integer.valueOf(count);
  }
}
