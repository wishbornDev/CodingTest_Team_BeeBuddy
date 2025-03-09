from collections import deque

stdin = open(0)
input_list = lambda: list(map(int, stdin.readline().split()))

num_tc = input_list()[0]


def target_in_queue(queue):
    return sum([ele[0] for ele in queue])


for i in range(num_tc):
    num, target = input_list()

    tasks = deque([[0, ele] for ele in input_list()])
    tasks[target][0] = 1
    max_impo = max(set([ele[1] for ele in tasks]))
    cnt = 0

    while target_in_queue(tasks):
        if tasks[0][1] == max_impo:
            cnt += 1
            tasks.popleft()
            max_impo = max(set([ele[1] for ele in tasks] + [0]))
        else:
            tasks.rotate(-1)

    print(cnt)

'''
enumerate을 이용하면
if tasks[0][1] == target: break
'''
