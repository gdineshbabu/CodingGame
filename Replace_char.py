word = input()
for i in range(len(word),0,-1):
    print(word[:i] + '*'*(len(word)-i))
print('*'*len(word))

