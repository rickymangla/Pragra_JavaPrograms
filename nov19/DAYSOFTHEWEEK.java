package nov19;

public enum DAYSOFTHEWEEK {

    SUNDAY("Day1"),
    MONDAY("Day2"),
    TUESDAY("Day3"),
    WEDNESDAY("Day4"),
    THURSDAY("Day5"),
    FRIDAY("Day6"),
    SATURDAY("Day7");


    private final String description;


    DAYSOFTHEWEEK(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }


    public static void main(String[] args) {
        System.out.println(DAYSOFTHEWEEK.MONDAY);
        System.out.println(DAYSOFTHEWEEK.MONDAY.getDescription());


    }
}
