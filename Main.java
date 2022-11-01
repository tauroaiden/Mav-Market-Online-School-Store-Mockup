import java.text.DecimalFormat;
import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        DecimalFormat d = new DecimalFormat("#,###.##");
        Scanner scan = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        String d1, d2, d3, d4, d5, d6, d7, d8, d9, d10, d11, d12, d13, d14, d15, d16;
        int count;
        double cartTotal, fTotal;
        System.out.println("Welcome to the Maverick Market!");
        System.out.println("When purchasing items, make sure to type in exact name of items");
        System.out.println("Are you ready to begin shopping?");
        d1 = scan.nextLine(); //user inputs if they would like to shop or not
        while(d1.equalsIgnoreCase("yes")){
            System.out.println("There are three departments to shop from: merchandise, supplies, and tickets");
            System.out.println("Which would you like to choose from?");
            d2 = scan.nextLine(); //user inputs which department they would like to shop at
            if(d2.equalsIgnoreCase("merchandise")){
                System.out.println("The Maverick Market offers: \nt-shirts\nshirts\nshorts\nsweatshirts\npants");
                System.out.println("Of the following, which would you like to add to your cart?");
                d3 = scan.nextLine();//user inputs which type of merchandise they would like to choose from
                if(d3.equalsIgnoreCase("t-shirts")){
                    System.out.println("Currently, we are selling two types of t-shirts:\nOrange Crush ($17.50)\nBlue Mav Tee($14.25)\nWhich would you like?");
                    d4 = scan.nextLine();//user inputs which type of t-shirt they would like
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs how many of selected t-shirt they would like
                    cart.buyMerchItem(d4,count);
                    System.out.println("The " + d4 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d3.equalsIgnoreCase("shirts")){
                    System.out.println("Currently, we are selling three types of long sleeve shirts:\nBlue Sleeve ($20.75)\nOrange Fog Sleeve ($18.50)\nBlack Sleeve ($20.75)\nWhich would you like?");
                    d5 = scan.nextLine();//user inputs what type of shirt they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs how many shirts they would like to purchase
                    cart.buyMerchItem(d5,count);
                    System.out.println("The " + d5 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d3.equalsIgnoreCase("shorts")){
                    System.out.println("Currently, we are selling two types of shorts:\nBlue Aeros ($16.25)\nSplit Orange Crush ($18.25)\nWhich would you like?");
                    d6 = scan.nextLine();//user inputs what type of shorts they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user input show many shorts they would like to purchase
                    cart.buyMerchItem(d6,count);
                    System.out.println("The " + d6 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d3.equalsIgnoreCase("sweatshirts")){
                    System.out.println("Currently, we are selling two types of sweatshirts:\nMonogrammed Marvin Perch ($32.50)\nBlue Marvin Genero ($24.75)\nWhich would you like?");
                    d7 = scan.nextLine();//user inputs what type of sweatshirt they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs how many sweatshirts they would like to purchase
                    cart.buyMerchItem(d7,count);
                    System.out.println("The " + d7 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d3.equalsIgnoreCase("pants")){
                    System.out.println("Currently, we are selling five types of pants: \nMarvin Joggers ($27.50)\nZip-Up Joggers ($29.75)\nOrange Crush Sweatpants ($21.25)\nBlue JJ Sweatpants ($23.25)\nMarvin Black Tights ($18.75)\nWhich would you like?");
                    d8 = scan.nextLine();//user inputs what type of pants they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs how many pants they would like to purchase
                    cart.buyMerchItem(d8,count);
                    System.out.println("The " + d8 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
            }
            else if(d2.equalsIgnoreCase("supplies")){
                System.out.println("The Maverick Market offers: \nPencils\nPens\nMarkers\nFolders\nBinders\nNotebooks");
                System.out.println("Of the following, which would you like to add to your cart?");
                d9 = scan.nextLine();//user inputs what type of school supply they would like to purchase
                if(d9.equalsIgnoreCase("Pencils")){
                    System.out.println("Pencils come in: \nPack of 12 Pencils($4.99)\nPack of 24 Pencils($7.99)\nWhich option would you like?");
                    d10 = scan.nextLine();//user inputs what option of pencils they would like
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs desired pencil quantity
                    cart.buySupplyItem(d10,count);
                    System.out.println("The " + d10 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d9.equalsIgnoreCase("Pens")){
                    System.out.println("Pens come in: \nPack of 10 Pens($8.75)\nPack of 30 Pens($12.25)\nWhich would you like?");
                    d11 = scan.nextLine();//user inputs what pen option they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs desired pen quantity
                    cart.buySupplyItem(d11,count);
                    System.out.println("The " + d11 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d9.equalsIgnoreCase("Markers")){
                    System.out.println("Markers come in: \nPack of 12 Markers($8.85)\nPack of 24 Markers($14.25)\nWhich would you like?");
                    d12 = scan.nextLine();//user inputs what marker pack they would like to purchase
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user inputs how many packs they would like to purchase
                    cart.buySupplyItem(d12,count);
                    System.out.println("The " + d12 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d9.equalsIgnoreCase("Folders")){
                    System.out.println("Folders come in : \nBlue Folder ($4.99)\nRed Folder ($4.99)\nWhich would you like?");
                    d13 = scan.nextLine();//user indicates what color folder they would like
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user indicates how many folders they would like
                    cart.buySupplyItem(d13,count);
                    System.out.println("The " + d13 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d9.equalsIgnoreCase("Binders")){
                    System.out.println("Binders come in: \n1-inch Binder ($5.99)\n1.5-inch Binder ($6.49)\nWhich would you like?");
                    d14 = scan.nextLine();//user indicates what size binder they would like
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user indicates how many binders they would like
                    cart.buySupplyItem(d14,count);
                    System.out.println("The " + d14 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
                else if(d9.equalsIgnoreCase("Notebooks")){
                    System.out.println("Notebooks come in : \nBlue Notebook ($6.99)\nWhich would you like?");
                    d15 = scan.nextLine();//user indicates what color notebook they would like
                    System.out.println("How many would you like?");
                    count = scan.nextInt();//user indicates how many notebooks they would like
                    cart.buySupplyItem(d15,count);
                    System.out.println("The " + d15 + " have been added to your cart.");
                    d1 = scan.nextLine();
                    System.out.println("Would you like to continue shopping?");
                    d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
                }
            }
            else if(d2.equalsIgnoreCase("tickets")){
                System.out.println("Currently, we are selling tickets to our TEDX event: they are $12.25.\nWould you like to purchase one?");
                d16 = scan.nextLine();//user indicates if they would like to buy a ticket
                System.out.println("How many would you like?");
                count = scan.nextInt();//user indicates how many tickets they would like to purchase
                cart.buyTicket(d16,count);
                System.out.println("The TEDX tickets have been added to your cart.");
                d1 = scan.nextLine();
                System.out.println("Would you like to continue shopping?");
                d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
            }
            else{
                System.out.println("Would you like to continue shopping?");
                d1 = scan.nextLine();//user inputs whether or not they would like to continue shopping
            }
        }
        System.out.println("What US Province are you from?");
        String state = scan.nextLine();//user inputs what US province they are from in order to calculate taxes
        System.out.println("You purchased: ");
        System.out.println(cart);
        cartTotal = cart.getCartTotal();
        System.out.println("Your total at checkout will be: $" + d.format(cartTotal));
        fTotal = cart.addTax(cartTotal, state);
        System.out.println("Your total after tax will be: $" + d.format(fTotal));
    }
}
