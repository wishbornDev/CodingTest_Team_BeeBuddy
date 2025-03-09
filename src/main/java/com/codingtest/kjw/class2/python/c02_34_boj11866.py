from collections import deque

num, nth = map(int, open(0).readline().split())

queue = deque(range(1, num + 1))

print("<", end='')
while len(queue) > 1:
    for i in range(nth - 1):
        queue.append(queue.popleft())
    selected = queue.popleft()
    print(selected, end=', ')
print(queue[0], end='>')

# for i in range(n-1):
#   idx = (idx+k-1)%(n-i)
# appendleft, extendleft, popleft 등 사용
