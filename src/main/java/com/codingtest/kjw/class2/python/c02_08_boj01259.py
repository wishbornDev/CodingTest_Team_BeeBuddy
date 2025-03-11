stdin = open(0)
input_str = lambda: stdin.readline().rstrip()


def is_palindrome(string):
    if string == string[::-1]:
        return 'yes'
    return 'no'


test = input_str()
while test != '0':
    print(is_palindrome(test))
    test = input_str()

# while int(s:=input()):print('yneos'[s!=s[::-1]::2])
