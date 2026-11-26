package library.model;

public abstract class Reservation {
    private String reservationId;
    private Member member;
    private boolean active = true;

    protected Reservation(String reservation, Member member) {
        this.reservationId = reservation; 
        this.member = member;
    }

    public String getReservationId(){ 
        return reservationId; 
    }
    public Member getMember(){ 
        return member; 
    }
    public boolean isActive(){ 
        return active; 
    }
    
    public abstract String getTypeLabel();

    public abstract String getItemLabel();

    protected abstract void release();

    public void cancel(){ 
        active = false; 
    }

    @Override
    public String toString() {
        String status;
        if (active) {
            status = "Active";
        } else {
            status = "Inactive";
        }
        return reservationId + " | " + member.getName() + " | " + getTypeLabel() + ": " + getItemLabel()
                + " | " + status;
    }
}
