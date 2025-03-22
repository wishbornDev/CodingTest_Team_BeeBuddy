import math

stdin = open(0)
beg, end = map(int, stdin.read().split())


def is_prime(nat):
    if nat == 0 or nat == 1: return False
    if nat == 2 or nat == 3: return True
    for i in range(2, int(math.sqrt(nat)) + 1):
        if nat % i == 0: return False
    return True


for num in range(beg, end + 1):
    if is_prime(num):
        print(num)

'''Sieve of Eratosthenes
is_prime = [True]*(end+1) #del은 O(N)이라 쓰면 안될 듯?
for i in range(2,end+1):
    for j in range(2,end+1):
        if i*j>end: break
        is_prime[i*j] = False
        
def sieveOfEratosthenes(N): #출처 https://alive-wong.tistory.com/18
    prime_list=set(range(2, N+1)) #집합
    for i in range(2, N+1):
        if i in prime_list: 
        prime_list -= set(range(2*i, N+1, i)) 
    return prime_list
'''
