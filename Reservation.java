import java.time.LocalDateTime;
public class Reservation {
    private String reservationId, reservationType;
    private LocalDateTime startTime, endTime;
    private Member member;
    private Book book;
    private Seat seat;
    private boolean active = true;
    public Reservation(String id, Member member, Book book, LocalDateTime start, LocalDateTime end) {
        reservationId = id; this.member = member; this.book = book;
        reservationType = "Book"; startTime = start; endTime = end;
    }
    public Reservation(String id, Member member, Seat seat, LocalDateTime start, LocalDateTime end) {
        reservationId = id; this.member = member; this.seat = seat;
        reservationType = "Seat"; startTime = start; endTime = end;
    }
    public String getReservationId() { return reservationId; }
    public String getReservationType() { return reservationType; }
    public Member getMember() { return member; }
    public Book getBook() { return book; }
    public Seat getSeat() { return seat; }
    public LocalDateTime getStartTime() { return startTime; }
    public LocalDateTime getEndTime() { return endTime; }
    public boolean isActive() { return active; }
    public void cancel() { active = false; }
    public String toString() {
        String item = book != null ? book.getTitle() : seat.getSeatId();
        return reservationId + " | " + member.getName() + " | " + item + " | " + (active ? "Active" : "Cancelled");
    }
}
