stdin = open(0)
input_list = lambda: list(map(int, stdin.readline().split()))

len_seq = input_list()[0]
seq = set(input_list())

num_targ = input_list()[0]
targets = input_list()


def det(sequence, array):
    for ele in array:
        if ele in sequence:
            print(1)
        if ele not in sequence:
            print(0)
    return


det(seq, targets)
