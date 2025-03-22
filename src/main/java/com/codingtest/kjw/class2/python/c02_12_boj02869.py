up, down, goal = map(int, input().split())

day = (goal - up) // (up - down) + 1
if (goal - up) % (up - down) != 0:
    day += 1

print(day)
