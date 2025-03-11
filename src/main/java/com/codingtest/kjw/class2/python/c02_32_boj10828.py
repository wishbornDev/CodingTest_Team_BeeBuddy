stdin = open(0)
input_str = lambda: stdin.readline().rstrip()

num_commands = int(input_str())
container = []


def stack(string):
    match string:
        case 'pop':
            if not container:
                print(-1)
            if container:
                print(container.pop())
        case 'size':
            print(len(container))
        case 'empty':
            if not container:
                print(1)
            if container:
                print(0)
        case 'top':
            if not container:
                print(-1)
            if container:
                print(container[-1])
        case _:
            container.append(string[5:])
    return


for i in range(num_commands):
    stack(input_str())
