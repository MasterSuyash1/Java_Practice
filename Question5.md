## PosNegAvg Program

Write a Java program named `PosNegAvg` that calculates the average of positive and negative integers in an array.

The program should follow the given specifications:

- Create a class named `PosNegAvg`.
- Inside the class, define the following instance variables:
  - `posAvg` and `negAvg` of type `double` to store the average of positive and negative integers, respectively.
  - `posCount` and `negCount` of type `double` to store the count of positive and negative integers, respectively.
- Implement a method named `avg` that takes an integer array `arr` as input and calculates the average of positive and negative integers separately.
- In the `avg` method:
  - Iterate through the elements of the array `arr`.
  - For each element:
    - If it is greater than 0, add it to `posAvg` and increment `posCount`.
    - If it is less than 0, add it to `negAvg` and increment `negCount`.
- After iterating through the array, calculate the average of positive and negative integers by dividing `posAvg` and `negAvg` by `posCount` and `negCount`, respectively.
- Implement the `main` method to take input from the user:
  - Create a `Scanner` object to read input from the console.
  - Read an integer `length` representing the length of the array.
  - Read `length` integers into the array `arr`.
  - Call the `avg` method with the `arr` array.
  - Print the average of positive integers followed by the average of negative integers, each on a separate line.
  - Close the `Scanner` object.
  
### Sample Input and Output

**Input:**
5

-10 12 12 -15 12

## Output
12.0

-12.5

