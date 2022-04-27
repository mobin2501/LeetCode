#Submitted and Accepted
def palindrome(n):
    s=str(n)
    l=len(s)-1
    b=False
    i=0
    while i< len(s):
        if s[i]==s[l-i]:
            b=True
        else:
            b=False
            break
        i=i+1
    return b

print(palindrome(123321))