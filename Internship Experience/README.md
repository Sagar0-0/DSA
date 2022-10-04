#Problem from Coding Ninjas


Alice has completed various courses on coding ninja, and now she is confident for her coding interviews. 
She plans to do internships in the summer and has prepared a list of ‘N’ companies. For each i-th company, the minimum experience needed is ‘minExp[i]’ days, 
and after completing the internship, she gains ‘expGained[i]’ days of experience. She is already having ‘D’ days of experience. As she is available only in summers, 
she can complete at most ‘K’ internships. Your task is to tell her the maximum experience(in days) she can gain after completing at most ‘K’ internships.


Note :
She cannot do more than one internship in the same company.


Input Format :
The first line of the input contains an integer ‘T’ representing the number of test cases.

The first line of each test case contains a single integer, ‘D’, where ‘D’ represents the amount of experience(in days) Alice has.

The second line of each test case contains a single integer, ‘K’, where ‘K’ denotes the maximum number of internships that Alice can complete.

The third line of each test case contains a single integer, ‘N’, where ‘N’ denotes the number of companies in which Alice wants to do an internship.

The next ‘N’ lines contain two space-separated integers, ‘minExp’ and ‘expGained’, where ‘minExp’ denotes the minimum experience(in days) needed, and 
‘expGained’ denotes the experience(in days) gained after completion of the internship.


Output Format :
For each test case, print the maximum experience(in days) she can gain after completing at most ‘K’ internships.
The output of each test case will be printed in a separate line.



1 <= T <= 5
0 <= D <= 10 ^ 5
1 <= N <= 100
0 <= K <= N
0 <= minExp, expGained <= 10 ^ 5

Time Limit : 1 sec

Where ‘T’ is the number of test cases, ‘D’ is initial amount of experience, ‘N’ denotes the number of companies,
‘K’ represents the maximum number of internships Alice can complete, ‘minExp’ and ‘expGained’ 
denotes the minimum experience needed and experience gained after completing a particular internship respectively.



Sample Input :

2
0
3
5
2 2
0 1
1 1
1 2
3 5
2
4
6
0 1
0 2
0 3
2 5
3 3
5 5


Sample Output :
 8
 18
 
 Explanation :
 
 
Test case 1:
The initial experience is 0 days. Alice can only do an internship in the second company
After completing the internship, she has 1 day of experience. Now she can do an internship in the fourth company and gain 2 days of experience.
After completing the internship, she has 3 days of experience. Now she can do an internship in the fifth company and gain 5 days of experience.
So the maximum experience she can gain after completing 3 internships is 8 days.

Test case 2:
The initial experience is 2 days. Alice can do an internship in any of the first 4 companies. 
She completes an internship in the fourth company and gains 5 days of experience.
Now she has 7 days of experience. She completes an internship in the sixth company and gains 5 days of experience.
Now she has 12 days of experience. She completes an internship in the fifth company and gains 3 days of experience.
Now she has 15 days of experience. She completes an internship in the third company and gains 3 days of experience.
So the maximum experience she can gain after completing 4 internships is 18 days.




