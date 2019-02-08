package task5;

public enum Course {
    ENGLISH(true),
    RUSSIAN(false),
    PROGRAMMING(false),
    MATH(true),
    OOP(true);

    private boolean realScore;

    Course(boolean realScore) {
        this.realScore = realScore;
    }

    public boolean isRealScore() {
        return realScore;
    }
}
