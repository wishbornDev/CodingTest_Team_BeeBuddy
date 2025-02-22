stdin = open(0)
input_alter = lambda: stdin.readline().rstrip()

num_cases = int(input_alter())
for i in range(num_cases):
    replaced = ''
    rep, string = input_alter().split()
    for char in string:
        replaced += char * int(rep)
    print(replaced)

# stdin = open(0) # 이쪽이 성능은 더 좋음
#
# input_alter = lambda: stdin.readline().rstrip()
#
# num_test = int(input_alter())
# for i in range(num_test):
#     rep, string = input_alter().split()
#     string_modif = string
#     for char in set(string):
#         char_rep = r"%s" %char
#         char_rep = char_rep*int(rep)
#         string_modif = string_modif.replace(char,char_rep)
#     print(string_modif)
