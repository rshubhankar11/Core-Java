
/* 
 * 
 * Given one input string String str = "I am at amsterdam";
 * We have to remove the second occurring digits
 * 
 * Expected Out put  : I am t serd
 */
public class StringRemovingDuplicate {
    public static void main(String[] args) {
        String str = "I am at amsterdam";
        String newstr = new String();
        int length = str.length();
        for (int i = 0; i < length; i++) {

            char charAtPosition = str.charAt(i);
            if (Character.isWhitespace(charAtPosition)) {
                newstr += charAtPosition;
            } else if (newstr.indexOf(charAtPosition) < 0) {
                newstr += charAtPosition;
            }
        }

        System.out.println(newstr);
    }
}
