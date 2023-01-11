public class Batch {
    public static boolean lengthCheck(String code) {
        return code.length() == 12;
    }
    
    public static boolean batchNumberCheck(String code) {
        String batchNumber = code.substring(0, 4);
        return batchNumber.matches("[A-Z][A-Z][0-9][A-Z]");
    }
    
    public static boolean yearCheck(String code) {
        String year = code.substring(4, 8);
        int yearInt = Integer.parseInt(year);
        return yearInt >= 2015 && yearInt <= 2020;
    }
    
    public static boolean monthCheck(String code) {
        String month = code.substring(8, 10);
        int monthInt = Integer.parseInt(month);
        return monthInt >= 1 && monthInt <= 12;
    }
    
    public static boolean dayCheck(String code) {
        String day = code.substring(10, 12);
        int dayInt = Integer.parseInt(day);
        return dayInt >= 1 && dayInt <= 31;
    }
}
