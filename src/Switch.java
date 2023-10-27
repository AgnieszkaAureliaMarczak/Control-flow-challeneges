public class Switch {
    public static void main(String[] args) {
        /*int value = 3;
        switch (value) {
            case 1 -> System.out.println("Value was 1");
            case 2, 3, 4 -> System.out.println("Value was 2");
            default -> System.out.println("Was not 1 or 2");
        }*/
        String month = "Aprill";
        System.out.println(getQuarter("Aprill"));
     //   System.out.println(month + " is in the " + getQuarter(month) + " quarter");
    }
    /*public static String getQuarter(String month){
        switch(month){
            case "January":
            case "February":
            case "March":
                return "1st";
            case "April":
            case "May":
            case "June":
                return "2nd";
            case "July":
            case "August":
            case "September":
                return "3rd";
            case "October":
            case "November":
            case "December":
                return "4rth";
        }
        return "Incorrect month";
    }*/
    public static String getQuarter(String month){
        return switch (month) {
            case "January", "February", "March" -> "1st";
            case "April", "May", "June" -> "2nd";
            case "July", "August", "September" -> "3rd";
            case "October", "November", "December" -> "4rth";
            default -> {
                yield month + " is incorrect";
            }
        };
    }
}
