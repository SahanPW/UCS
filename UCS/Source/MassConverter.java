package PKG;
import PKG.MC.*;
import java.util.Scanner;
import java.lang.Math;
public class MassConverter {
    PKG.MC M=new PKG.MC();
    Scanner sc=new Scanner(System.in);
    String units[]={"# Micro gram :- 'mi' ","# Mili gram  :- 'mg' ","# Gram       :- 'g'  ","# Kilo gram  :- 'kg' ","# Tonne      :- 't'  ","# Pound      :- 'lb' ","# Carat      :- 'ct' "};
    String L1,L2;
    double input_value,output_value;
    int sub_menu;
    int i;
    char end,sym;
    int Usize=units.length;
    void display()
    {
        
        System.out.println(" >> When the program asks which unit the value you enter belongs to , You should enter as below. <<");
        for(i=0;i<Usize;i++)
        {
            System.out.println(units[i]);
        }
    }
    
    public void details()
    {
        do {
        System.out.println("    ---<    MASS CONVERTER (MC)   >---    ");
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Mass Converter.");
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
                        System.out.println("             --<    Normal Mass Converter.   >--           ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Mass to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your value                                                : ");
                        input_value=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your value ( in simple letter )          : ");
                        L1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in simple letter )  : ");
                        L2=sc.next();
                        System.out.println();
                        switch (L1) {
                            case "mi":
                                    M.M1(L2,input_value,output_value);
                                break;
                            case "mg":
                                    M.M2(L2,input_value,output_value);
                                break;
                            case "g":
                                    M.M3(L2,input_value,output_value);
                                break;
                            case "kg":
                                    M.M4(L2,input_value,output_value);
                                break;
                            case "t":
                                    M.M5(L2,input_value,output_value);
                                break;
                            case "lb":
                                    M.M6(L2,input_value,output_value);
                                break;
                            case "ct":
                                    M.M7(L2,input_value,output_value);
                                break;
        
                            default:
                                    System.out.println(">> Error...! , Invalid Units.");
                                break;
        }
                        System.out.print(">> Do you want to convert anothe value ? (Y/N) : ");
                        end=sc.next().charAt(0);

                    }while(end=='Y' || end=='y');
                    
                break;
            case 2:
                    System.out.println(">> You Exit this Programe");
                break;
            default:
                    System.out.println(">> Error...!! , Enter valid opion.");
                break;
            }

            System.out.print(">> Do you want to go main menu ? (Y/N) : ");
            end=sc.next().charAt(0);
        } while (end == 'Y' || end == 'y');
        
     
    }
    
}

