
public class Singleton implements Cloneable  {
	
	private static Singleton single =null;
	public int a;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
	
		return super.clone();
	}

	private Singleton() {
		a = 12;
		
	}
	
	public static Singleton object() {
		
		if(single==null)
		{
			
			single = new Singleton();
		}
		
		
		return single;
		
	}

}
