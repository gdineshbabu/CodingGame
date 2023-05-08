n = int(input())

count = 0
for i in range(10, n+1):
    if sum(int(d) for d in str(i)) == 10:
        count += 1

print(count)
