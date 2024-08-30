public class minimum {
    public static int sumArray(int[] nums) {
        int sum =0;
        for(int i=0;i<nums.length; i++){

            sum = nums[i] + sum;
        }
        return sum;

    }
    public static void main(String[] args) {
        int[] sum= { };

        System.out.println(sumArray(sum));


        }
    }

