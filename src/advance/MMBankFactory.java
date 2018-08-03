package advance;

// This class extends BankFactory
public class MMBankFactory extends BankFactory {

	// This method creates object for SavingAcc
	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc sa = new SavingAcc(accNo, accNm, accBal, isSalaried);
		return sa;
	}

	// This method creates object for CurrentAcc
	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		{
			CurrentAcc ca = new CurrentAcc(accNo, accNm, accBal, creditLimit);
			return ca;
		}
	}

}
