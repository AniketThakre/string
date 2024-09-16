import java.util.Scanner;

public class WayToLongWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=0;i<N;i++){
            String word = sc.next();
            int len = word.length();
            if(len > 10){
                String res = "";
                res = res + word.charAt(0) + (len-2) + word.charAt(len-1);
                System.out.println(res);
            }else{
                System.out.println(word);
            }

        }
    }
}
