package validation;

public class InputValidator {
	private static final int CAR_NAME_MAX_LENGTH = 5;

	public static void carNamecheck(String[] cars){
		for(String car : cars){
			lengthCheck(car);
		}
	}

	private static void lengthCheck(String car){
		if(car.length() > CAR_NAME_MAX_LENGTH){
			throw new IllegalArgumentException("자동차 이름은 "+CAR_NAME_MAX_LENGTH+" 글자 이하여야한다.");
		}
	}

	public static void countCheck(String count){
		if(!count.matches("^[0-9]*$")){
			throw new IllegalArgumentException("숫자만 입력해주세요.");
		}
	}
}
