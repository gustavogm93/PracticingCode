import java.util.Arrays;

public class SingleNumberD {

    public static void main(String[] args) {

        int[] twice = {2,2,1};
        int[] single = {4,1,2,1,2};
        System.out.println(getOneItemOnly(single));
    }

    public static int getOneAppearitionItem(int[] nums ){
        Arrays.sort(nums);

        if(nums.length == 1){
            return nums[0];
        }

        for(int i = 0; i < nums.length - 1; i++){
           if(nums[i] == nums[i+1]){
               i++;
               continue;
           } else {
               return nums[i];
           }

        }


        return nums[nums.length - 1];
    }
    public static int getOneItemOnly(int[] nums){
    int result = 0;

        for(int i=0;i<nums.length;i++){
        result = result ^ nums[i];
    }
        System.out.println(result);
        return result;
}

}
