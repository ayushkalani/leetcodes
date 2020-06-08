public class twoSum {

  public static int[] twoSumans(int[] nums, int target) {
    int firstIndex= -1, secondIndex = 0, find=0;
    for(int i=0;i<nums.length; i++) {
      find = target - nums[i];
      for(int j=i+1;j<nums.length;j++){
          if(find == nums[j]) {
            secondIndex = j;
            firstIndex = i;
            break;
          }
      }
      if (firstIndex != -1 ) break;
    }
    return new int []{firstIndex, secondIndex};
  }


  public static void main(String[] args) {
    int[] ayush = {2, 7, 11, 15};
    int [] s = twoSumans(ayush, 9);
    System.out.println(twoSumans(ayush, 9));
  }
}