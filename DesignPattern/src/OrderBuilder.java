
public class OrderBuilder {

	
	public int calculateOrderPrice()
	{
		
		return new Burger().burgerPrice()+new Fries().friesPrice()+new ColdDrinks().coldDrinkPrice();
		
		
		
	}
	
	
}
