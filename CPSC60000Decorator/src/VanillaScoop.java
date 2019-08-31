
public class VanillaScoop extends ToppingsDecorator {
	
	Dessert dessert;
	
	public VanillaScoop(Dessert dessert) {
		this.dessert = dessert;
	}

	public String getDescription() {
		return dessert.getDescription() + ", Vanilla Scoop";
	}
	
	public double cost() {
		return .75 + dessert.cost();
	}
}
