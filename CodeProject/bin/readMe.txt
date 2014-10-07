Author: Sabina Ravindran Naranpurath
SalesTaxImpl.java is the main class from which the project needs to be run.

Assumptions: 
------------
* User needs to input the number of items he needs to add to the list 
* The user needs to input the following fields manually
  a) Item name (only text)
  b) Price (only floating values)
  c) Whether the item is imported or not (only y/n)
  d) Whether the item is of any of the category book(b) medicine(m) food(f) others(o) (characters b/m/f allowed. Anything other than that will be considered as o) 
  e) Quantity (integer value)
 We assume that data that is entered is defined the method described as above
* Currently only four categories are present Book, Medicine, Food and Others
 
 Description:
 ------------
* An object Order is created when the main function is called. Order object creates a list of orderItems as an ArrayList. 
  This object contains variables for totalSalesTax and totalOrderPrice which is updated whenever an OrderItem is added.
* When user inputs data for each Order item, an object is of type OrderItem is created which sets the Item details and quantity.  
* OrderItem also contains values which stores the tax on the item and price after tax. The tax of the item is calculated here. 
  This OrderItem is added to the Order List.
* Item object contains ItemName, price, itemSource and category.
* ItemSource is an enum with two values of importSource and domestic. In case this list is added we can scope for that.
* Category is an abstract class which stores the category name and a boolean method which defines whether the category is taxable or not.
  Based on the category that the user input the corresponding concrete category is created. Like if 'b' is entered for book, the BookCategory object is created.
* Currently there are four classes that extend Category.java - BookCategory.java, MedicineCategory.java, FoodCategory.java and OtherCategory.java
* Helper.java has helper methods to round double values up to 2 decimal digits
 
 File Structure:
 ---------------
 com.test.proj.datamodel
 - BookCategory.java
 - Category.java
 - FoodCategory.java
 - Item.java
 - ItemSource.java
 - MedicineCategory.java
 - Order.java
 - OrderItem.java
 - OtherCategory.java
 
 com.test.proj.helper
 - Helper.java
 
 com.test.proj.main
 - SalesTaxImpl.java
 
 

 