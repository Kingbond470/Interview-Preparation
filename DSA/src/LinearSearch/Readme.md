## Search

### Linear Search

![Find Numbers with Even Number](https://leetcode.com/problems/find-numbers-with-even-number-of-digits/)

Approach : - 

1 .  
- Convert number to string
- By appending ""
- Count the length of string

T(C) - O(N) S(C) - O(N)

2 .
- run a loop 
- while number is greater than 0 then increase count and n/=10
- check the count

T(C) - O(NlogN) S(C)- O(1)

3 . 
- run a loop
- use Math.log10(number)+1
- conver it to int( return double value) and check the count

T(C) - O(N) S(C) - O(1)

4 . Best approach within constraints
- Use if conditions,
- number >=10 && number<100 || number>=1000 && number<10000 .......
- check the count

T(C) - O(N) s(C) - O(1) 




## Binary Search

- Array should be in sorted order
- Find mid using -> start+end/2 (the problem, if start and end sum  are large value then exceed the size of integer range)
- if target is greater than mid then increase start from mid+1
- if target is less than mid then decreasea end from mid-1
- if target is equal to mid then return mid

T(C) - O(logN) -> because it follows N/2^0 + N/2^1 + N/2^2 + .... + N/2^k  

so,  1 = N/2^k , 2^k=N ( by taking Log) 

Log 2^k= Log N

K= Log N/Log 2

K= Log N

S(C) - O(1)
