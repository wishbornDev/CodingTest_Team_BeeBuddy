stdin = open(0)
input_list = lambda : stdin.readline().rstrip().split()

length, threshold = map(int, input_list())
numbers = map(int, input_list())

filtered = filter(lambda x: x < threshold, numbers)
print(*filtered)