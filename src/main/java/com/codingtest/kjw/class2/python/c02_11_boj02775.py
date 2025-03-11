stdin = open(0)
int_input = lambda: int(stdin.readline())

people = [[i for i in range(15)]]
for floor in range(1, 15):
    people_floor = []
    for room in range(15):
        people_floor.append(sum(people[floor - 1][:room + 1]))
    people.append(people_floor)

num_tc = int_input()
for _ in range(num_tc):
    floor, room = int_input(), int_input()
    print(people[floor][room])
