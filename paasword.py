n = int(input())

for i in range(n):
    password = ""
    filename = input()
    length = len(filename)
    for j in range(length):
        c = filename[j]
        if c.isdigit():
            password += str(int(c) * length)
        elif c.isalpha():
            password += str(ord(c) % length)
        else:
            password += str(j + length)
    print(password)
