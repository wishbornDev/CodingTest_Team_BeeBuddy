def grade(score):
    if score >= 90:
        return 'A' # return으로 빠져나갈 수 있으므로 if문 만으로도 깔끔하게 작성 가능
    if score >= 80:
        return 'B'
    if score >= 70:
        return 'C'
    if score >= 60:
        return 'D'
    return 'F'

score = int(input())
print(grade(score))

# 숏코딩
# print('FFFFFFDCBAA'[int(input())//10])
