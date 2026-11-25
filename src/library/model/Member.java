package library.model;

public class Member {
    private String memberId;
    private String name;
    private int borrowLimit;
    private int activeLoans;

    public Member(String memberId, String name, int borrowLimit) {
        if (memberId == null || memberId.isBlank())
            throw new IllegalArgumentException("Member ID cannot be null or blank.");
        else{
            this.memberId = memberId;
        }
        
        if (name == null || name.isBlank())
            throw new IllegalArgumentException("Member name cannot be null or blank.");
        else{
            this.name = name; 
        }
        
        if (borrowLimit < 0)
            throw new IllegalArgumentException("Borrow limit cannot be negative.");
        else{
        this.borrowLimit = borrowLimit;
        }
    }

    // Getters and Setters
    public String getMemberId(){ 
        return memberId; 
    }
    public String getName(){ 
        return name; 
    }
    public int getActiveLoans(){ 
        return activeLoans; 
    }
    public boolean canBorrow(){ 
        return activeLoans < borrowLimit; 
    }

    //methods are private to ensure that only the Member class can modify its own active loans
    private void incrementLoans(){ 
        activeLoans++; 
    }

    // Decrement active loans, ensures it doesn't go below zero
    private void decrementLoans(){ 
        if (activeLoans > 0) activeLoans--; 
    }

    public String toString(){ 
        return memberId + " - " + name; 
    }
}