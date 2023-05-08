
n = int(input())
paths = [list(map(int, input().split())) for _ in range(n)]
values = [q * v for q, v in paths]
min_index = values.index(min(values))
print(min_index + 1)
