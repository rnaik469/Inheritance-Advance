package advance;

public abstract class BankAcc {
	// Instance members
	private int accNo;
	private String accNm;
	private float accBal;

	// Constructor with parameters accNo,accNm,accBal
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accBal = accBal;
		this.accNm = accNm;
		this.accNo = accNo;
	}

	// Overrding Abstract method
	abstract public void withdraw(float amount);

	public void deposite(float amount) {
		accBal = accBal + amount;
	}

	// ....Overridden by object class
	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	//getter and setters
	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}

	protected void setAccBal(float accBal) {
		this.accBal = accBal;
	}

}
