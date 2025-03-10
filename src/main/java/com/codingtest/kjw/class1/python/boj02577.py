a, b, c = map(int, input().split())
# a, b, c = [int(input()) for i in range(3)]
prod = a * b * c

prod = str(prod)
for i in range(10):
    print(prod.count(str(i)))
