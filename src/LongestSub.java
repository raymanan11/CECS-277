import java.util.ArrayList;


public class LongestSub {
    public static int longestSub(String input) {
        int answer = 0;
        for (int i = 0; i < input.length(); i++) {
            ArrayList<Character> arr = new ArrayList<>();
            int j;
            /**
             * if arrayList contains character, then break but if not
             * add to arrayList
             */
            for (j = i; j < input.length(); j++) {
                char c = input.charAt(j);
                if (arr.contains(c)) {
                    break;
                }
                else {
                    arr.add(c);
                }
            }
            if(arr.size() > answer) {
                answer = arr.size();
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.print("Longest Nonrepeating substring for abcaab: ");
        System.out.println(longestSub("abcaab"));

        System.out.print("Longest Nonrepeating substring for aaaa: ");
        System.out.println(longestSub("aaaa"));
    }
}
