# DS-Project
Phone Book 
Phone Book is created by using Java and Java swing libraries. It is developed by using intellij and Netbeans IDE. It was created by Muhammad Salman Tanveer, Muhammad Farzand, Farhan.
  Description
Phone Book will allow you to insert , search and delete contact numbers. It will take names and numbers initially and store in it and then the user can search or delete existing contact by using appropriate methods.It will also show you data of the stored number if required to user.
  APPLICATION WORKING:
This application is created for users to store their contacts.This application contains a window consisting of a table,  search portion , insert portion and delete portion. Initially you will enter a name and number and it will save in the application. If any number is wrong or the user wants to remove it then it will be deleted and there is also an option of search which enables searching of numbers.
JTABLE:
Here we have created JTable by having 2 labelled columns as “Name” and  “Number” which are Linkedlist and Arraylist  in data structure . 
WORKING OF INSERT METHOD:
Insert() Method will take the given name which is passed from HasName() to avoid duplication of names. After that we would move using two nodes cur and prev as cur is always one ahead of prev this and we will check when user input is greater then prev and less than cur and we will insert user name between prev and cur node thus allowing us to sort the list as well as inserting.

LinkedList & Arraylist :
We have used linkedlist in this as data structure to perform effectively. In this regard we have created multiple methods. Firstly , we have created a HasName() method which will check whether the name is in the list or not . If the name is present then it will return true otherwise false . Secondly, Insert() method that will input value by using 2 nodes cur and prev . We also have a method InsertAtIndex that will give the index of the stored value . Thirdly , we have the Delete() method  that will delete the nodes as per requirement . There are multiple methods like GetIndexByValue() , GetTotal() and GetValue().


File Handling:
In file handling task we have used two linked lists in writing as well as in reading in the first linked list we have stored names and in the other linked list we have stored numbers corresponding to their names, a colon is used to separate the names from numbers while writing and while reading from the file that colon is ignored. File writer method is used to save data from the two linked lists into the file and for retrieving the data Scanner is used.
INSTALLATION GUIDE
In order to install this application, all you need to do is click on the "Phonebook.exe" and the application will be executed .
REQUIREMENTS FOR INSTALLATION
JRE (Java Runtime Environment)
SUPPORTED OPERATING SYSTEM
WINDOWS & LINUX
MAKING OF .EXE FILE:
(For intellij users)
1- Go to File -> click Project structure 2- Find artifact on the left side of the Project structure. 3- click the plus(+) sign -> jar -> from modules with dependencies 4- Inside the main class section, upload your main class here -> click ok. 5- click apply -> turn on the (include in project build) bullet -> again click apply -> click ok. 6- from the menu bar -> build -> build artifact -> build. (EXE file is successfully build inside artifact folder which is inside out folder of your project) 7- if you made any changes in your project, you can add those changes in your exe file by; clicking again on build -> build artifact -> rebuild.
HOW TO FIND SOURCE CODE
Select folder: Phone Book --> src --> code--> Main.java

VIDEO LINK
https://youtu.be/bEMR_G8JDt8



