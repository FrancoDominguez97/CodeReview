package Utilities;

public enum Audience {
    G(1),
    PG(2),
    PG13(3),
    R(4),
    NC17(5),
    UNRATED(6);
    private int value;

    Audience(int value) {
        this.value = value;
    }
}
