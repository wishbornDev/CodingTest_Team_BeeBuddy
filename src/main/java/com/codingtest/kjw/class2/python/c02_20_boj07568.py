stdin = open(0)
input_list = lambda: list(map(int, stdin.readline().split()))

num = input_list()[0]
people = [input_list() for _ in range(num)]


def size_order(array):
    rank = [1] * len(array)

    for i in range(len(array)):
        for j in range(len(array)):
            if array[j][0] > array[i][0] and array[j][1] > array[i][1]:
                rank[i] += 1

    return rank


print(*size_order(people))
