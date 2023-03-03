package util;

import java.lang.reflect.Field;

import fruits.FruitName;
import fruits.FruitProvider;
import fruits.FruitColor;

public class FruitInfoUtil {

	public static void getFruitInfo(Class<?> clazz) {
		
		String strFruitName = "���� �̸� : ";
		String strFruitColor = "���� �� : ";
		String strFruitProvider = "���� �Ĵ� �� : ";
		
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field field : fields) {
            if (field.isAnnotationPresent(FruitName.class)) {
                FruitName fruitName = field.getAnnotation(FruitName.class);
                strFruitName = strFruitName + fruitName.value();
                System.out.println(strFruitName);
            } else if (field.isAnnotationPresent(FruitColor.class)) {
                FruitColor fruitColor = field.getAnnotation(FruitColor.class);
                strFruitColor = strFruitColor + fruitColor.fruitColor().toString();
                System.out.println(strFruitColor);
            } else if (field.isAnnotationPresent(FruitProvider.class)) {
                FruitProvider fruitProvider = field.getAnnotation(FruitProvider.class);
                strFruitProvider = " ���� �Ĵ� ���� ID: " + fruitProvider.id() + " ���� �̸� : " + fruitProvider.name() + " ���� �ּ�: " + fruitProvider.resion();
                System.out.println(strFruitProvider);
            }
        }

	}

}
