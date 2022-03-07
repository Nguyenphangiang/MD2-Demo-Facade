public class SecurityCodeChecker {
    private int securityCode;

    public SecurityCodeChecker() {
    }

    public SecurityCodeChecker(int inputCode) {
        this.securityCode = inputCode;
    }
    public boolean isValid(int inputCode){
        return securityCode == inputCode;
    }
}
