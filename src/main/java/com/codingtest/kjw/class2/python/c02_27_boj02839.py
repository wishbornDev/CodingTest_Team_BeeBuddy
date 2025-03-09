sugar = int(input())

num = [0, 0]  # [1,0]: 10일 때를 체크 못함


def brute_force(idx):
    output = idx[:]
    if idx[1] == 1000:
        output[0] += 1
        output[1] = 0
    if idx[1] < 1000:
        output[1] += 1
    return output


def checker(idx):
    return 3 * idx[0] + 5 * idx[1] == sugar


possible = []
while num != [1666, 1]:
    if checker(num): possible.append(sum(num))
    num = brute_force(num)


def ans(container):
    if container: return min(container)
    return -1


print(ans(possible))
