public enum Utility {
    //Background
     ANSI_BLACK_BACKGROUND  ("\u001B[40m"),
     ANSI_RED_BACKGROUND  ("\u001B[41m"),
     ANSI_GREEN_BACKGROUND  ("\u001B[42m"),
     ANSI_YELLOW_BACKGROUND  ("\u001B[43m"),
     ANSI_BLUE_BACKGROUND  ("\u001B[44m"),
     ANSI_PURPLE_BACKGROUND  ("\u001B[45m"),
     ANSI_CYAN_BACKGROUND  ("\u001B[46m"),
     ANSI_WHITE_BACKGROUND  ("\u001B[47m"),

    // Regular Colors
     BLACK  ("\033[0;30m"),   // BLACK
     RED  ("\033[0;31m"),     // RED
     GREEN  ("\033[0;32m"),   // GREEN
     YELLOW  ("\033[0;33m"),  // YELLOW
     BLUE  ("\033[0;34m"),    // BLUE
     PURPLE  ("\033[0;35m"),  // PURPLE
     CYAN  ("\033[0;36m"),    // CYAN
     WHITE  ("\033[0;37m"),   // WHITE

    BLACK_CAPITAL  ("\033[3;30m"),  // BLACK
    RED_CAPITAL  ("\033[3;31m"),    // RED
    GREEN_CAPITAL  ("\033[3;32m"),  // GREEN
    YELLOW_CAPITAL  ("\033[3;33m"), // YELLOW
    BLUE_CAPITAL  ("\033[3;34m"),   // BLUE
    PURPLE_CAPITAL  ("\033[3;35m"), // PURPLE
    CYAN_CAPITAL  ("\033[3;36m"),   // CYAN
    WHITE_CAPITAL  ("\033[3;37m"),  // WHITE

    // Bold
    BLACK_BOLD  ("\033[1;30m"),  // BLACK
    RED_BOLD  ("\033[1;31m"),    // RED
    GREEN_BOLD  ("\033[1;32m"),  // GREEN
    YELLOW_BOLD  ("\033[1;33m"), // YELLOW
    BLUE_BOLD  ("\033[1;34m"),   // BLUE
    PURPLE_BOLD  ("\033[1;35m"), // PURPLE
    CYAN_BOLD  ("\033[1;36m"),   // CYAN
    WHITE_BOLD  ("\033[1;37m"),  // WHITE

    // Underline
    BLACK_UNDERLINED  ("\033[4;30m"),  // BLACK
    RED_UNDERLINED  ("\033[4;31m"),    // RED
    GREEN_UNDERLINED  ("\033[4;32m"),  // GREEN
    YELLOW_UNDERLINED  ("\033[4;33m"), // YELLOW
    BLUE_UNDERLINED  ("\033[4;34m"),   // BLUE
    PURPLE_UNDERLINED  ("\033[4;35m"), // PURPLE
    CYAN_UNDERLINED  ("\033[4;36m"),   // CYAN
    WHITE_UNDERLINED  ("\033[4;37m"),  // WHITE

    //Reset
    ANSI_RESET ("\u001B[0m"); //Torna al formato predefinito


    private String format;

    Utility(String format) {
        this.format = format;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}
