# Employee-Inhertitance
Implementing classes and creating exceptions for error handling

## Employee Class
Design a class named _Employee_. Including the following fields:
  - Employee Name
  - Employe number in the format XXX-L, where each X is a digit within the range of 0-9, and the L is a letter within the range A-M
  - Hire date (using Date Class)
    
## ProductionWorker Class
Design a class named _ProductionWorker_ that inherits from _Employee_. Including the following fields:
  - Shift (an integer)
  - Hourly Pay Rate (a double)

## ShiftSupervisor Class
Design a class name _ShiftSupervisor_ that inherits from _Employee_. Including the following fields:
  - Annual salary
  - Annual production bonus
  
## TeamLeader Class
Design a class name _TeamLeader_  that inherits from _ProductionWorker_. Including the following fields:
  - Monthly bonus amount
  - Required number of training hours
  - Number of training hours attended
  
## Exceptions
Throw exceptions for the following errors:
  - The _Employee_ class should throw an exception named _InvalidEmployeeNumber_ when it recieves an employee number that is less than 0 or is greater than 999
  - The _ProductionWorker_ class should throw an exception named _InvalidShift_ when it recieves an invalid shift
  - The _ProductionWorker_ class should throw an exception named _InvalidPayRate_ when it recieves a negative number for the hourly pay rate
     
