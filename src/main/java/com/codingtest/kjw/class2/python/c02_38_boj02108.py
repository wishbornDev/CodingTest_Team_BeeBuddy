from collections import Counter

stdin = open(0)
int_input = lambda: int(stdin.readline())

num = int_input()

nums = sorted([int_input() for i in range(num)])
nums_cnt = sorted(Counter(nums).items())  # (item,count)
max_cnt = max([ele[1] for ele in nums_cnt])

arith_mean = round(sum(nums) / num)
med = nums[num // 2]

modes = []
for ele in nums_cnt:
    if ele[1] == max_cnt:
        modes.append(ele[0])

mode = modes[0]
if len(modes) >= 2:
    mode = modes[1]

ran = nums[-1] - nums[0]

print(arith_mean, med, mode, ran, sep='\n')

''' 시간 초과
stdin = open(0)
int_input = lambda: int(stdin.readline())

num = int_input()

nums = sorted([int_input() for i in range(num)])
nums_dict = {num:nums.count(num) for num in nums}
nums_cnt = nums_dict.values()
max_cnt = max(nums_cnt)

arith_mean = round(sum(nums)/num)
med = nums[num//2]

modes = [] #counter 모듈
for nat in nums_dict:
    if nums_dict[nat] == max_cnt:
        modes.append(nat)

mode = modes[0]
if len(modes) >= 2:
    mode = modes[1]

ran = nums[-1] - nums[0]

print(arith_mean,med,mode,ran,sep='\n')
'''
