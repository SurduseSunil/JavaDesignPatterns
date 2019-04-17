
public class BuilderDesignPatternTest {

	public static void main(String[] args) {
	
		
		OrderBuilder ob = new OrderBuilder();
		
		int totalprice = ob.calculateOrderPrice();
		
		System.out.println("Total Bill (1.Burger"+new Burger().burgerPrice()+" 1.Fries"+new Fries().friesPrice()+" 1.Colddrink"+new ColdDrinks().coldDrinkPrice()+" )->"+totalprice);

	}

}
