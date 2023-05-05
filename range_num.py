i, j = map(int, input().split())
numbers = ''.join(str(k) for k in range(1, j+1))
output = numbers[i-1:j]
print(output)
