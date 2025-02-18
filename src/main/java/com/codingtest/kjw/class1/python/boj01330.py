a, b = map(int, input().split())

match a - b:
    case _ if a - b > 0:
        print(">")
    case _ if a - b < 0:
        print("<")
    case _:
        print("==")