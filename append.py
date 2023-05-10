
a = int(input())
b = int(input())
c = int(input())
d = int(input())

current_number = a

for _ in range(d):
    line = []
    for _ in range(c):
        line.append(str(current_number))
        current_number += b
    print(" ".join(line))
