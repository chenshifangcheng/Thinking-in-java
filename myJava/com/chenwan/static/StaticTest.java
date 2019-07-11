
import static com.chenwan.util.Utils.*;

class StaticClass {
	public StaticClass() {
		print("StaticClass initilize");
	}

	static int i = 5;

	static void f() {
		print("f() invoke");
	}

	void g() {
		print("f() invoke");
	}
}

public class StaticTest {
	public static void main(String[] args) {
		//int i = StaticClass.i;
		//StaticClass.f();
		new StaticClass();
	}
}