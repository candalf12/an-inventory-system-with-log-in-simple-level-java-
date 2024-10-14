import java.util.Scanner;
public class lab3_Q3 {
    public static void main(String[] args) {
        Scanner in= new Scanner(System.in);
        System.out.print("Enter your username: ");
        String username= in.nextLine();
        String itemList = "Item104:Laptop Item125:Monitor ";
        String itemIdList = "104, 125";
        if (!username.equals("manager"))
        {
            System.out.println("Username not found! Goodbye!");
        }
        else
        {
            System.out.print("Enter your password: ");
            String password = in.nextLine();
            if (!password.equals("archive"))
            {
                System.out.println("Incorrect password! Goodbye!");     
            }
            else
            {
                System.out.printf("1- Add customer\n2- Delete Customer\n3- Add item\n4- Delete item\n5- Logout\nSelect an operation: ");
                int operationNumber = in.nextInt();
                in.nextLine();
                String customerList = "PrimeTech, Peak, EcoGoods ";


                if (operationNumber == 1)
                {
                    System.out.println("-- Add Customer --");
                    System.out.print("Enter customer name: ");
                    String customerNameToBeAdded = in.nextLine().trim();
                    if (customerList.contains(customerNameToBeAdded))
                    {
                        System.out.println("This customer is already in your list.");
                    }
                    else
                    {
                        customerList += ", ";
                        customerList += customerNameToBeAdded;
                        System.out.println("New customer "+ customerNameToBeAdded+ " is added to the list");
                        System.out.println("Your customers: " +customerList);
                    }
                }
                if (operationNumber ==2)
                {
                    System.out.println("-- Remove Customer --");
                    System.out.print("Enter customer name you want to delete: ");
                    String customerNameToBeDeleted = in.nextLine().trim();
                    if (customerList.contains(customerNameToBeDeleted))
                    {
                        customerList = customerList.replaceAll(customerNameToBeDeleted, "").trim();
                        System.out.println(customerNameToBeDeleted+ "is deleted succesfully from customers");
                        System.out.println("Your customers: "+ customerList);
                    }
                    else
                    {
                        System.out.println("You don't have any customer whose name is "+ customerNameToBeDeleted);
                    }
                }
                if (operationNumber == 3)
                {
                    System.out.println("-- Add Item--");
                    System.out.print("Enter an item to be added to the list: ");
                    String itemAddedToTheList = in.nextLine();
                    int newItemId= (int)(Math.random() * 1000);
                    if (itemList.contains(Integer.toString(newItemId)))
                    {
                        System.out.println("There is an item with the id " +newItemId+", you cannot add a new item with the same id");
                    }
                    else
                    {
                        itemIdList += newItemId + ", ";
                        itemList += "Item"+ newItemId+ ":"+ itemAddedToTheList;
                        System.out.println("New item with "+ newItemId + " id is added");
                    }
                    System.out.println("Your items: "+itemList );
                 }
                 if (operationNumber == 4)
                 {
                    
                    System.out.println("-- Delete Item--");
                    System.out.print("Enter itemId which you want to delete: ");
                    int itemIdToBeDeleted = in.nextInt();
                    System.out.println();
                    if ( !itemList.contains( String.valueOf(itemIdToBeDeleted)))
                    {
                        System.out.printf("You don't have any item with the id %d", itemIdToBeDeleted);
                    }
                    else
                    {
                        int beginninIndexOfDeletedPost = itemList.indexOf( String.valueOf(itemIdToBeDeleted ))-4;
                        int endIndexOfDeletedPost = itemList.indexOf(" ", (beginninIndexOfDeletedPost))+1;
                        itemList = itemList.replace(itemList.substring(beginninIndexOfDeletedPost, endIndexOfDeletedPost), "");
                        System.out.printf("The item with the id %s is deleted succesfully\n", itemIdToBeDeleted);
                        System.out.printf("Your items: " + itemList);



                    }

                 }
                 if(operationNumber ==5)
                 System.out.println("Logged out succesfully. ");
            }
        }


    }
    
}
