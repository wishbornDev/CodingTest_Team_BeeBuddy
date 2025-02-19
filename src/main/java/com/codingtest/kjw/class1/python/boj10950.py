num = int(input())
for i in range(num):
    print(sum(map(int,input().split())))

# 다른 방법: 위의 방법이 시간 훨씬 빠름
# n=int(input())
# for i in range(n):print(eval('+'.join(input().split())))