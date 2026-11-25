package library.model;

public class Journal extends Book {
    public static final int LOAN_DAYS = 7;
    private final int volume;
    private final boolean currentIssue;

    public Journal(String bookId, String title, String author, int volume, boolean currentIssue) {
        super(bookId, title, author); 
        this.volume = volume;
        this.currentIssue = currentIssue;
    }

    public boolean isCurrentIssue(){ 
        return currentIssue; 
    }

    public int getVolume(){ 
        return volume; 
    }

    @Override 
    public int getLoanPeriodDays(){ 
        return LOAN_DAYS; 
    }

    @Override
    public String getCategory() {
        return "Journal";
    }

    @Override 
    public boolean canBeBorrowedBy(Member member) {
        return super.canBeBorrowedBy(member) && !currentIssue;
    }
}
