package parser;

public enum Separator {
    COMMA(","),
    COLON(":");

    private final String separator;

    Separator(String separator) {
        this.separator = separator;
    }

    public String getSymbol() {
        return separator;
    }

    public static String getRegex() {
        return COMMA.getSymbol() + "|" + COLON.getSymbol();
    }
}
