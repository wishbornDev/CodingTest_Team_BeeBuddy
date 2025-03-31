stdin = open(0)
input_str = lambda: stdin.readline().rstrip()

len_str = int(input_str())
summand = {chr(k): k - 96 for k in range(97, 123)}


def hashing(string):
    num = 0
    for char in string:
        num += summand[char]
        for alph in summand:
            summand[alph] *= 31
        num %= 1234567891
    return num


print(hashing(input_str()))
