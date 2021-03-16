package test02;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		ArrayList<Hero> list = new ArrayList<Hero>();
		list.add(h1);
		list.add(h2);
		for(Hero h : list) {
			System.out.println(h.getName());
		}
	}

}
