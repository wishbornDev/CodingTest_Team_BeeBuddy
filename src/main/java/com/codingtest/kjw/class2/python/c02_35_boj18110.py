stdin = open(0)
int_input = lambda: int(stdin.readline())


def approp_round(real):
    if real - int(real) >= 0.5:
        return int(real) + 1
    return int(real)


num_op = int_input()
num_trunc = approp_round(num_op * 15 / 100)

scores = [0]
if num_op:
    scores = sorted([int_input() for i in range(num_op)])
truncated_scores = scores
if num_trunc:
    truncated_scores = scores[num_trunc:-num_trunc]

trunc_mean = sum(truncated_scores) / len(truncated_scores)
rounded = approp_round(trunc_mean)

print(rounded)
