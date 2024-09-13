public class ReverseStringII {
    public static void main(String[] args) {
        String s = "hyzqyljrnigxvdtneasepfahmtyhlohwxmkqcdfehybknvdmfrfvtbsovjbdhevlfxpdaovjgunjqlimjkfnqcqnajmebeddqsgl";
        int k = 39;
        char[] ch = s.toCharArray();
        if(ch.length <=k){
            swap(ch,0,ch.length-1);
            System.out.println(new String(ch));
        }
        int i=0;
        while(i+k-1<ch.length){
            swap(ch,i,i+k-1);
            i+=2*k;
        }
        System.out.println(new String(ch));
    }
    public static void swap(char[] ch, int i, int j){
        while(i<j){
            char temp = ch[i];
            ch[i]=ch[j];
            ch[j]=temp;
            i++;
            j--;
        }
    }
}
