//Book Allocation Problem
/*
Given an array �pages� of integer numbers, where �pages[i]'
represents the number of pages in the �i-th� book.
There are �m� number of students, and the task is to allocate all the books to their students. 
Allocate books in a way such that:

1. Each student gets at least one book.
2. Each book should be allocated to a student.
3. Book allocation should be in a contiguous manner.

You have to allocate the books to �m� students such that the maximum number 
of pages assigned to a student is minimum.

Example: 
Number of books = 4 and Number of students = 2
pages[] = { 10,20,30,40}

All possible way to allocate the �4� books in �2� number of students is -
10 | 20, 30, 40 - sum of all the pages of books which allocated to 
student-1 is �10�, and student-2 is �20+ 30+ 40 = 90� so maximum is �max(10, 90)= 90�.

10, 20 | 30, 40 - sum of all the pages of books which allocated to 
student-1 is �10+ 20 = 30�, and student-2 is �30+ 40 = 70� so maximum is �max(30, 70)= 70�.

10, 20, 30 | 40 - sum of all the pages of books which allocated to 
student-1 is �10+ 20 +30 = 60�, and student-2 is �40� so maximum is �max(60, 40)= 60�.

So possible maximum number of pages which allocated to a single student is { 90, 70, 60 }.
But you have to return a minimum of this so return �min(90,70,60) =60�.
*/
#include<iostream>
using namespace std;
bool isPossible(int arr[],int m,int n,int mid)
{
	int StudentCount = 1;
	int pageSum = 0;
	
	for(int i = 0; i<n ; i++)	
	{
		if(pageSum + arr[i] <= mid)
		{
			pageSum += arr[i];
		}
		else
		{
			StudentCount += 1;
			if(StudentCount > m || arr[i] > mid)
			{
				return false;
			}
			pageSum = arr[i];
		}
	}
	return true;
}
int allocatedBooK(int arr[],int m,int n)
{
	int start = 0;
	int sum = 0;
	for(int i =0;i<n;i++)
	{
		sum = sum + arr[i];
	}
	int end = sum;
	int mid = start + (end - start)/2;
	int ans = -1;

	while(start <= end)
	{
		if(isPossible(arr,m,n,mid))
		{
			ans = mid;
			end = mid - 1;
		}
		else
		{
			start = mid + 1;
		}
		mid = start + (end - start)/2;
	}
	return ans;
}
int main()
{
	int pages[] = {60,45,26,90};
	int student = 2;
	int books = sizeof(pages)/sizeof(int);
	cout<<"Allocated Total Pages Book is : "<<allocatedBooK(pages,student,books);
	return 0;
}
