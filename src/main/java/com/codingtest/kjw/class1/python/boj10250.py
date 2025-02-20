stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

rep = int(input_alter())

def room(height,width,order):
    floor = order % height # (order - 1) % height + 1
    room_no = (order - 1) // height + 1
    if floor == 0:
        floor = height
    if room_no < 10:
        room_no = "0" + str(room_no)
    return str(floor) + str(room_no)
    # return str(floor) + f"{room_no:0>2}" # 빈 공간 0으로 채움, 오른쪽 정렬, 최소 길이 2 (과거 코드)

for i in range(rep):
    nums = map(int, input_alter().split())
    print(room(*nums))

    # pars = map(int,input_alter().split()) # 네이밍 무슨 의미인지... (과거 코드)
    # print(room(*pars))