stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

rep = int(input_alter())


def score(string):
    olist = string.split('X')
    get_score = []
    for os in olist:
        o_num = len(os)
        get_score.append((o_num + 1) * o_num // 2)
    # print(get_score)
    return sum(get_score)


for i in range(rep):
    print(score(input_alter()))

''' replace by OX -> O,X  XO -> X,O
split by ,
count each of len
'''
