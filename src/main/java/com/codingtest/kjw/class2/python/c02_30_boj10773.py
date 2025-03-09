stdin = open(0)
int_input = lambda: int(stdin.readline())

stack = []


def stack_op(num):
    match num:
        case 0:
            stack.pop()
        case _:
            stack.append(num)
    return None


num_input = int_input()
for i in range(num_input):
    stack_op(int_input())
print(sum(stack))
