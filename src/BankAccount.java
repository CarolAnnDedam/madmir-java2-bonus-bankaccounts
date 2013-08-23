
public class BankAccount {
	private String accountOwner;
	private char accountBalance,bankAccountNumber;
	
	//Constructors
	public BankAccount(String newAccountOwner , char newAccountBalance,char newBankBalance, char newBankAccountNumber){
		accountOwner = newAccountOwner;
		bankAccountNumber = newBankAccountNumber;
		accountBalance = newAccountBalance;
	
				
	}
	
	//accessor Methods
	public String getAccountOwner() {
		return accountOwner;
	}
	public char getAccountBalance(){
		return accountBalance;
		
	}
	public char getBankAccountNumber(){
		return bankAccountNumber;
		
	}
	//mutator methods
		public void setAccountOwner(String owner) {
			accountOwner = owner;
		}
		public void setAccountBalance(char aB) {
			accountBalance = aB;
		}
		public void setbankAccountNumber (char aC) {
			bankAccountNumber = aC;
		}
	

}
