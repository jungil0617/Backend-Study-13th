package error;

public enum ErrorMessage {
    INPUT_IS_NULL("입력값이 null 입니다."),
    INPUT_IS_EMPTY("입력값이 비어있습니다.");

    private final String message;

    ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
