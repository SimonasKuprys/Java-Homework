package edu.protectedkeywordAndEnum;

public enum FuealType {
    ELECTRICITY("0 consuptions"),
    DIESEL(" 6 consuption"),
    GAS(" 7 consuption"),
    HYBRID(" 8 consuption"),
    PETROL(" 9 consuption");

    private final String description;

    FuealType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
