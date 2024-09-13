public class ZigZagConversion {

    public static void main(String[] args) {
        String s = "AB";
        int numRow = 1;
        System.out.println(convert(s,numRow));
    }

    public static String convert(String s, int numRow){
        if(numRow==1){
            return s;
        }
//        StringBuilder[] sb = new StringBuilder[numRow];
        String[] str = new String[numRow];

        for(int i=0;i<numRow;i++){
            str[i] = "";
        }
        int index =0;
        boolean goDown= false;
        for(char ch : s.toCharArray()){
            str[index] += ch;
            if(index==0 || index == (numRow-1)){
                goDown = !goDown;
            }
            index += goDown?1:-1;
        }

        return String.join("",str);
    }
}
