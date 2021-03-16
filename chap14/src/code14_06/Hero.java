package code14_06;

public class Hero {

	String name;
	int hp;

	@Override
	public String toString() {
		return "名前：" + this.name + "/ HP：" + this.hp;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj) {
			return true;
		}
		if(obj instanceof Hero) {
			Hero h = (Hero)obj;
			if(this.name.equals(h.name) && this.hp == h.hp) {
				return true;
			}
		}
		return false;
	}



}
