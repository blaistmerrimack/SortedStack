# SortedStack

## Related Repository
https://github.com/blaistmerrimack/SortedLinkedList

## Program Details
This program is a maintenance task update to the SortedLinkedList program.
Details for the maintenance task request can be found in the included Maintenance/Change Request File of this repository.

This program continues to serve as a good example of how code can be re-used to improve code quality, build out programs easily, and especially maintain those programs. Most of the code for this program was re-used from the SortedLinkedList project, with changes taking advantage of existing Java Collections Framework objects to quickly update the program. The program implements a Stack data structure where the stack of integers is ordered from smallest to largest, with the smallest values at the top of the stack. To accomplish this, the Stack class from the Java Collections Framework is used as the primary building block for the data structure, and its methods for adding items to the stack and sorting the stack are re-used within the program to implement the sorted stack requirement. The ```.add()``` and ```.sort()``` methods are inherited from parent interfaces within the framework, demonstrating how re-use of functionality through inheritance can benefit us when building programs. In addition, the SortedStack class encapsulates functions related to the Sorted Stack, and the exposed methods to add items to the stack and print the stack are re-used within the Main function of the program. This is important, as the main program simply wants to add values to the SortedStack and does not need to concern itself with how those values are added and sorted. This structure simplifies the main program, and makes it easier for us to make changes in the future should we wish to adjust the data structure used. The attached UML diagram shows the relevant methods from the framework used within this program and how the classes interact.

## Running Instructions
This program includes 2 files as part of the SortedStackImp Package: Main and SortedStack. This program implements a simple class for a Sorted Stack that prompts the user to add integer values to the stack and adds those values in the correct place in the stack. Please note that this program requires java 8 or above in order to take advantage of the default ```.sort()``` method within the Stack class. The program can be run from the command line using the following commands.:

**To compile:**
From the parent directory of SortedStackImp run the command: 
```
javac -d . SortedStackImp\Main.java
```

**To run:**
From the parent directory of SortedStackImp run the command: 
```
java SortedStackImp.Main
```

## Documentation
Javadoc html files are included for each class under SortedStackImp/javadoc/SortedStackImp, or can be generated from the parent directory using the command:
```
javadoc -d SortedStackImp\javadoc SortedStackImp
```

## Examples/Tests
Run the program and enter the following inputs to see the sorted stack output.
```
Input: 10
Resulting Stack: [10]
Input: 12
Resulting Stack: [10,12]
Input: 5
Resulting Stack: [5,10,12]
Input: 5
Resulting Stack: [5,5,10,12]
```
