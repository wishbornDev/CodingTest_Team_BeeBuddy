stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num_ps = int(input_alter())


def valid_ps(ps):
    cnt = 0
    for p in ps:
        match p:
            case '(':
                cnt += 1
            case ')':
                cnt -= 1
        if cnt == -1: return 'NO'
    if cnt == 0: return 'YES'
    return 'NO'


for i in range(num_ps):
    print(valid_ps(input_alter()))

# PS: Parenthesis String
