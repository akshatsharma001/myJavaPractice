public class Main {
    public static void main(String[] args) {
        int totalDaysInAugust = 31;
        int evenDays = 0;
        for (int day = 1; day <= totalDaysInAugust; day++) {
            if (day % 2 == 0) {
                evenDays++;
            }
        }
        System.out.println("No. of Days = " + evenDays);
    }
}