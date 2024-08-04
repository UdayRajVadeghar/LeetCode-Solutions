use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut hash_map = HashMap::new();
        
        for (i, &num) in nums.iter().enumerate() {
            let complement = target - num;
            
            if let Some(&index) = hash_map.get(&complement) {
                return vec![index as i32, i as i32];
            }
            
            hash_map.insert(num, i);
        }
        
        vec![-1, -1] // Return [-1, -1] if no solution is found
    }
}
