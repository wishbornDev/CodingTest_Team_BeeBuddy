nums = [input() for i in range(9)]
maximum = max(nums)
print(maximum, nums.index(maximum)+1, sep="\n")