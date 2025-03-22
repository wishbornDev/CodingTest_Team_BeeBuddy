def is_prime(targ):
    if targ == 1:
        return False
    if targ == 2:
        return True
    for nat in range(2, targ):
        if targ % nat == 0:
            return False
    return True  # for loop 안에 있으면 9를 잘못 판정함


rep = int(input())
targets = map(int, input().split())

primes = list(filter(is_prime, targets))
print(len(primes))
