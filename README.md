## Problem Scenario

The NEU Library offers a variety of resource, including books, theses, capstones, internet access, journals, and newspapers.

Currently, the Student object has methods like borrowBook(), borrowJournal() with a parameter of title, which directly depend on specific resource types.

To adhere to the Dependency Inversion Principle (DIP) and ensure flexibility for future changes (such as introducing audio books or e-journals), we need to refactor the program while maintaining SOLID principles. The goal is to create a robust system that can seamlessly accommodate new resource types in the future.

Your solution should not violate other SOLID principles.

Make sure you have a TestProgram that will validate the proposed refactored codes.

## Class Diagram
![Solid Design Principles V2](https://github.com/RonanSoriano/SOLIDwithDesignPattern/assets/142371669/d8b49580-47b6-4691-8e4c-260212f7a212)
