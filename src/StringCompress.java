import java.util.LinkedHashMap;
import java.util.Map;

public class StringCompress {
    public static void main(String[] args) {
        char[] chars = {'a','b','c'};
        int k = compress(chars);
        for(int i=0;i<k;i++){
            System.out.print(chars[i] + " ");
        }
    }

    private static int compress(char[] chars) {
        char ch = chars[0];
        int count=1;
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<chars.length;i++){
            if(ch == chars[i]){
                count++;
            }else{
                sb.append(ch);
                if(count!=1)
                    sb.append(count);
                ch=chars[i];
                count=1;
            }
        }
        sb.append(ch);
        sb.append(count);
        String s = sb.toString();
        for(int i=0; i<s.length();i++ ){
            chars[i]=s.charAt(i);
        }
        return s.length();
    }
}
