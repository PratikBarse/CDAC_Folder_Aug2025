class StringNewKeyword {
    public static void main(String[] args) {
        String str1 = new String("hello");
        String str2 = new String("hello");

        System.out.println("Using == : " + (str1 == str2));       // false
        System.out.println("Using .equals(): " + str1.equals(str2)); // true
    }
}
