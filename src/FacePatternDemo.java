public class FacePatternDemo {
    public static void main(String[] args) {
        BankAcountFacade bankAcountFacade = new BankAcountFacade("Vo Danh",111);

        bankAcountFacade.depositCash(100.000);
        bankAcountFacade.withdrawCash(90.000);
    }
}
