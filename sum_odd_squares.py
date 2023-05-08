n=int(input())
c=0
for i in range(n*2):
    if i%2!=0:
        c+=i*i
print(c)
