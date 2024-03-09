Write a program that, given two rational numbers r1(p1/q1) and r2(p2/q2) as input, where p1, p2, q1, q2 are integers, finds the product r3(p3/q3) of r1 and r2. Assume that neither q1 nor q2 will be zero.

Class Rational should have the following members:
- Instance variables p and q
- A constructor to initialize p and q
- A method `public Rational product(Rational r)` to compute the product r3, where p3 = p1 * p2, and q3 = q1 * q2.
- A method that overrides the method `toString()` to print the output as p3/q3.

Class Test has the main method.
- The method main() should accept inputs p and q. The first line of input will be p1 and q1. The second line of input will be p2 and q2.

### Sample input 1:
11 4 

5 6

### Output


55/24

