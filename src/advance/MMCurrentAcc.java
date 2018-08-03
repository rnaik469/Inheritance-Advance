package advance;

public class MMCurrentAcc extends CurrentAcc {
	// constructor with paramters accNo,accNm,accBal and creditLimit
	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);

	}

	@Override
	public String toString() {
		return "MMCurrentAcc [toString()=" + super.toString() + ", getAccNo()=" + getAccNo() + ", getAccNm()="
				+ getAccNm() + ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + "]";
	}
	
	public void withdraw(float amount) {
		float accBal = this.getAccBal();
		if (amount > accBal + getCreditLimit()) {
			accBal = accBal - amount;
		}
		setAccBal(accBal);
	}

}
