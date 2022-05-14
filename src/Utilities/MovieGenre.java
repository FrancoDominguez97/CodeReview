package Utilities;

public enum MovieGenre {

    ACTION(1),
    AVENTURE(2),
    DRAMA(3),
    HORROR(4),
    COMEDY(5),
    DOCUMENTARYFILM(6);

    private int value;

    MovieGenre(int value) {
        this.value = value;
    }
}
