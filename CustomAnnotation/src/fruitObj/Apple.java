package fruitObj;

import java.awt.Color;

import fruits.FruitColor;
import fruits.FruitName;
import fruits.FruitProvider;

public class Apple {
	
	@FruitName("GreenApple")
	private String appleName;
	
	@FruitColor(fruitColor = FruitColor.Color.GREEN)
	private String appleColor;
	
	@FruitProvider(id=1, name="HomePlus", address="Seoul")
	private String appleProvider;

}
