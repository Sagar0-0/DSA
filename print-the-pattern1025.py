def pattern(n):
#       def pattern(self, n): #for gfg solution
        frwdCount = 1 #maitain a forward count to get first half of triange
        bckwrdCount = ((n)*(n+1)) + 1 #by seeing the last element is n * (n+1) add 1 since we know end point in range is explicite for eg to print 20 we need 21
        arr = [] #Create a arr to return
        for i in range(n):
            s = "" #intiallizing a empty string in start of every loop
            s += "--"*i #maintain blank space
            
            endCount = frwdCount + n-i #Create a endCount te keep track of last int we saved
            for j in range(frwdCount, endCount): #Starting a column loop first half of triangle
                s += str(j) + "*" #adding str(j) and *
            frwdCount = endCount #save the last integer we get
            
            
            startCount = bckwrdCount + i - n #keep track from backward
            for j in range(startCount, bckwrdCount): #Starting a column loop of second half of triangle
                if j == bckwrdCount - 1: # We dont want * at the end of column 
                    s += str(j)
                else:
                    s+= str(j) + "*" #else add it to everywhere
            bckwrdCount = bckwrdCount + i - n #Keep track of last integer
            arr.append(s) #append the column in arr
        return arr #return the array
