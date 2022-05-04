public class Movie {
    private int rating = 0;
    private int count = 1;

    public int getAverage() {
        return rating;
    }

    public void rate(int rating) {
        this.rating = (this.rating+rating)/count++;
    }
}
