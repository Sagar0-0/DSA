#User function Template for python3

class Solution:
    def max_of_subarrays(self,arr,n,k):
        '''
        you can use collections module here.
        :param a: given array
        :param n: size of array
        :param k: value of k
        :return: A list of required values 
        '''
        #code here
        def arr_max_ind(array, start, end):
            m_ind, m_ele = start, array[start]
            for i in range(start, end):
                if array[i]>=m_ele:
                    m_ele = array[i]
                    m_ind = i
            return [m_ele, m_ind]
        
        strategy = []
        max_ele, max_ind = arr_max_ind(arr, 0, k)
        for i in range(k, n+1):
            start, end = i-k, k
            if max_ind<i and max_ind>=i-k:
                if arr[i-1]>max_ele:
                    max_ele = arr[i-1]
                    max_ind = i-1
            else:
                max_ele, max_ind = arr_max_ind(arr, i-k, i)
                
            strategy.append(max_ele)
                
        return strategy
