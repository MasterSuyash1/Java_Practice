## Employee Promotion Criteria

It has been decided to give a promotion to one of the four employees in the Sales department of a company based on the following criteria:

An employee with the maximum number of years of experience is considered the ideal candidate for promotion. If two employees have the maximum experience, then the one who has taken the minimum number of days of leave will be considered for promotion. Assume that no two of them have taken the same number of days of leave.

### Class Employee

- Must implement the interface Comparable.
- Should have the following members:
  - Instance variables: 
    - ID (employee ID)
    - experience (number of years of experience)
    - nleaves (number of days of leave taken so far)
  - Override the method `equals(Object o)` such that it returns true if the two employees being compared have the same ID; else, return false.
  - Override the method `compareTo(Object obj)` to compare two Employee objects, based on experience and nleaves.

### Class Company

- Has two methods:
  - The method `main()` in Class Company accepts the inputs to instantiate four objects of `Employee[]` type. The input is accepted in the order ID, experience, and nleaves, for each employee. It then invokes the method `displayID(e)`, which returns the ID of the employee who gets the promotion.
  - `int displayID(Employee[] emp)` returns the ID of the Employee object who gets the promotion, by using the method `compareTo(Employee e)` inside the class Employee.

### Sample Input:

10 2 1

10 2 1

11 3 1

12 3 0

### output
12