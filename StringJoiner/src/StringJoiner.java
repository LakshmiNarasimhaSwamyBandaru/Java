public class StringJoiner {
    public static void main(String[] args) {
        String output=joinStrings("Hello, ", "World!");
        System.out.println(output);

    }
    public static String joinStrings(String str1, String str2){
        return str1.concat(str2);
    }

}
