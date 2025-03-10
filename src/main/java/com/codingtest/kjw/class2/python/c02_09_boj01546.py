input_alter = open(0).readline

subj_no = int(input_alter().rstrip())

scores = list(map(int, input_alter().rstrip().split()))
max_score = max(scores)
tot_score = sum(scores)

avg = tot_score / max_score * 100 / subj_no

print(avg)
