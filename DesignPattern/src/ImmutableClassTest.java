
final class ImmutableClassTest {
	
	 private   final int rollno;
	 private   final String college;
	 
	
	 //constructor
	 public ImmutableClassTest(int rollno,String college)
	 {
		this.rollno = rollno;
		this.college =college;
		 
		 
	 }//end constructor
	 
	 
	 //Factory method 
	 
	 public ImmutableClassTest modifyData(int rollno , String college)
	 {
		 
		 
		 return new ImmutableClassTest(rollno, college);
		 
	 }
	 
	 
	 
	 public ImmutableClassTest modifyRoll(int rollno)
	 {
		 
		 return new ImmutableClassTest(this.rollno, college);
		 
		 
	 }
	 
	 
	 public ImmutableClassTest modifyCollege(String college)
	 {
		 
		 return new ImmutableClassTest(rollno, this.college);
		 
		 
	 }
	 
	 
	 
	 
	 //Data display method 
	 
	 public void display()
	 {
		 
		 
		 System.out.println("Roll No :"+rollno);
		 System.out.println("College :"+college);
		 
	 }
	 
	 
	 
		

}
