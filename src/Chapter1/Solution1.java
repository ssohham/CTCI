package Chapter1;

/*
Is Unique characters

string = "palindrome"
Output = true

string = "pallin"
output = false
 */
public class Solution1 {

    // finding unique character using extra space
    public boolean isUniqueChar(String str) {

        if(str.length() == 0) {
            return true;
        }

        int[] occurrence = new int[128];

        boolean isUnique = true;

        for(int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            int index = (int) c;

            if(occurrence[index] < 1) {
                occurrence[index]++;
            }
            else{
                isUnique = false;
                break;
            }
        }

        return isUnique;
    }

    public static void main(String args[]) {

        Solution1 solution1 = new Solution1();

        String str = "palindrome";

        System.out.println("String " +  str + " is " + (solution1.isUniqueChar(str) ? "unique" : "not unique" ));

        String str1 = "palin%";

        System.out.println("String " +  str1 + " is " + (solution1.isUniqueChar(str1) ? "unique" : "not unique" ));
    }
}
