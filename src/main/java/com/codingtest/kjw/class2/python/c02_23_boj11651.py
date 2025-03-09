stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num = int(input_alter())
coords = [list(map(int, input_alter().split())) for i in range(num)]

coords_sorted = sorted(coords, key=lambda x: (x[1], x[0]))

for coord in coords_sorted:
    print(*coord)
