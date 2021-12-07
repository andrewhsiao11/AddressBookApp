# Java Address Book Project

In this project, you will be creating an address book that can store information about people.

## Overall Goals
The application should be able to do the following:

 - Present the user with a list of options to interact with the database and take in their input
 - Allow the user to perform the following actions:
	 - Add an entry
	 - Remove and entry
	 - Search for a specific entry
	 - Print the contents of the address book
	 - Delete the contents of the address book
	 - Quit the program
 - 
## Entry Structure
Entries should be contained in a class. Each entry should contain the following properties:
 - First name
 - Last name
 - Phone number
 - Email address
All variables should be private and only accessible via getter and setter methods.

You should override the toString() method so that the entries can be printed in an easy-to-read-manner.

You can create other methods as you see fit.

## Address Book Structure
The address book should contain an ArrayList of Entry instances. This ArrayList can be accessed and modified using methods that accomplish the following:

 - Adding entries
	 - New entries should contain all of the properties required by an entry. The email address needs to be unique. Other properties do not need to be unique.
 - Remove an entry
	 - An entry can be removed by searching the database for an email address and then removing the entry with that unique email addres.
 - Search for an entry
	 - Users can pick which methods they will search by (first name, last name, phone number, or email address). The program will then take in a search query and search the address book for an entry that contains the search as a substring (e.g. if a first name search is conducted with 'a,' all entries that have a first name starting with 'a' will be returned).
 - Printing the address book
	 - All of the entries will be printed out
 - Deleting the book
	 - The address book will be cleared
 - Quit
	 - The program will stop running

## Program Functionality

### Starting the Program
Upon starting the program, it should as the user what action they want to perform.

    1) Add an entry

    2) Remove an entry
    
    3) Search for a specific entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
      
    Please choose what you'd like to do with the database:
The user must enter a number 1-6. If the user enters invalid input, print an error message and show the main menu again to take in a new input.

### Adding an Entry
If the user inputs 1, they should be asked to enter the details of an entry. This entry is then added to the address book.

    1) Add an entry
    
    2) Remove an entry
    
    3) Search for a specific entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 1
    
    First Name: Test
    
    Last Name: Test
    
    Phone Number: 1111111111
    
    Email Address: test@test.com
    
    Added new entry!
After the entry has been added, show the main menu again to take in a new input.

You can assume the user input will not contain any spaces, tabs, or newline character. You can assume the user will format their information correctly (e.g. you do not need to check for the correct amount of numbers in a phone number, if a phone number is all numbers, or if an email contains an @ sign or period.)

### Remove an Entry
As the user to input an email to delete, and the delete that entry from the address book. Print out the entry that was deleted. If the entry was not found, notify the user. Then, show the main menu again to take in a new input.

    Please choose what you'd like to do with the database: 2
    
    Enter an entry's email to remove: test@test.com
    
    Deleted the following entry:
      
    ************
    First Name: Test
    Last Name: Test
    Phone Number: 1111111111
    Email: test@test.com
    ************
### Search for a Specific Entry
Show a user the list of options to search by. Once they select their search paramter, prompt them to enter their search query. If their search option is invalid (e.g. not a number 1-4, alert them and bring back the main menu to take in a new input). If their search option is valid, search the database and print all matching entries. If there is nothing found, alert the user. Then, show the main menu again to take in a new input.

    Please choose what you'd like to do with the database: 3
    
    1) First Name
    
    2) Last Name
    
    3) Phone Number
    
    4) Email Adress
    
    Chose a search type: 2
    
    Enter your search: Te
    
    ************
    First Name: Test
    Last Name: Test
    Phone Number: 1111111111
    Email: test@test.com
    ************
### Print Addres Book
Print all of the entries in the address book. If the address book is empty, notify the user. Then, show the main menu again to take in a new input.

    Please choose what you'd like to do with the database: 4
    
    ************
    First Name: Test
    Last Name: Test
    Phone Number: 1111111111
    Email: test@test.com
    ************  
    
    ************
    First Name: Test2
    Last Name: Test2
    Phone Number: Test2
    Email: test2@test.com
    ************

### Delete Book
Clear the address book and notify the user that is was cleared.

    Please choose what you'd like to do with the database: 5
    
    Address book cleared!
### Quit
Stop the application from running

## Sample Input/Output
The following section shows sample inputs and outputs in order. Your program should have the same output (the exact printing style does not need to be the same, but the results should be).

    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 1
    
    First Name: Test
    
    Last Name: Test
    
    Phone Number: 1111111111
    
    Email Address: test@test.com
    
    Added new entry!
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 1
    
    First Name: Test2
    
    Last Name: Test2
    
    Phone Number: 2222222222
    
    Email Address: test2@test2.com
    
    Added new entry!
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 3
    
    1) First Name
    
    2) Last Name
    
    3) Phone Number
    
    4) Email Adress
    
    Chose a search type: 1
    
    Enter your search: T
    
    ************
    First Name: Test
    Last Name: Test
    Phone Number: 1111111111
    Email: test@test.com
    ************
    
    ************
    First Name: Test2
    Last Name: Test2
    Phone Number: 2222222222
    Email: test2@test2.com
    ************
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 1
    
    First Name: asdf
    
    Last Name: asdf
    
    Phone Number: 3213213211
    
    Email Address: asdf@asdf.com
    
    Added new entry!
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit 
    
    Please choose what you'd like to do with the database: 3 
    
    1) First Name
    
    2) Last Name
    
    3) Phone Number
    
    4) Email Adress
    
    Chose a search type: a
    
    Invalid search option.  
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 2
    
    Enter an entry's email to remove: doesnotexist@test.com  
    
    Entry not found!
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 2
    
    Enter an entry's email to remove: test@test.com
    
    Deleted the following entry:
    
    ************
    First Name: Test
    Last Name: Test
    Phone Number: 1111111111
    Email: test@test.com
    ************
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 4
    
    ************
    First Name: Test2
    Last Name: Test2
    Phone Number: 2222222222
    Email: test2@test2.com
    ************
    
    ************
    First Name: asdf
    Last Name: asdf
    Phone Number: 3213213211
    Email: asdf@asdf.com
    ************
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 2
    
    Enter an entry's email to remove: asdf@asdf.com
    
    Deleted the following entry:
    
    ************
    First Name: asdf
    Last Name: asdf
    Phone Number: 3213213211
    Email: asdf@asdf.com
    ************
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 4
    
    ************
    First Name: Test2
    Last Name: Test2
    Phone Number: 2222222222
    Email: test2@test2.com
    ************
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 3
    
    1) First Name
    
    2) Last Name
    
    3) Phone Number
    
    4) Email Adress
    
    Chose a search type: 2
    
    Enter your search: G
    
    No results found!
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit 
    
    Please choose what you'd like to do with the database: 2
    
    Enter an entry's email to remove: test2@test2.com
    
    Deleted the following entry:
    
    ************
    First Name: Test2
    Last Name: Test2
    Phone Number: 2222222222
    Email: test2@test2.com
    ************
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 4
    
    Address Book is empty! 
    
    1) Add an Entry
    
    2) Remove an Entry
    
    3) Search for a Specific Entry
    
    4) Print Address Book
    
    5) Delete Book
    
    6) Quit
    
    Please choose what you'd like to do with the database: 6

## Optional
If you have extra time, try to implement the following features!

 - Make input parameter checks stricter (check for valid phone number format, valid email format)
 - Save address book to a file
 - Load address book from a file

