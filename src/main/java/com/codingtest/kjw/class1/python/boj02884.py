hour, minute = map(int, input().split())
t = 60 * hour + minute - 45
print((t // 60) % 24, t % 60)