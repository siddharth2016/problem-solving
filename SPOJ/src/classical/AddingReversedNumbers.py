for i in range(int(input())):
    n1,n2 = [int(a) for a in input().split()]
    n1r,n2r = int(str(n1)[::-1]),int(str(n2)[::-1])
    res = int(str(n1r+n2r)[::-1])
    print(res)