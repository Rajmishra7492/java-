public class strmethod {
        public static void main(String[] args) {
                String name = "Raj";
                int value = name.length();
                System.out.println(value);
                // name.toLowerCcase()
                String value2 = name.toLowerCase();
                System.out.println(value2);
                // name.toUpperCase()
                String value3 = name.toUpperCase();
                System.out.println(value3);
                // name.trim()
                String nonTrimmedString = "     raj   ";
                System.out.println(nonTrimmedString);
                String trimmedString;
                System.out.println(nonTrimmedString.trim());
                // name.substring()
                System.out.println(name.substring(1));
                System.out.println(name.substring(1, 2));
                // name.replace
                System.out.println(name.replace("a", "j"));
                System.out.println(name.replace("r", "ier"));
                // name.startsWith
                System.out.println(name.startsWith("R"));
                // name.endsWith()
                System.out.println(name.endsWith("y"));
                // name.charAt
                System.out.println(name.charAt(0));
                // name.indexOf()
                System.out.println(name.indexOf("Ra"));

                // escape sequence charcter
                System.out.println("i am escape sequence\t double quote");
        }
}