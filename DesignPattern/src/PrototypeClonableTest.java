
public class PrototypeClonableTest {

	public static void main(String[] args) throws Exception {
		
		DemoClonable dc = new DemoClonable(12463,"SunilSudruse");
		
		System.out.println("Hashcode Object "+dc.hashCode());
		dc.display();
		
		DemoClonable dc2 = (DemoClonable)dc.myclone();
		
		System.out.println("Hashcode Clone Object "+dc2.hashCode());
		dc2.display();
		
		

	}

}
