[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/q1gJdgcG)
[![Open in Codespaces](https://classroom.github.com/assets/launch-codespace-7f7980b617ed060a017424585567c406b6ee15c891e84e1186181d67ecf80aa0.svg)](https://classroom.github.com/open-in-codespaces?assignment_repo_id=12865206)
# APA1_partA
Part A - a portfolio of algorithms, data structures and design patterns (40%)

This readme is where your code snippets, descriptions etc will go.
# APA1 partA

Part A - a portfolio of algorithms, data structures and design patterns (40%)

This readme is where your code snippets, descriptions and so on will go.

This [Markdown Cheat Sheet](https://www.markdownguide.org/cheat-sheet/) will help you with the basic syntax that you'll need.

## Example - delete and replace with your own.

### Table of contents
---

[Bubble Sort](#bubble-sort)

### My Multi Word Header

**This example meets expectations for the merit grade. It doesn't do anything specifically that exceeds expectations as per the mark scheme and it only includes implementation in one programming language.**


### Bubble Sort

The bubble sort is one of the first algorithms that you learn about when you are studying computing or software development. It's purpose is really just to serve as an introduction to sorting algorithms. Compared to other sorting algorithms it is very very slow and would not be used in any production purposes. It is relatively easy to understand however and it's inefficiencies and ways to improve it are quite easy to understand.

Although it wasn't called it at the time, the principle for the bubble sort was first outlined in an [Association of Computing Machinery academic paper from 1956][1].

In plain English, a bubble sort operates on an array or list, starting on the left hand side of the structure and comparing pairs of elements. Assuming we are sorting in ascending order, if the right-most of the elements being compared is less than (i.e. lower) the the left, then their position will be swapped. Moving right by one, the next pair of elements are compared and swapped if necessary, continuing until you reach the end of the data structure.

At this point, because of the algorithm, the largest element in the array will have moved to the end of the list (often known as bubbling to the end). 

Traversing the list L to R is known as a Pass. After 1 pass the largest number will be on the far right. Usually, sorting a list takes multiple passes. After 2 passes, at a minimum the two largest numbers will be on the right of the data structure.

### Basic Python Implementation

* A nested loop.
* The inner loop (a ```for``` loop below passes through the list once L-R)
* The outer while loop repeats passes.
* Once no swaps are made, a computer will know the list is sorted.
* A computer always takes an extra pass compared to a human, as a human can visually see the list is sorted, but a computer cannot.

```python
numbers = [6, 3, 2, 4, 1, 5]

swapped = True # Boolean which tracks whether a swap has been made on a pass
while swapped: # While swapped is True (the list is not yet sorted)
    swapped = False # Start a pass, set swapped to false
    for i in range(len(numbers)-1): # Traverse list until two from the end (range doesn't include the stopping numbers
        if numbers[i] > numbers[i+1]:
            numbers[i], numbers[i+1] = numbers[i+1], numbers[i]  # Swap the elements (in place)
            swapped = True # A swap has been made so set boolean to be true
```

The implementation above as is are not the most optimal. We know that after one pass through the list then the right most element is sorted. After two passes, the two right most are sorted, after three passes, three are sorted and so on. The algorithm above continues to compare against the sorted elements, which is not as efficient as it could be.

An option is to decrement the list traversal variable in the for loop.

```python
numbers = [6, 3, 2, 4, 1, 5]

stop = len(numbers)
swapped = True
while swapped:
    swapped = False
    for i in range(stop - 1):  # Adjust the range of the loop
        if numbers[i] > numbers[i + 1]:
            numbers[i], numbers[i + 1] = numbers[i + 1], numbers[i]
            swapped = True
    stop -= 1  # Reduce the range for the next pass

print(numbers)
```
This now avoids comparisons against sorted parts of the list.

### Time Complexity

The best possible case is that the list is already in sorted order. This would be O(n), however this is extremely unlikely. Due to the fact that there is a loop inside a loop, then  O(n<sup>2</sup>) is the worst case scenario.

### Example Use

There are no real practical uses of bubble sort in the real world. This does not mean it is not useful however.

* Teaching - simple to understand 
* Introduction to algorithms
* Learning about optimisations


#### Additional things that could have been added.

* Table of pros/cons 
* Different examples of implementations with pros and cons where appropriate
* Additional implementation in another programming language
* Links to more information

---

[1]: https://dl.acm.org/doi/pdf/10.1145/320831.320833




