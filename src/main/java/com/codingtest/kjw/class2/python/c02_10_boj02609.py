import math

a, b = map(int, input().split())
print(math.gcd(a, b), math.lcm(a, b), sep='\n')

# a,b=map(int,input().split());L=a*b
# while b:a,b=b,a%b
# print(a,L//a)
