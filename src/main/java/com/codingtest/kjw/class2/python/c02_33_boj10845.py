from collections import deque

stdin = open(0)
input_str = lambda: stdin.readline().rstrip()

num_commands = int(input_str())
queue = deque()


def queue_op(string):
    match string:
        case 'pop':
            if not queue:
                print(-1)
            if queue:
                print(queue.popleft())
        case 'size':
            print(len(queue))
        case 'empty':
            if not queue:
                print(1)
            if queue:
                print(0)
        case 'front':
            if not queue:
                print(-1)
            if queue:
                print(queue[0])
        case 'back':
            if not queue:
                print(-1)
            if queue:
                print(queue[-1])
        case _:
            queue.append(string[5:])
    return


for i in range(num_commands):
    queue_op(input_str())
