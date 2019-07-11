//: exceptions/NeverCaught.java
// Ignoring RuntimeExceptions.
// {ThrowsException}

public class NeverCaught {
  static void f() {
    throw new RuntmeException("From f()");
  }
  static void g() {
  	try {
    	f();
  	} catch(Exception e) {
  		System.out.println("Exception caught");
  	}

  	System.out.println("I am OK");
  }
  public static void main(String[] args) {
    g();
  }
} ///:~
