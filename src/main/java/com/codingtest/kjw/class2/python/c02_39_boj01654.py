stdin = open(0)
int_input = lambda: int(stdin.readline())

num_cables, target = map(int, stdin.readline().split())
cables = [int_input() for i in range(num_cables)]

length = [1, max(cables)]
max_len = 0

mid = sum(length) // 2

while length[0] <= length[1]:  # != 사용 시 무한루프
    mid = sum(length) // 2
    cables_cutted = list(map(lambda x: x // mid, cables))
    num = sum(cables_cutted)

    if num >= target:
        max_len = mid
        length[0] = mid + 1

    if num < target:
        length[1] = mid - 1

print(max_len)

''' 시간 초과
stdin = open(0)
int_input = lambda: int(stdin.readline())

num_cables, target = map(int,stdin.readline().split())
cables = [int_input() for i in range(num_cables)]

length = 1
num = sum(cables)

while num >= target:
    length *= 2
    cables_cutted = list(map(lambda x:x//length, cables))
    num = sum(cables_cutted)

while num < target:
    length -= 1
    cables_cutted = list(map(lambda x: x // length, cables))
    num = sum(cables_cutted)

print(length)
'''
