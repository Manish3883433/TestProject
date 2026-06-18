package firstAndLastOccurence;

public class FindOccurrence {
    public static void main(String[] args) {
        String text = "amazonaanazzz";
        
        // indexOf() finds the first occurrence
        int firstIndex = text.indexOf('a');
        
        // lastIndexOf() finds the last occurrence
        int lastIndex = text.lastIndexOf('a');
        System.out.println("#########################################################################");
        System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$$");
        System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
        System.out.println("*************************************************************************");
        System.out.println("First occurrence of 'a' is at index: " + firstIndex);
        System.out.println("Last occurrence of 'a' is at index: " + lastIndex);
    }
}
