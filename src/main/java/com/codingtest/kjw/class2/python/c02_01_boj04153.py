stdin = open(0)
input_list = lambda: map(int, stdin.readline().split())


def is_triangle(array):
    match array:
        case [x, y, z]:
            if x ** 2 + y ** 2 == z ** 2:
                return 'right'
    return 'wrong'


test = sorted(input_list())
while test != [0, 0, 0]:
    print(is_triangle(test))
    test = sorted(input_list())
