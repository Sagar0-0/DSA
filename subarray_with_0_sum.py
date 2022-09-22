        st=set()
        sum=0
        for i in arr:
            sum+=i
            if sum in st or sum==0:
                return True
            else:
                st.add(sum)
        return False
