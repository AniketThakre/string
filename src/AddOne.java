public class AddOne {
    public static void main(String[] args) {
        String X = "99";
        char[] strArr = X.toCharArray();
        int n= strArr.length;
        int carry=0;
        if(strArr[n-1]!='9'){
            strArr[n-1]= (char)(strArr[n-1]+1);
            X = new String(strArr);
        }else{
            strArr[n-1] = '0';
            carry=1;
            for(int j=n-2;j>=0;j++){
                if(carry == 1 && strArr[j]=='9'){
                    strArr[j] = '0';
                }else{
                    strArr[j] = (char) (strArr[j] + 1);
                    carry=0;
                    break;
                }
            }
            X = new String(strArr);
            if(carry == 1){
                X = '1' + X;
            }
        }
        System.out.println(X);

    }
}
