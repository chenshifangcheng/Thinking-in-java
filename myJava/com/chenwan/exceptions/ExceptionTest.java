import static com.chenwan.util.Utils.*;

public class ExceptionTest {
	float divisionOperate(float dividend, float divisor) {
		return dividend/divisor;
	}

	public static void main(String[] args) {
		ExceptionTest test = new ExceptionTest();
		ExceptionTest test1 = null;
		print(test1.divisionOperate(3, 0));
	}
}