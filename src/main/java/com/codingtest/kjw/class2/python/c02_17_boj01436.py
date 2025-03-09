num = int(input())

cnt = 1
devil_no = 666

while cnt < num:
    devil_no += 1
    if '666' in str(devil_no):
        cnt += 1

print(devil_no)
