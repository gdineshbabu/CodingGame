


b = input().split(' ')
for i in range(len(b)):
    if i==len(b)-1:
        s=b[i]
        if len(s)==1:
            print(s,end='')
        elif len(s)==2:
            print(s,end='')
        else:
            print(s[0]+str(len(s[1:-1]))+s[-1],end='')
    else:
        s=b[i]
        if len(s)==1:
            print(s,end=' ')
        elif len(s)==2:
            print(s,end=' ')
        else:
            print(s[0]+str(len(s[1:-1]))+s[-1],end=' ')

    
