package enums;

public enum CardinalPoints {
    NORTH, SOUTH, WEST, EAST;

    public static CardinalPoints fromNameCaseInsensitive(String name) {
        CardinalPoints[] values = CardinalPoints.values();
        for (CardinalPoints value : values) {
            if (value.name().equalsIgnoreCase(name)) {
                return value;
            }
        }
        return null;
    }
}
