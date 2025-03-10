from collections import deque

num = int(open(0).readline())

queue = deque(range(1, num + 1))

while len(queue) != 1:
    queue.popleft()
    queue.append(queue.popleft())

print(queue[0])
# appendleft, extendleft, popleft 등 사용
