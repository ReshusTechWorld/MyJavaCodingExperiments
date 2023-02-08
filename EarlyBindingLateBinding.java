package com.java.core.binding;

public class EarlyBindingLateBinding {
	public static void main(String args[]) {
		methodM1(new A());
		methodM1(new B());
		methodM1(new C());
	}
	static String methodM1(A a1) {
		a1.method1();
		a1.method2();// Shows waring since it is static method and can directly call using class name A.method2()
		return "Successfully executed!";
	}
}
class A{
    void method1() {
		System.out.println("non static method in class A");
	}
    static void method2() {
		System.out.println("static method in class A");
	}
}
class B extends A{
	@Override
    void method1() {
		System.out.println("non static method in class B");
	}
    static void method2() {
		System.out.println("static method in class B");
	}
}
class C extends A{
	@Override
    void method1() {
		System.out.println("non static method in class C");
	}
    static void method2() {
		System.out.println("static method in class C");
	}
}

/*
 * Execution
 * 
 * Static,final and private methods are  always perform early binding(compile time polymorphism)
 * non static methods are always perform late binding(run time polymorphism)- works based on instance
 * 
 */
 