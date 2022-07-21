package buoi6.decorator.starbuzz;

public class StarbuzzCoffee {

	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription()
				+ " $" + beverage.cost());

		Beverage beverage2 = new DarkRoast();
		beverage2 = new Mocha(beverage2);
		beverage2 = new Mocha(beverage2);
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());

		Beverage beverage3 = new HouseBlend();
		beverage3 = new Soy(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());

		Beverage beverage4 = new HouseBlend();
		beverage4 = new Milk(beverage4);
		beverage4 = new Mocha(beverage4);

		System.out.println(beverage4.getDescription() + " $ " + beverage4.cost());

		Beverage beverage5 = new DarkRoast();
		beverage5 = new Mocha(beverage5);
		beverage5 = new Whip(beverage5);
		System.out.println(beverage5.getDescription() + " $" + beverage5.cost());
	}
}
