# counting sort 계수 정렬
stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()
num = int(input_alter())

cnt = [0] * 10000
for i in range(num):
    cnt[int(input_alter()) - 1] += 1

# def count(array):
#     cnt = [0]*10000
#     for ele in array:
#         cnt[ele-1] += 1
#     return cnt
#
# cnt_l = count(l)

for j in range(10000):
    if cnt[j] != 0:
        for k in range(cnt[j]):
            print(j + 1)

'''
num, *l = map(int,open(0))

def count(array):
    cnt = [0]*10000
    for ele in array:
        cnt[ele-1] += 1
    return cnt

def cumul(array):
    cum = []
    for i in range(len(array)):
        cum.append(sum(array[:i+1]))
    return cum

cnt_l = count(l)
cumul_l = cumul(cnt_l)

# result = [0]*num: 메모리 초과 발생

for nat in reversed(l):
    cumul_l[nat-1] -= 1
    result[cumul_l[nat-1]] = nat

for res in result:
    print(res)

print(*result,sep='\n')
'''
