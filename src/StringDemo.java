public class StringDemo {

    public static void hello(String s) {
        if(s.equals("Boss")) { // replace by s.equals("Boss")
            System.out.println("Hello Boss");
        } else {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        String s1 = "Hello World";
        String s2 = "Hello World";
        String s3 = new String("Hello World");

        for(int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            if(Character.isUpperCase(c)) {
                System.out.println(s1.charAt(i));
            }
        }

        System.out.println("s1 == s2: " + (s1 == s2));
        System.out.println("s1 == s3: " + (s1 == s3));

        System.out.println("s1.equals(s2): " + (s1.equals(s2)));
        System.out.println("s1.equals(s3): " + (s1.equals(s3)));

        String b1 = "Boss";
        String b2 = new String("Boss");
        hello(b1);
        hello(b2);
    }
}
