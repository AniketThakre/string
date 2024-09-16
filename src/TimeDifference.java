import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TimeDifference {
    public static void main(String[] args) {
        List<String> timePoints = Arrays.asList("00:00","04:00","22:00");
        Collections.sort(timePoints,(s1,s2)-> s1.compareTo(s2));
        int min =Integer.MAX_VALUE;
        System.out.println(timePoints);
        for(int i=0;i<timePoints.size()-1;i++){
            for(int j=i+1;j<timePoints.size();j++){
                String t1 = timePoints.get(i);
                String t2 = timePoints.get(j);
                int t1Min = Integer.parseInt(t1.substring(0,2)) * 60 + Integer.parseInt(t1.substring(3));
                int t2Min = Integer.parseInt(t2.substring(0,2)) * 60 + Integer.parseInt(t2.substring(3));
                int diff = t2Min - t1Min;
                if(diff <= (1440 - diff)){
                    min = Math.min(diff,min);
                }else{
                    min = Math.min(min,(1440-diff));
                }
            }
        }
        System.out.println(min);
    }
}
