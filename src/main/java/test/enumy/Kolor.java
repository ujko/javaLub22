package test.enumy;

public enum Kolor {
    BIALY("#000000"),
    ZIELONY("#00ff00"),
    CZERWONY("#ff0000");

    Kolor(String hexCode) {
        this.hexCode = hexCode;
    }

    private String hexCode;

    public String getHexCode() {
        return hexCode;
    }
}
