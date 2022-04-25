for i in range(int(input())):
    x = input()
    c1 = 0
    c2 = 0
    primt = 0
    for j in range(len(x)):
        if(x[j] == "A"):
            c1+=1
        if(x[j] == "B"):
            c2+=1
        if(c2 > c1):
            print("NO")
            primt = 1
            break
    if(primt==0):
        if(x[0]=='B' or x[-1]=='A'):
            print("NO")
        else:
            print("YES")