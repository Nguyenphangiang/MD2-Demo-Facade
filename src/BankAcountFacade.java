public class BankAcountFacade {
    private String accountName;
    private int securityCode;

    SecurityCodeChecker securityCodeChecker;
    CashManager cashManager;
    AcountChecker acountChecker;

    public BankAcountFacade() {
    }

    public BankAcountFacade(String accountName, int securityCode) {
        this.accountName = accountName;
        this.securityCode = securityCode;

        securityCodeChecker = new SecurityCodeChecker(securityCode);
        cashManager = new CashManager(50.000);
        acountChecker = new AcountChecker(accountName);
    }

    public void depositCash(double cashAmount){
        if (acountChecker.isValid(accountName) && securityCodeChecker.isValid(securityCode)){
            cashManager.deposit(cashAmount);
            System.out.println("Done");
        } else {
            System.out.println("Error");
        }
    }
    public void withdrawCash(double cashAmount){
        if (acountChecker.isValid(accountName)
                && securityCodeChecker.isValid(securityCode)
                && cashManager.haveEnoughMoney(cashAmount)
        ) {
            cashManager.withdraw(cashAmount);
            System.out.println("Done");
        } else {
            System.out.println("Not enough money");
        }
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public int getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(int securityCode) {
        this.securityCode = securityCode;
    }
}
