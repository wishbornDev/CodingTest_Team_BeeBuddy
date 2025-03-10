inputs = [int(input()) for i in range(10)]

rems = [x % 42 for x in inputs]
print(len(set(rems)))
