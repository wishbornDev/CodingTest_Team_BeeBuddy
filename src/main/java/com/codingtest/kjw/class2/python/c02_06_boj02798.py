num, threshold = map(int, input().split())
cards = list(sorted(map(int, input().split())))

idx = [0, 1, 2]


# combinations
def draw(deck, pos):
    return [deck[pos[i]] for i in range(3)]


def brute_force(pos):
    if pos[1] == num - 2:
        pos[0] += 1
        pos[1] = pos[0] + 1
        pos[2] = pos[1] + 1
    if pos[1] < num - 2:
        if pos[2] < num - 1:
            pos[2] += 1
        elif pos[2] == num - 1:  # elif 안쓰려고 하니 빠뜨리는게 생김: pos 대신 다른 변수 쓰면 해결 될 듯
            pos[1] += 1
            pos[2] = pos[1] + 1
    return pos


drawn = [draw(cards, [0, 1, 2])]
while idx != [num - 3, num - 2, num - 1]:
    idx = brute_force(idx)
    drawn.append(draw(cards, idx))

drawn_sums = list(map(sum, drawn))
filtered_sums = list(filter(lambda x: x <= threshold, drawn_sums))

print(max(filtered_sums))

''' ChatGPT
def brute_force(pos, num):
    match pos:
        case [x, y, z] if y == num - 2:
            pos[0] += 1
            pos[1] = pos[0] + 1
            pos[2] = pos[1] + 1
        case [x, y, z] if y < num - 2:
            if z < num - 1:
                pos[2] += 1
            elif z == num - 1:
                pos[1] += 1
                pos[2] = pos[1] + 1
        case _:
            pass

    return pos
'''
