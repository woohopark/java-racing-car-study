package calculator;


public enum OperEnum { //1차 피드백

    OPER_PLUS("+"),
    OPER_MINUS("-"),
    OPER_DIVIDE("/"),
    OPER_MULTIPLY("*");

    private String value;

    OperEnum(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    public boolean valueCheck(String s) {
        return this.getValue().equals(s);
    }

}
