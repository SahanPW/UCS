package PKG;
import PKG.Area;
import java.util.Scanner;
import java.lang.Math;

public class AreaConvert {
    PKG.Area Obj1=new PKG.Area();
    Scanner sc=new Scanner(System.in);
    String Option1,Option2;
    double input,output;
    int sub_menu;
    char A; 
    
    String units[]={"# Square Milimeter        :- 'mm²'         ",
                    "# Square Centimeter       :- 'cm²'         ",
                    "# Squara Meter            :- 'm²'          ",
                    "# Square Kilometer        :- 'km²'         ",
                    "# Square Inch             :- 'in²'         ",
                    "# Square Foot             :- 'ft²'         "
                    };
    
                   
    void display()
    {
        
        System.out.println(" >> When the program asks which unit the value you enter belongs to , You should enter as below. <<");
        for(int i=0;i<6;i++)
        {
            System.out.println(units[i]);
        }
    }
    
    public void details()
    {
        do {
        System.out.println("    ---<    AREA CONVERTER (AC)   >---    ");
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Area Converter.");
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
                        System.out.println("             --<    Normal Area Converter.   >--           ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Area to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your  value                                            : ");
                        input=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your Value ( in Simple letter )           : ");
                        Option1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in Simple letter )  : ");
                        Option2=sc.next();
                        System.out.println();
                        switch (Option1) {
                            case "mm":
                                  Obj1.Cal1(Option2,input,output);
                                break;
                            case "cm":
                                  Obj1.Cal2(Option2,input,output);
                                break;
                            
                            case "m":
                                  Obj1.Cal3(Option2,input,output);
                                break;
                            case "km":
                                  Obj1.Cal4(Option2,input,output);
                                break;    
                            case "inch":
                                  Obj1.Cal5(Option2,input,output);
                                break;
                            case "foot":
                                  Obj1.Cal6(Option2,input,output);
                                break;
                            

                    
    
                            default:
                                    System.out.println(">> Error...! , Invalid Units.");
                                break;
        }
                        System.out.print(">> Do you want to convert anothe value ? (Y/N) : ");
                        A=sc.next().charAt(0);

                    }
                    while(A=='Y' || A=='y');
                    
                break;
            case 2:
                    System.out.println(">> You Exit this Programe");
                break;
            default:
                    System.out.println(">> Error...!! , Enter valid opion.");
                break;
            }

            System.out.print(">> Do you want to go main menu ? (Y/N) : ");
            A=sc.next().charAt(0);

        } 
        while ( A == 'Y' || A == 'y');
        
     
    }
    
}