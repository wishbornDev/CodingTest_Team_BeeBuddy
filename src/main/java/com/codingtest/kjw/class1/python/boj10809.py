stdin = input()
idxs = []

for i in range(26):
    alpha = chr(i + 97)
    if alpha in stdin:
        idxs.append(stdin.index(alpha))
    else:
        idxs.append(-1)

print(*idxs)

# stdin = input()
# for i in range(97,123):
#     print(stdin.find(chr(i)), end=' ')

# print(*map(input().find,map(chr,range(97,123)))) 숏코딩
