package advance;

public class SavingAcc extends BankAcc {

	// Instance members
	private boolean isSalaried;
	private static final float MINBAL = 3_000;

	// constructor with paramters accNo,accNm,accBal and isSalaried
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + "]";
	}

	// override Withdraw with min withdraw limit
	public void withdraw(float amount) {
		float accBal = this.getAccBal();
		if (MINBAL < (accBal - amount))
			accBal = accBal - amount;
		setAccBal(accBal);
	}

}
