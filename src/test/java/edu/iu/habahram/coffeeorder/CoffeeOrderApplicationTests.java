package edu.iu.habahram.coffeeorder;

import edu.iu.habahram.coffeeorder.model.Beverage;
import edu.iu.habahram.coffeeorder.model.DarkRoast;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CoffeeOrderApplicationTests {

	@Test
	void DarkRoast_Whip() {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new edu.iu.habahram.coffeeorder.model.Mocha(darkRoast);
		assertEquals("Dark roast, Mocha", darkRoast.getDescription());
		assertEquals(2.29, darkRoast.cost());
	}

	@Test
	void DarkRoast_Soy() {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new edu.iu.habahram.coffeeorder.model.Soy(darkRoast);
		assertEquals("Dark roast, Soy", darkRoast.getDescription());
		assertEquals(2.26, darkRoast.cost());
	}

	@Test
	void DarkRoast_Milk() {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new edu.iu.habahram.coffeeorder.model.Milk(darkRoast);
		assertEquals("Dark roast, Milk", darkRoast.getDescription());
		assertEquals(2.39, darkRoast.cost());
	}

	@Test
	void DarkRoast_Mocha() {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new edu.iu.habahram.coffeeorder.model.Mocha(darkRoast);
		assertEquals("Dark roast, Mocha", darkRoast.getDescription());
		assertEquals(2.29, darkRoast.cost());
	}

	@Test
	void Decaf_Whip() {
		Beverage decaf = new edu.iu.habahram.coffeeorder.model.Decaf();
		decaf = new edu.iu.habahram.coffeeorder.model.Whip(decaf);
		assertEquals("Decaf, Whip", decaf.getDescription());
		assertEquals(1.53, decaf.cost());
	}

	@Test
	void Decaf_Soy() {
		Beverage decaf = new edu.iu.habahram.coffeeorder.model.Decaf();
		decaf = new edu.iu.habahram.coffeeorder.model.Soy(decaf);
		assertEquals("Decaf, Soy", decaf.getDescription());
		assertEquals(1.55, decaf.cost());
	}

	@Test
	void Decaf_Milk() {
		Beverage decaf = new edu.iu.habahram.coffeeorder.model.Decaf();
		decaf = new edu.iu.habahram.coffeeorder.model.Milk(decaf);
		assertEquals("Decaf, Milk", decaf.getDescription());
		assertEquals(1.6800000000000002, decaf.cost());
	}

	@Test
	void Decaf_Mocha() {
		Beverage decaf = new edu.iu.habahram.coffeeorder.model.Decaf();
		decaf = new edu.iu.habahram.coffeeorder.model.Mocha(decaf);
		assertEquals("Decaf, Mocha", decaf.getDescription());
		assertEquals(1.58, decaf.cost());
	}

	@Test
	void Espresso_Whip() {
		Beverage espresso = new edu.iu.habahram.coffeeorder.model.Espresso();
		espresso = new edu.iu.habahram.coffeeorder.model.Whip(espresso);
		assertEquals("Espresso, Whip", espresso.getDescription());
		assertEquals(1.59, espresso.cost());
	}

	@Test
	void Espresso_Soy() {
		Beverage espresso = new edu.iu.habahram.coffeeorder.model.Espresso();
		espresso = new edu.iu.habahram.coffeeorder.model.Soy(espresso);
		assertEquals("Espresso, Soy", espresso.getDescription());
		assertEquals(1.61, espresso.cost());
	}

	@Test
	void Espresso_Milk() {
		Beverage espresso = new edu.iu.habahram.coffeeorder.model.Espresso();
		espresso = new edu.iu.habahram.coffeeorder.model.Milk(espresso);
		assertEquals("Espresso, Milk", espresso.getDescription());
		assertEquals(1.7400000000000002, espresso.cost());
	}

	@Test
	void Espresso_Mocha() {
		Beverage espresso = new edu.iu.habahram.coffeeorder.model.Espresso();
		espresso = new edu.iu.habahram.coffeeorder.model.Mocha(espresso);
		assertEquals("Espresso, Mocha", espresso.getDescription());
		assertEquals(1.6400000000000001, espresso.cost());
	}

	@Test
	void HouseBlend_Whip() {
		Beverage houseBlend = new edu.iu.habahram.coffeeorder.model.HouseBlend();
		houseBlend = new edu.iu.habahram.coffeeorder.model.Whip(houseBlend);
		assertEquals("House Blend, Whip", houseBlend.getDescription());
		assertEquals(1.9, houseBlend.cost());
	}

	@Test
	void HouseBlend_Soy() {
		Beverage houseBlend = new edu.iu.habahram.coffeeorder.model.HouseBlend();
		houseBlend = new edu.iu.habahram.coffeeorder.model.Soy(houseBlend);
		assertEquals("House Blend, Soy", houseBlend.getDescription());
		assertEquals(1.92, houseBlend.cost());
	}

	@Test
	void HouseBlend_Milk() {
		Beverage houseBlend = new edu.iu.habahram.coffeeorder.model.HouseBlend();
		houseBlend = new edu.iu.habahram.coffeeorder.model.Milk(houseBlend);
		assertEquals("House Blend, Milk", houseBlend.getDescription());
		assertEquals(2.05, houseBlend.cost());
	}

	@Test
	void HouseBlend_Mocha() {
		Beverage houseBlend = new edu.iu.habahram.coffeeorder.model.HouseBlend();
		houseBlend = new edu.iu.habahram.coffeeorder.model.Mocha(houseBlend);
		assertEquals("House Blend, Mocha", houseBlend.getDescription());
		assertEquals(1.95, houseBlend.cost());
	}

	@Test
	void DarkRoast_Whip_Soy_Milk_Mocha() {
		Beverage darkRoast = new DarkRoast();
		darkRoast = new edu.iu.habahram.coffeeorder.model.Whip(darkRoast);
		darkRoast = new edu.iu.habahram.coffeeorder.model.Soy(darkRoast);
		darkRoast = new edu.iu.habahram.coffeeorder.model.Milk(darkRoast);
		darkRoast = new edu.iu.habahram.coffeeorder.model.Mocha(darkRoast);
		assertEquals("Dark roast, Whip, Soy, Milk, Mocha", darkRoast.getDescription());
		assertEquals(3.21, darkRoast.cost());
	}
}
