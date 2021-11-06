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
