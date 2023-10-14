package PKG;
import PKG.VC;
import java.util.Scanner;
import java.lang.Math;
public class VolumeConverter {
    PKG.VC V=new PKG.VC();
    Scanner sc=new Scanner(System.in);
    String units[]={"# Cubic Milimeters   :- 'MM' ",
                    "# Cubic Centimeters  :- 'CM' ",
                    "# Cubic Inches       :- 'IN' ",
                    "# Cubic Foot         :- 'F' ",
                    "# Cubic Meter        :- 'M' "};
    String vc1,vc2;
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
        System.out.println("    ---<    VOLUME CONVERTER (VC)   >---    ");
        System.out.println("_________________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Volume Converter.");
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
                        System.out.println("             --<    Normal Volume Converter.   >--           ");
                        System.out.println("        ____________________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Volume to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your value                                                : ");
                        input_value=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your value ( in capital letter )          : ");
                        vc1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in capital letter )  : ");
                        vc2=sc.next();
                        System.out.println();

                        switch (vc1) {
                            case "MM":
                                    V.V1(vc2,input_value,output_value);
                                break;
                            case "CM":
                                    V.V2(vc2,input_value,output_value);
                                break;
                            case "IN":
                                    V.V3(vc2,input_value,output_value);
                                break;
                            case "F":
                                    V.V4(vc2,input_value,output_value);
                                break;
                            case "M":
                                    V.V5(vc2,input_value,output_value);
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

