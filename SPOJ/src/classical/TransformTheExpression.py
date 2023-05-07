#code
d = {'^':5, '*': 3, '/':4, '+':1, '-':2}
for _ in range(int(input())):
    exp = input().strip()
    res = ""
    stack = []
    for i in exp:
        if i not in d and i!=')' and i!='(':
            res+=i

        elif i=='(':
            stack.append(i)

        elif i==')':
            while len(stack)!=0 and stack[-1]!='(':
                res+=stack[-1]
                stack.pop()
            stack.pop()

        else:
            while len(stack)!=0 and stack[-1]!='(' and d[stack[-1]]>=d[i]:
                res+=stack[-1]
                stack.pop()
            stack.append(i)

    while len(stack)!=0:
        res+=stack[-1]
        stack.pop()

    print(res)