/**
 * StringRelated
 * We have give 2 string we need to compare the charter are same or not
 * characters can be any sequence
 */
public class StringRelated {

    public static void main(String[] args) {
        boolean value = strMethod("akb", "kba");
        System.out.println(value);
    }

    public static boolean strMethod(String str1, String str2) {
        boolean flag = true;
        if (str1.length() == str2.length()) {

            char[] charArray1 = str1.toCharArray();
            for (int i = 0; i < charArray1.length; i++) {

                // If the charter is not available in the string then
                // this condition will be true

                if (str2.indexOf(charArray1[i]) < 0) {
                    flag = false;
                    break;
                }

            }

        } else {
            flag = false;
        }
        return flag;
    }
}