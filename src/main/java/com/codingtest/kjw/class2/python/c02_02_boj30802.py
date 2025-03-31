stdin = open(0)
input_list = lambda: list(map(int, stdin.readline().split()))

particip = input_list()[0]
shirts = input_list()
g_shirts, g_pens = input_list()


def num_shirts(array):
    len_arr = len(array)
    cnt = [0] * len_arr
    for i in range(len_arr):
        cnt[i] = (array[i] - 1) // g_shirts + 1
    return sum(cnt)


def num_pens(nat):
    return nat // g_pens, nat % g_pens


print(num_shirts(shirts))
print(*num_pens(particip))
