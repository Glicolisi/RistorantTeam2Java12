package enumartion;

public enum ColorsEnum {

     ANSI_BLACK_BACKGROUND  ("\u001B[40m","Sfondo nero"),
     ANSI_RED_BACKGROUND  ("\u001B[41m", "Sfondo rosso"),
     ANSI_GREEN_BACKGROUND  ("\u001B[42m", "Sfondo verde"),
     ANSI_YELLOW_BACKGROUND  ("\u001B[43m", "Sfondo giallo"),
     ANSI_BLUE_BACKGROUND  ("\u001B[44m", "Sfondo blu"),
     ANSI_PURPLE_BACKGROUND  ("\u001B[45m", "Sfondo viola"),
     ANSI_CYAN_BACKGROUND  ("\u001B[46m", "Sfondo ciano"),
     ANSI_WHITE_BACKGROUND  ("\u001B[47m", "Sfondo bianco"),

     BLACK  ("\033[0;30m", "Colore carattere nero"),
     RED  ("\033[0;31m", "Colore carattere rosso"),
     GREEN  ("\033[0;32m", "Colore carattere verde"),
     YELLOW  ("\033[0;33m", "Colore carattere giallo"),
     BLUE  ("\033[0;34m", "Colore carattere blu"),
     PURPLE  ("\033[0;35m", "Colore carattere viola"),
     CYAN  ("\033[0;36m", "Colore carattere ciano"),
     WHITE  ("\033[0;37m", "Colore carattere bianco"),

    BLACK_CAPITAL  ("\033[3;30m", "Colore carattere maiuscolo nero"),
    RED_CAPITAL  ("\033[3;31m", "Colore carattere maiuscolo rosso"),
    GREEN_CAPITAL  ("\033[3;32m", "Colore carattere maiuscolo verde"),
    YELLOW_CAPITAL  ("\033[3;33m", "Colore carattere maiuscolo giallo"),
    BLUE_CAPITAL  ("\033[3;34m", "Colore carattere maiuscolo blu"),
    PURPLE_CAPITAL  ("\033[3;35m", "Colore carattere maiuscolo viola"),
    CYAN_CAPITAL  ("\033[3;36m", "Colore carattere maiuscolo ciano"),
    WHITE_CAPITAL  ("\033[3;37m", "Colore carattere maiuscolo bianco"),


    BLACK_BOLD  ("\033[1;30m", "Colore carattere grassetto nero"),
    RED_BOLD  ("\033[1;31m", "Colore carattere grassetto rosso"),
    GREEN_BOLD  ("\033[1;32m", "Colore carattere grassetto verde"),
    YELLOW_BOLD  ("\033[1;33m", "Colore carattere grassetto giallo"),
    BLUE_BOLD  ("\033[1;34m", "Colore carattere grassetto blu"),
    PURPLE_BOLD  ("\033[1;35m", "Colore carattere grassetto viola"),
    CYAN_BOLD  ("\033[1;36m", "Colore carattere grassetto ciano"),
    WHITE_BOLD  ("\033[1;37m", "Colore carattere grassetto bianco"),

    BLACK_UNDERLINED  ("\033[4;30m", "Colore carattere sottolineato nero"),
    RED_UNDERLINED  ("\033[4;31m", "Colore carattere sottolineato rosso"),
    GREEN_UNDERLINED  ("\033[4;32m", "Colore carattere sottolineato verde"),
    YELLOW_UNDERLINED  ("\033[4;33m", "Colore carattere sottolineato giallo"),
    BLUE_UNDERLINED  ("\033[4;34m", "Colore carattere sottolineato blu"),
    PURPLE_UNDERLINED  ("\033[4;35m", "Colore carattere sottolineato viola"),
    CYAN_UNDERLINED  ("\033[4;36m", "Colore carattere sottolineato ciano"),
    WHITE_UNDERLINED  ("\033[4;37m", "Colore carattere sottolineato bianco"),

    ANSI_RESET ("\u001B[0m", "Torna al formato predefinito");

    private String format;
    private String descrizione;

    ColorsEnum(String format, String descrizione) {
        this.format = format;
        this.descrizione=descrizione;
    }

    public String getFormat() {
        return format;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
