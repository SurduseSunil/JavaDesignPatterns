
public class DriverSingleton {

	public static void main(String args[]) throws CloneNotSupportedException 
	{
		Singleton s1 = Singleton.object();
		Singleton s2 = Singleton.object();
		
		Singleton s3 =(Singleton)s2.clone();
		//System.out.println("Object 1 :"+s1.a);
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
		
		
		
	}

	
	
	
}
