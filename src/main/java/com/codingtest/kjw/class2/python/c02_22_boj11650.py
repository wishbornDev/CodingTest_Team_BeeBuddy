stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num = int(input_alter())
coords = [list(map(int, input_alter().split())) for i in range(num)]
# for i1,i2 in combinations(range(num),2): N^2은 시간 초과 발생. NlogN 안에서 해결해야
#     if coords[i1][0] > coords[i2][0]:
#         coords[i1], coords[i2] = coords[i2], coords[i1]
#     if coords[i1][0] == coords[i2][0] and coords[i1][1] > coords[i2][1]:
#         coords[i1], coords[i2] = coords[i2], coords[i1]

coords_sorted = sorted(coords, key=lambda x: (x[0], x[1]))  # 역순은 -x[1] 등으로 가능

for coord in coords_sorted:
    print(*coord)
