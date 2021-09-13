package main;

import java.math.BigDecimal;

public class Main {

	public static void main(String[] args) {
		Discounter easterDiscounter = new EasterDiscounter();

		BigDecimal discountedValue = easterDiscounter.applyDiscount(BigDecimal.valueOf(100));

		System.out.println(discountedValue);
		
		Discounter christmasDiscounter = new ChristmasDiscounter();

		BigDecimal discountedValue2 = christmasDiscounter.applyDiscount(BigDecimal.valueOf(40));

		System.out.print(discountedValue2);


	}

}
