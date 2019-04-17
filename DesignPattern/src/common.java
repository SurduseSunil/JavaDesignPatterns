//common interface
public interface common {  //Start I
	
	public void xyz();
	
	
	
	
	

} //end I


class test1 implements common{ //test1 class

	
	public test1()
	{
		
		
	System.out.println("Test1 Constructor");	
		
	}
	
	
	@Override
	public void xyz() {
		System.out.println("Method we overriden in test1");
		
	}
	
	
	
	
	
}//end test1 class



class test2 implements common { //start test 2
	
	
	public test2()
	{
		
		
	System.out.println("Test2 Constructor");	
		
	}

	@Override
	public void xyz() {
		System.out.println("Method we overriden in test2");
		
	} 
	
	
} //end test2


 class testAbstractFactoryPattern {  //start pattern
	
	//factory method
	 
	 public static common m1(String name)
	 {
		 if(name.equals("a"))
			 return new test1();
		 
		 else if(name.equals("b"))
			 return new test2();
		 
		 
		 else
		 
		return null;
		 
		 
		 
		 
	 }
	 
	 
	 
	
	
}// end pattern 
 
 
 
 
 
 
 