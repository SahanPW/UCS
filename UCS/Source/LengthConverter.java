package PKG;
import PKG.LC.*;
import java.util.Scanner;
import java.lang.Math;
public class LengthConverter {
    
    PKG.LC L=new PKG.LC();
    Scanner sc=new Scanner(System.in);
    String units[]={"# Mili meter  :- 'mm' ","# Centi meter :- 'cm' ","# Inches      :- 'in' ","# Feet        :- 'ft' ","# Meter       :- 'm'  ","# Kilo meter  :- 'km' ","# Miles       :- 'mi' "};
    String M1,M2;
    double input_value,output_value;
    int sub_menu;
    int i;
    double num[];
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
        System.out.println("    ---<    LENGTH CONVERTER (LC)   >---    ");
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Length Converter.");
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
                        System.out.println("            --<    Normal Length Converter.   >--          ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any length to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your value                                                : ");
                        input_value=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your value ( in simple letter )          : ");
                        M1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in simple letter )  : ");
                        M2=sc.next();
                        System.out.println();
                        switch (M1) {
                            case "mm":
                                    L.L1(M2,input_value,output_value);
                                break;
                            case "cm":
                                    L.L2(M2,input_value,output_value);
                                break;
                            case "in":
                                    L.L3(M2,input_value,output_value);
                                break;
                            case "ft":
                                    L.L4(M2,input_value,output_value);
                                break;
                            case "m":
                                    L.L5(M2,input_value,output_value);
                                break;
                            case "km":
                                    L.L6(M2,input_value,output_value);
                                break;
                            case "mi":
                                    L.L7(M2,input_value,output_value);
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

