package advance;

public class CurrentAcc extends BankAcc {

	// CreditLimit is defined to check for withdraw function
	private final float creditLimit;

	// Constructor with parameters accNo,accNm,accBal and creditLimit
	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}

	// get creditLimit
	public float getCreditLimit() {
		return creditLimit;
	}

	// Overridden withdraw
	@Override
	public void withdraw(float amount) {
		float accBal = this.getAccBal();
		if (amount > accBal + creditLimit) {
			accBal = accBal - amount;
		}
		setAccBal(accBal);
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getCreditLimit()=" + getCreditLimit() + ", toString()="
				+ super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm() + ", getAccBal()="
				+ getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

}
