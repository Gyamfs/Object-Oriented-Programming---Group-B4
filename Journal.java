public class Journal extends Book {
    private int volume;
    public Journal(String id, String title, String author, int volume) {
        super(id, title, author); this.volume = volume;
    }
    public int getVolume() { return volume; }
    @Override public int getLoanPeriodDays() { return 7; }
}
