package test03;
import java.util.HashMap;
import java.util.Map;

import test02.Hero;

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero("斎藤");
		Hero h2 = new Hero("鈴木");
		Map<Hero, Integer> list = new HashMap<Hero, Integer>();
		list.put(h1, 3);
		list.put(h2, 7);
		for(Hero key : list.keySet()) {
			int value = list.get(key);
			System.out.println(key.getName() + "が倒した敵 = " + value);
		}
	}

}
