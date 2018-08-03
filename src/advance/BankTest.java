package advance;

public class BankTest {
	public static void main(String args[]) {
		BankFactory bankfactory = new MMBankFactory();// Instantiating BankFactory class

		SavingAcc savingAcc = bankfactory.getNewSavingAcc(11, "Naik", 600_000, true); // Instantiating SavingAcc class
		savingAcc.withdraw(6000); // Invoking Withdraw
		savingAcc.deposite(9000); // Invoking Deposit
		System.out.println(savingAcc);

		CurrentAcc currentAcc = bankfactory.getNewCurrentAcc(10, "Rohit", 30_000, 5000);// Instantiating CurrentAcc class
		currentAcc.withdraw(4_000); // Invoking Withdraw
		System.out.println(currentAcc);

	}
}
