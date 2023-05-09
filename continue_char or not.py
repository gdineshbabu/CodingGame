word = input().lower()
for i in range(1, len(word)):
    if word[i] == word[i-1]:
        print("true")
        break
else:
    print("false")
