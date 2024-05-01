package com.coderscampus.arraylist.asgnmt7;

public class CustomListApplication {

	public static void main(String[] args) {

		CustomList<String> fruits = new CustomArrayList<>();

		fruits.add("Apple");
		fruits.add("Apricot");
		fruits.add("Avacado");
		fruits.add("Banana");
		fruits.add("Blackberry");
		fruits.add("Blueberry");
		fruits.add("Boysenberry");
		fruits.add("Cantelope");
		fruits.add("Cherry");
		fruits.add("Clementine");
		fruits.add("Coconut");
		fruits.add("Cranberry");
		fruits.add("Cucumber");
		fruits.add("Date");
		fruits.add("Dragonfruit");
		fruits.add("Durian");
		fruits.add("Elderberry");
		fruits.add("Fig");
		fruits.add("Gooseberry");
		fruits.add("Grape");
		fruits.add("Graprfruit");
		fruits.add("Guava");
		fruits.add("Honeydew");
		fruits.add("Huckleberry");
		fruits.add("Jackfruit");
		fruits.add("Kiwi");
		fruits.add("Lemon");
		fruits.add("Lime");
		fruits.add("Loganberry");
		fruits.add("Mandarin Orange");
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add("Papaya");
		fruits.add("Peach");
		fruits.add("Pear");
		fruits.add("Plum");
		fruits.add("Pomegranate");
		fruits.add("Raisin");
		fruits.add("Raspberry");
		fruits.add("Strawberry");
		fruits.add("Tangerine");
		fruits.add("Watermelon");

		System.out.println("Size of List: " + fruits.getSize());
		
//		Shows entire list of items.		
				
		for (int i = 0; i < fruits.getSize(); i++) {
			System.out.println(fruits.get(i));
		}
		
//		Shows specific item in list.		
		
//			System.out.println(fruits.get(36));
	}
}
