
public class TestImmutatble {
	
	
	
	
	 //main method 
	 
	 
	 public static void main(String args [])
	 {
		 
		 ImmutableClassTest ict = new ImmutableClassTest(12463, "GCEK");
		 
		 //Hash code before modification
		 System.out.println("Hashcode Before  Class :"+ict.hashCode());
		 
		 
		 //call to display method
		 
		 ict.display();
		 
		 //modify data 
		ImmutableClassTest ict2 = ict.modifyData(12464, "Walchand");
		 
		 //Hash code after modification
		 
		 
		 System.out.println("Hashcode Afterr Class :"+ict2.hashCode());
		 
      //call to display method
		 
		 ict2.display();
		 
		 
		 
	 }


}
