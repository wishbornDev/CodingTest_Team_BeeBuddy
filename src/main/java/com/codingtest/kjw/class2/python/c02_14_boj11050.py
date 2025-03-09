n, k = map(int, input().split())


def factorial(n1: int) -> int:
    fac = 1
    while n1 > 0:
        fac *= n1
        n1 -= 1
    return fac


def choose(n1: int, n2: int) -> int:
    return factorial(n1) // factorial(n2) // factorial(n1 - n2)


print(choose(n, k))  # math.comb
