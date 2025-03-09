stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()


def balanced(string):
    stack = ['empty_stack']
    for char in string:
        match char:
            case '(':
                stack.append('(')
            case ')':
                test = stack.pop()
                if test != '(':
                    return 'no'
            case '[':
                stack.append('[')
            case ']':
                test = stack.pop()
                if test != '[':
                    return 'no'
    if len(stack) == 1:
        return 'yes'
    return 'no'


target = input_alter()
while target != '.':
    print(balanced(target))
    target = input_alter()
