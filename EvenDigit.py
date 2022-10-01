# A program, which will find all such numbers between two numbers 
# such that each digit of the number is an even number is given below.

a,b=(int(i) for i in input("Enter the lower limit and upper limit of range: ").split(" "))
numbers=[]
if a<b:
    for i in range(a,b+1):
        digit=str(i)
        count=0
        for j in range(len(str(i))):
            if (int(digit[j])%2==0):
                count+=1
        if count==len(str(i)):
            numbers.append(i)
    print(numbers)
else:
    print("Wrong range.")