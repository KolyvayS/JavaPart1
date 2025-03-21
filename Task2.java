public class Task2 {
    public static void main(String[] args) {
        String stringToRevers = "I'm going to go to school today morning.";
        System.out.println(reverseStringWithReverseMethod(stringToRevers));
        System.out.println(reverseStringWithLoop(stringToRevers));
        System.out.println(reverseStringWithRecursion(stringToRevers));
    }

    public static String reverseStringWithReverseMethod (String str){
        StringBuilder reversedString = new StringBuilder(str);
        return reversedString.reverse().toString();
    }

    public static String reverseStringWithLoop(String str){
        StringBuilder reversedString = new StringBuilder();
        for(int i = str.length() - 1; i >= 0; i--){
            reversedString.append(str.charAt(i));
        }
        return reversedString.toString();
    }

    public static String reverseStringWithRecursion(String str){
        if(str.length() <= 1) return str;
        return reverseStringWithRecursion(str.substring(1)) + str.charAt(0);
    }
}
