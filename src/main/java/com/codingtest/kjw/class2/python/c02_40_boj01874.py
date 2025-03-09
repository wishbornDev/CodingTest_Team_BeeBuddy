stdin = open(0)
int_input = lambda: int(stdin.readline())

num = int_input()
seq = list(reversed([int_input() for _ in range(num)]))

stack = []
inputs = list(range(1, num + 1))
stack_memory = []


def stack_op():
    target = seq.pop()

    for nat in inputs:
        stack.append(nat)
        stack_memory.append('+')

        while stack and stack[-1] == target:
            stack.pop()
            stack_memory.append('-')
            if seq:
                target = seq.pop()

    if stack:
        print('NO')
    if not stack:
        print(*stack_memory, sep='\n')
    return None


stack_op()

''' 마지막에 -1이 빠지지 않아서 잘못된 코드
def stack_op():
    target = seq.pop()
    while seq:
        while stack[-1] < target:
            stack.append(inputs.pop())
            stack_memory.append('+')

        if stack[-1] == target:
            stack.pop()
            stack_memory.append('-')
            target = seq.pop()

        if stack[-1] > target:
            break
            
    if stack != [-1]:
        print('NO')
    if stack == [-1]:
        print(*stack_memory, sep='\n')
    return None

stack_op()
'''
