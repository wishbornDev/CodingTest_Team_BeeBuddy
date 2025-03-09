stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num = int(input_alter())
mems = [input_alter().split() for i in range(num)]
mems_sorted = sorted(mems, key=lambda x: int(x[0]))
for mem in mems_sorted:
    print(*mem)

# 안정 정렬(stable sort)
