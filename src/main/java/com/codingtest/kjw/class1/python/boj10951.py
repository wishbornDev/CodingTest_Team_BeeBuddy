stdin = open(0)
input_alter = lambda : stdin.readline().rstrip()

while True:
    str_to_convert = input_alter()
    if not str_to_convert: break
    converted = map(int, str_to_convert.split())
    print(sum(converted))