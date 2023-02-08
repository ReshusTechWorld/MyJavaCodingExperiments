package com.java.core.finalmodifier;

public final class finalModifier {
	
	public static final int a = 10; //final variable act like a constant, pi=3.14
	//public final int c;//final variables will not be initialized with default values.
	
	public final int c;
	
	public finalModifier(){
		this.c= 5;
	}

	public static int b;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//System.out.println(a++); // can't change the value of 'a', since it is final
		b=10;
		System.out.println(b++); 
	}
}
class Test{ 
	
	int a = 10;
	
	public final void Display() {
		
		System.out.println(a++); 
		
	}
	public void showMessage() {
		
		System.out.println("Inside the class Test"); 
		
	}
}

class Test1 extends Test{
	int b = 10;
	/*@Override
	public void Display() { //can't override final method Display
		
		System.out.println(b++); 
		
	}*/
	
	@Override
	public void showMessage() {
		
		System.out.println("Inside the class Test1"); 	
	}
	
}
	
/* class Demo extends finalModifier{ //final class finalModifier can't be inherited
	
}*/


/*
 * final keyword can be used with variable,method and class
 * 
 * if we declare a variable as final, it will act like a constant
 * we can't modify the value of a final variable
 * final variables will not be initialized with default values.Therefore, it is mandatory to initialize 
 * final variables once you declare them.
 * Still, if you try to declare final variables without initialization that will generate a compilation error saying 
 * "variable variable_name not initialized in the default constructor"
 * 
 * if we declare a method as final, we can't override that method 
 * 
 * if we declare a class as final, we can't inherit that class 
 */
 