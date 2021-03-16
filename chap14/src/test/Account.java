package test;

public class Account {
	String accountNumber;
	int balance;

	public String toString() {
		return "\\"  + this.balance + "(口座番号：" + this.accountNumber + ")";
	}

	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		if(o instanceof Account) {
			Account a = (Account)o;
			String num1 = this.accountNumber.trim();
			String num2 = a.accountNumber.trim();
			if(num1.equals(num2)) {
				return true;
			}
		}
		return false;
	}
}
