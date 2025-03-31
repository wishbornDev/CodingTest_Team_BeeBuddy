num = input()


def dec_sum(target):
    digits = [int(digit) for digit in target]
    return int(target) + sum(digits)


gens = []
for nat in range(1, int(num) + 1):
    if dec_sum(str(nat)) == int(num):
        gens.append(nat)


def min_gen(nums):
    if nums: return min(nums)
    return 0


print(min_gen(gens))
