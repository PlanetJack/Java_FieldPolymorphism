package TireField;

public class KumhoTire extends Tire {

	// Field
	// Constructor
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// Method
	//Roll 을 재정의 함 (Tire 클래스의 Roll 부분을 보면 출력 내용만 차이가 있음)
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if (accumulatedRotation < maxRotation) {
			System.out.println(
					location + "How much left KumhoTire : " + (maxRotation - accumulatedRotation) + " Count ");
			return true;
		} else {
			System.out.println("***" + location + "Flat Kumho Tire ");
			return false;
		}

	}
}