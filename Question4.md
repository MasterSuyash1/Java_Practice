# Programming Question

## Problem Statement

Write a program that prints the roll number and the marks of the student scoring the highest marks among all students in a college, and the roll number, the marks, and the department of the student scoring the highest marks among the undergraduate (UG) students in that college. Your program should define two types - `Student` and its subtype `UGStudent`. It should accept the roll number and total marks of 3 students, of type `Student`, and the roll number, total marks, and department of 3 UG students, of type `UGStudent`.

The `StudentList` class contains a generic array which can store instances of `Student`/ `UGStudent` type. It also provides the iterator to traverse through that array which is implemented using an inner class named `Iter`. Assume that the total marks for each student are unique.

Implement the following to complete the program and obtain the specified output.

- In the class `UGStudent`
  - Complete the definition of the constructor.
- In the class `FClass`
  - Define the generic function `printTopper()` that uses an iterator of `StudentIterator` type to find the `Student` (or `UGStudent`) who obtained the highest total marks and prints the details by calling the `print()` method.
- In the class `Iter`
  - Complete the definition of `has_next()` method.

### Sample Input
10 78

11 67

12 98

101 56 EE

102 87 ME

103 33 CE

### output
12 : 98 

102 : 87 : ME