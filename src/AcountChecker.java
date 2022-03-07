public class AcountChecker {
    private String accName;
    public AcountChecker(String accountName){
        this.accName = accountName;
    }

    public boolean isValid(String accountName){
        return accName == accountName;
    }
}
