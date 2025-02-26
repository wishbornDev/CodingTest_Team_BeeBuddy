stdin = open(0)
input_list = lambda : list(map(int,stdin.readline().rstrip().split()))

while True:
    converted = input_list()
    if converted == [0, 0]: break
    print(sum(converted))