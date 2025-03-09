import functools

row, col = map(int, input().split())
board = [input() for i in range(row)]


def catch_board(array, coord):
    rows = array[coord[0]:][:8]
    cols = [sq[coord[1]:][:8] for sq in rows]
    return cols


def brute_force(coord):
    output = coord[:]
    if coord[1] == col - 8:
        output[0] += 1
        output[1] = 0
    if coord[1] < col - 8:
        output[1] += 1
    return output


def comp_board(b1):
    cb1 = ('BW' * 4 + 'WB' * 4) * 4
    cb2 = ('WB' * 4 + 'BW' * 4) * 4
    b1_str = functools.reduce(lambda x, y: x + y, b1, '')
    checker = [0, 0]
    for i in range(64):
        if b1_str[i] != cb1[i]: checker[0] += 1
        if b1_str[i] != cb2[i]: checker[1] += 1
    return min(checker)


vertex = [0, 0]
board_test = catch_board(board, vertex)
checked = [comp_board(board_test)]
while vertex != [row - 8, col - 8]:
    vertex = brute_force(vertex)
    board_test = catch_board(board, vertex)
    checked.append(comp_board(board_test))

print(min(checked))
