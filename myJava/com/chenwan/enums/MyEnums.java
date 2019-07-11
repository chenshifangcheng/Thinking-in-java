enum MyEnums {
	ONE, TWO, THREE
}

//  javap MyEnums
// Compiled from "MyEnums.java"
// final class MyEnums extends java.lang.Enum<MyEnums> {
//   public static final MyEnums ONE;
//   public static final MyEnums TWO;
//   public static final MyEnums THREE;
//   public static MyEnums[] values();
//   public static MyEnums valueOf(java.lang.String);
//   static {};
// }