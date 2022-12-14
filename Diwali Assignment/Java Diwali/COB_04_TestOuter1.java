
// Java static nested class

// ============= >>> Java static nested class example with instance method

class COB_04_TestOuter1
{  
  static int data=30; 
  
  static class Inner
  {  
	void msg()
	{
		System.out.println("data is "+data);
	}  
  }  
  
  public static void main(String args[])
  {  
	  COB_04_TestOuter1.Inner obj = new COB_04_TestOuter1.Inner();  
	  obj.msg();  
  }  
} 


// ============= >>>  Java static nested class example with a static method

/*
public class TestOuter2
{  
	static int data=30;  
	static class Inner{  
	static void msg()
	{
		System.out.println("data is "+data);}  
	}  
	
	public static void main(String args[]){  
	TestOuter2.Inner.msg();						//no need to create the instance of static nested class  
  }  
}  
*/



// skipped => Internal class generated by the compiler

// https://www.javatpoint.com/static-nested-class