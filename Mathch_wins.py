
n=int(input())
s={'A':0,'B':0}
for i in range(n):
    p,x,y=input().split()
    s[p]+=3 if float(x)**2+float(y)**2>6.75**2 else 2
print('DRAW'if s['A']==s['B']else('ALICE'if s['A']>s['B']else'BOB'))
