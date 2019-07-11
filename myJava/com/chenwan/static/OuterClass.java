import static com.chenwan.util.Utils.*;

/* 非静态内部类中不能有static成员变量(i1)，却可以有static final 属性的编译期常量(i2)，
而不能有static final 属性的运行期常量(i3)。*/
public class OuterClass {

	class Inner {
		static int i1 = 1; //Compile error
		static final int i2 = 2;//Compile correct
		static final int i3 = new Integer(3);//Compile error

		static int getValue() {//Compile error
			print("getValue");
			//return 3;
		}
	}

	public static void main(String[] args) {
		print(Inner.i2);
	}
}

/*对于Java中的常量其实可以分为编译期常量和非编译期常量，编译期常量是指，在程序编译阶段（不需要加载类的字节码）
就可以去确定具体值的常量，其中会涉及到编译期常量折叠（编译器可以根据语法分析计算出值的常量表达式进行计算赋值）。
非编译期常量（运行期常量）是指，在程序运行阶段（需要加载类的字节码），才可以确定具体值的常量
（编译期无法折叠，编译器只对所有可能修改它的地方进行检查和报错）。

当我们通过类名访问被 static final 修饰的常量时，如果该变量为编译期常量则该类不会被JVM加载，
如果该常量为非编译期常量则该类会被JVM加载，当通过类名访问被 static 修饰的变量时，都会触发该类被JVM加载
--------------------- 
作者：AndyRenJie 
来源：CSDN 
原文：https://blog.csdn.net/qq_20328181/article/details/81391956 
版权声明：本文为博主原创文章，转载请附上博文链接！*/