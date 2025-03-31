add = int(input())

inc = lambda n: 6 * n

cnt = 1
ub = 1

while add > ub:
    ub += inc(cnt)
    cnt += 1

print(cnt)
