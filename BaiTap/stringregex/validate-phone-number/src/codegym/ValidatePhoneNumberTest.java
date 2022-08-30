package codegym;

public class ValidatePhoneNumberTest {
    private static ValidatePhoneNumber validatePhoneNumber;
    public static final String[] validPhoneNUmber = { "(84)-(0978489648)" };
    public static final String[] invalidPhoneNUmber = { "(a8)-(222222222)" };

    public static void main(String[] args) {
        validatePhoneNumber = new ValidatePhoneNumber();
        for (String phoneNumber: validPhoneNUmber) {
             boolean isvalid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
        for (String phoneNumber: invalidPhoneNUmber) {
            boolean isvalid = validatePhoneNumber.validate(phoneNumber);
            System.out.println("Phone number is " + phoneNumber + " is valid: " + isvalid);
        }
    }

}
