class Solution {
  List<int> twoSum(List<int> nums, int target) {
  int target1;
  Map<int, int> map1 = {};
  List<int> arr1 = List.filled(2, -1);

  for (int i = 0; i < nums.length; i++) {
    target1 = target - nums[i];

    if (map1.containsKey(target1)) {
      arr1[0] = map1[target1]!;
      arr1[1] = i;
      break;
    } else {
      map1[nums[i]] = i;
    }
  }
  return arr1;
}

void main() {
  List<int> nums = [2, 7, 11, 15];
  int target = 9;
  List<int> result = twoSum(nums, target);

  print('Indices: ${result[0]}, ${result[1]}');
}

}