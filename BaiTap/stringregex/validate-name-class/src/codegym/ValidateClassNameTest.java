package codegym;

public class ValidateClassNameTest {
    private static ValidateClassName validateClassName;
    public static final String[] validClassName = {"C0220H","A2021H","P1234G"};
    public static final String[] invalidClassName = {"T0220H","A2021O","C11234G"};

    public static void main(String[] args) {
        validateClassName = new ValidateClassName();
        for (String className: validClassName) {
             boolean isValid = validateClassName.validate(className);
            System.out.println(className + "is valid: " + isValid);
        }
        for (String className: invalidClassName) {
            boolean isValid = validateClassName.validate(className);
            System.out.println(className+ " is valid " + isValid);
        }
    }
}
