package enumartion;

public enum StagioniEnum {

        ESTATE("Estate"),
        INVERNO("Inverno"),
        PRIMAVERA("Primavera"),
        AUTUNNO("Autunno"),
        FUORI_MENU("Fuori menù");

        private String stagione;

        StagioniEnum(String stagione) {
                this.stagione = stagione;
        }

        public String getStagione() {
                return stagione;
        }
}
