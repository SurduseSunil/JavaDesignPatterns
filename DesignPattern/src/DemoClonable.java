
public class DemoClonable implements java.lang.Cloneable{//implement clonable ineterface //start
	
	
	public int id ;
	public String  name;
	
	public DemoClonable(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}//param constructor
	
	
	public  DemoClonable()
	{
		
		
	}//no param constructor
	
	
	//display method 
	
	
	public void display()
	{
		
		System.out.println("Id :"+id);
		System.out.println("Name :"+name);
		
		
	}
	
	
	public Object myclone() throws Exception{
		
		
		Object obj = super.clone();
		
		return obj;
		
		
	}
	
	
	
	
	
	
	
	

}
