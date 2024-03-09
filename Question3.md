# Sample Question

## Description

Write a program that, given the x and y coordinates of two points p1(x1,y1) and p2(x2,y2) on a two-dimensional plane, finds the mid-point p3(x3,y3) of the line segment formed by p1 and p2 using the formula: x3 = (x1 + x2) / 2 and y3 = (y1 + y2) / 2.

### Class Point

- Instance variables `x` and `y`
- Constructor to initialize `x` and `y`
- Method `mid(Point p)` to return the mid-point of the line segment joining the current point to `p`
- Override the `toString()` method in the Object class to format the output

### Class Test

- The main method accepts the two input points.
- It then invokes the `mid` method of one of the objects.

## Sample Input

4 5

2 1

### Output
(3,3)