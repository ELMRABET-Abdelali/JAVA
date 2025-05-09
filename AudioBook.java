public class AudioBook extends Book {
    private int runTime;

    AudioBook(String title, String author, int pageCount, int runTime) {
        // super inherit from Book class
        super(title, author, pageCount);
        this.runTime = runTime;
    }
}
