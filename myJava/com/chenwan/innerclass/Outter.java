public class Outter {

    public Inner getInner(String name, int age) {
        return new Inner() {
            public void display() {
                System.out.println("name = " + name + " age = " + age);
            }
        };
    }

    public static void main(String[] args) {
        String s = new String("Rose");
        Outter out = new Outter();
        Inner inner = out.getInner(s, 10);
        inner.display();
    }
}