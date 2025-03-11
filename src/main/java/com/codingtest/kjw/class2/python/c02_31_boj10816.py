stdin = open(0)
input_alter = lambda: stdin.readline()

num_cards = int(input_alter())
cards = list(map(int, input_alter().split()))
num_det = int(input_alter())
dets = list(map(int, input_alter().split()))


def is_in(own, check):
    checked = {}
    for card in own:
        if card in checked: checked[card] += 1
        if card not in checked: checked[card] = 1
    for ele in check:
        if ele in checked:
            print(checked[ele], end=' ')
        if ele not in checked:
            print(0, end=' ')
    return None


is_in(cards, dets)
