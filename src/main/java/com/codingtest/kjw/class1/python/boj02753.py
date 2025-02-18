year = int(input())

def is_leap_year(year):
    if year % 4 != 0:
        return 0
    if year % 100 == 0:
        if year % 400 != 0:
            return 0
        return 1
    return 1

print(is_leap_year(year))