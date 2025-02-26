stdin = input().strip()
words = stdin.count(' ') + 1
if not stdin: words = 0
print(words)

# print(len(input().split())) 좌유 공백도 제거, 중간 공백 여러 칸도 한 번에 제거해줌
