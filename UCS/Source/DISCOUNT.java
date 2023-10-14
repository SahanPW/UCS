 package PKG;
 import java.util.Scanner;
 public class DISCOUNT
 {

        Scanner sc=new Scanner(System.in);

        double Or_price;
        double Discount,Dis_Amount,Fi_price; 
        char Option,END;
        int sub_menu;

        public void Details()
        {
        
        do{

                    System.out.println("    ---<    DISCOUNT MAKER    >---    ");
                    System.out.println("____________________________________________");
                    System.out.println();
                    System.out.println(">> Choice Board.");
                    System.out.println("    01.Normal  Discount Maker.");
                    System.out.println("    02.Exit.");
                    System.out.println();
                    System.out.print("# Express your Option (1 or 2): ");
                    sub_menu=sc.nextInt();
                    System.out.println("____________________________________________");
                    System.out.println();   

        
        switch (sub_menu) {
            case 1:
                    do
                    {
                        System.out.println("            --<    Normal Discount Maker.   >--          ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can find Discount <<");
                        System.out.println();
                        System.out.print("> Enter the Original Price       : Rs. ");
                        Or_price=sc.nextDouble();
                        System.out.print("> Enter the Discount(% off)      : ");
                        Discount=sc.nextDouble();
                        Dis_Amount=(Or_price*Discount)/100;
                        Fi_price=Or_price-Dis_Amount;
                        System.out.println("> Discount Amount                : Rs."+Dis_Amount);
                        System.out.println("> Final Price                    : Rs."+Fi_price);
                        System.out.println();
                    
                        System.out.print(">> Do you want to find anothe price ? (Y/N) : ");
                        Option=sc.next().charAt(0);

                    }while(Option=='Y' || Option=='y');
                    
                break;
            case 2:
                    System.out.println(">> You Exit this Programe");
                break;
            default:
                    System.out.println(">> Error...!! , Enter valid opion.");
                break;
            }

            System.out.print(">> Do you want to go main menu ? (Y/N) : ");
            END=sc.next().charAt(0);
        } while (END == 'Y' || END == 'y');
        }
 }