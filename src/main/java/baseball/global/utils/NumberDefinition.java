package baseball.global.utils;

public enum NumberDefinition {
    START_NUMBER(1),
    END_NUMBER(9);

    private final Integer number;

    NumberDefinition(Integer number) {
        this.number = number;
    }

    public Integer getNumber() {
        return number;
    }
}