numbers = map(int,input().split())
squared = map(lambda x: x**2, numbers)
print(sum(squared) % 10)