def two_sum(nums, target)
    hash = {}
    nums.each_with_index do |num, index|
      complement = target - num
      if hash.key?(complement)
        return [hash[complement], index]
      end
      hash[num] = index
    end
    return [-1, -1]
  end
