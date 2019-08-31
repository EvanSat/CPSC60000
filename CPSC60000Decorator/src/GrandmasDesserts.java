
public class GrandmasDesserts {

	public static void main(String[] args) {
		Dessert dessert = new ChocolateChipCookie();
		System.out.println(dessert.getDescription() + " $" + dessert.cost());

		Dessert dessert2 = new YellowCake();
		dessert2 = new VanillaScoop(dessert2);
		dessert2 = new VanillaScoop(dessert2);
		System.out.println(dessert2.getDescription() + " $" + dessert2.cost());
	}

}
