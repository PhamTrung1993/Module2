public class BankFactory {
    private BankFactory() {
    }
    public static final Bank getBank(BankType bankType) {
        switch (bankType) {
            case TPBANK :
                return new TPBank();
            case VIETCOMBANK :
                return new VietcomBank();
            default:
                throw new IllegalArgumentException("This bank type is unsupported");
        }
    }
    //Enum trong java là một kiểu dữ liệu đặc biệt của Java được sử dụng để định nghĩa các tập hợp các hằng số.
    // Cụ thể hơn, Java enum là một kiểu đặc biệt của lớp trong java. Một enum có thể chứa các trường, phương thức và Constructor.
    public enum BankType {
        VIETCOMBANK, TPBANK;
    }
}
