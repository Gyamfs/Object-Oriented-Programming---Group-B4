package library.model;

public class ReserveItem extends Book {  
    public static final int LOAN_DAYS = 1;
    public static final int MAX_ACTIVE_LOANS_TO_BORROW = 2;
    private final String courseCode;

    public ReserveItem(String bookId, String title, String author, String courseCode) {
        super(bookId, title, author);
        this.courseCode = courseCode;
    }

    public String getCourseCode() {
        return courseCode;
    }

    @Override
    public int getLoanPeriodDays() {
        return LOAN_DAYS;
    }

    @Override
    public String getCategory() {
        return "Reserve Item";
    }
    
}
