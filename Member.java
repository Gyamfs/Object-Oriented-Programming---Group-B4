public class Member {
    private String memberId, name;
    private int borrowLimit, activeLoans;
    public Member(String memberId, String name, int borrowLimit) {
        this.memberId = memberId; this.name = name; this.borrowLimit = borrowLimit;
    }
    public String getMemberId() { return memberId; }
    public String getName() { return name; }
    public int getActiveLoans() { return activeLoans; }
    public boolean canBorrow() { return activeLoans < borrowLimit; }
    public void incrementLoans() { activeLoans++; }
    public void decrementLoans() { if (activeLoans > 0) activeLoans--; }
    public String toString() { return memberId + " - " + name; }
}
