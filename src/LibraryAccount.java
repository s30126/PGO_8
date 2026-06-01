public class LibraryAccount {

    private String readerName;
    private int borrowedBooks;
    private int lateDays;

    public LibraryAccount(String readerName, int borrowedBooks, int lateDays) {
        this.readerName = readerName;
        this.borrowedBooks = borrowedBooks;
        this.lateDays = lateDays;
    }

    public String getReaderName() {
        return readerName;
    }

    public int getBorrowedBooks() {
        return borrowedBooks;
    }

    public int getLateDays() {
        return lateDays;
    }

    public class FineCalculator {

        double calculate() {
            double fine = borrowedBooks * lateDays * 1.50;
            return fine;
        }

    }

}
