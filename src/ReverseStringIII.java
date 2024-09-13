import java.util.Arrays;

public class ReverseStringIII {
    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        String[] input = Arrays.stream(s.split(" ")).filter(s2-> !s2.isEmpty()).toArray(String[]::new);
        for (String s1 : input){
            System.out.println(s1);
        }
        return;
    }
}
