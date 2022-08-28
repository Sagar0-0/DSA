
#Question Link:-https://practice.geeksforgeeks.org/problems/immediate-smaller-element1142/1
class Solution:

	def immediateSmaller(self,arr,n):
		# code here
		for i in range(1,n):
		    if arr[i]<arr[i-1]:
		        arr[i-1]=arr[i]
		    else:
		        arr[i-1]=-1
		arr[n-1]=-1
		return arr
  
  #EXPLANATION:- We iterate through the array and check if the current element is smaller than the prev element, if it is, we swap the element else we assign -1 to that element. Lastly, we initialize -1 to the last element as there is no element after it to check from
  
