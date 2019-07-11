public class OutterClass {
	public void display(final String name, String age) {
		class InnerClass {
			void display() {
				System.out.println(name + age);
			}
		}
	}
}