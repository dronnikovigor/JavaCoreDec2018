package task5.student;

public class Score<T extends Number> implements Comparable<Score> {
    private T score;

    Score(T score) {
        this.score = score;
    }

    public T getScore() {
        return score;
    }

    @Override
    public int compareTo(Score o) {
        return Double.compare(score.doubleValue(), o.score.doubleValue());
    }

    @Override
    public String toString() {
        return String.valueOf(score);
    }
}
