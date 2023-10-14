package PKG;
import PKG.TC;
import java.util.Scanner;
import java.lang.Math;
public class TemperatureConverter {
    PKG.TC T=new PKG.TC();
    Scanner sc=new Scanner(System.in);
    String units[]={"# Celsius    :- 'C' ","# Fahrenheit :- 'F' ","# Kelvin     :- 'K' ","# Rankine    :- 'R' "};
    String tc1,tc2;
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
        System.out.println("    ---<    TEMPERATURE CONVERTER (TC)   >---    ");
        System.out.println("_________________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Temperature Converter.");
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
                        System.out.println("             --<    Normal Temperature Converter.   >--           ");
                        System.out.println("        ____________________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Temperature to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your value                                                : ");
                        input_value=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your value ( in capital letter )          : ");
                        tc1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in capital letter )  : ");
                        tc2=sc.next();
                        System.out.println();
                        switch (tc1) {
                            case "C":
                                    T.T1(tc2,input_value,output_value);
                                break;
                            case "F":
                                    T.T1(tc2,input_value,output_value);
                                break;
                            case "K":
                                    T.T1(tc2,input_value,output_value);
                                break;
                            case "R":
                                    T.T1(tc2,input_value,output_value);
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

