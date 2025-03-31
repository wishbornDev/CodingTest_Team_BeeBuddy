def fizzbuzz(nat):
    match nat:
        case _ if nat % 15 == 0:
            return 'FizzBuzz'
        case _ if nat % 3 == 0:
            return 'Fizz'
        case _ if nat % 5 == 0:
            return 'Buzz'
        case _:
            return nat


inputs = [input() for i in range(3)]

match inputs:
    case [x, y, z]:
        if x[-1] != 'z':
            target = int(x) + 3
        if y[-1] != 'z':
            target = int(y) + 2
        if z[-1] != 'z':
            target = int(z) + 1

print(fizzbuzz(target))

# isdigit(), isnumeric()
