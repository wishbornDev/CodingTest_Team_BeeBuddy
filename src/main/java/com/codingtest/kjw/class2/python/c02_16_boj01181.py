stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num = int(input_alter())
words = {input_alter() for i in range(num)}  # 중복 제거 - 정렬할테니 문제 X
words_sorted = sorted(words, key=lambda x: (len(x), x))
print(*words_sorted, sep='\n')
