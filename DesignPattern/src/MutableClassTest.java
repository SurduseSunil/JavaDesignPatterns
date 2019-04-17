
public class MutableClassTest {
	
	public int a;
	
	
	
	
	
	

	public MutableClassTest(int a) {
		
		this.a = a;
	}
	
	public void Modifydata()
	{
		
		a=a*a;
		
	}
	
	
	public void display()
	{
		System.out.println("a value :"+a);
		
		
	}







	public static void main(String[] args) {
		
		
		MutableClassTest mct = new MutableClassTest(10);
		
		System.out.println(mct.hashCode());
		
		mct.display();
		
		System.out.println(mct.hashCode());
		
		mct.Modifydata();
		mct.display();
		
		
		
		

	}

}
