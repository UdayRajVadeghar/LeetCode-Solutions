def two_sum(nums, target)
    nums.each_with_index do |num1, i|
      (i+1...nums.length).each do |j|
        num2 = nums[j]
        if num1 + num2 == target
          return [i, j]
        end
      end
    end
    return [-1, -1]
  end