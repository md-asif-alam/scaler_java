import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr={11,3,7,9,14,2};
        int target=17;

        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i=0;i<arr.length;i++)
        {
            int sno=target-arr[i];

            if(map.containsKey(sno))
            {
                arr[0]=map.get(sno);
                arr[1]=i;
                break;
            }
            map.put(arr[i],i);
        }
        System.out.println(arr[0]+" "+arr[1]);
    }
}
