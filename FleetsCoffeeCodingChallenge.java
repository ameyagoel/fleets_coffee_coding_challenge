public class MyClass {
    public static void main(String args[]) {
      String test1 = firstNonRepeated("hello");
      String test2 = firstNonRepeated("aabcc");
      String test3 = firstNonRepeated("aabbcc");

      System.out.println(test1);
      System.out.println(test2);
      System.out.println(test3);
    }
    
    public static String firstNonRepeated(String s) {
        String str = s.toLowerCase();
        String noRepeat = "";
        for (int i=0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                noRepeat = String.valueOf(str.charAt(i));
                break;
            }
                 
        }
        return noRepeat;
    }
}