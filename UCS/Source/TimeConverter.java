package PKG;
import PKG.Time;
import java.util.Scanner;
import java.lang.Math;
public class TimeConverter {
    PKG.Time Obj1=new PKG.Time();
    Scanner sc=new Scanner(System.in);
    String Option1,Option2;
    double input,output;
    int sub_menu;
    char A;
    
    String units[]={"# Years         :- 'year'          ",
                    "# Months        :- 'month'         ",
                    "# Weeks         :- 'week'          ",
                    "# Days          :- 'day'           ",
                    "# Hours         :- 'hour'          ",
                    "# Minutes       :- 'minute'        ",
                    "# Second        :- 'second'        ",
                    "# Milliseconds  :- 'millisecond'   "};
                   
    void display()
    {
        
        System.out.println(" >> When the program asks which unit the value you enter belongs to , You should enter as below. <<");
        for(int i=0;i<8;i++)
        {
            System.out.println(units[i]);
        }
    }
    
    public void details()
    {
        do {
        System.out.println("    ---<    TIME CONVERTER (MC)   >---    ");
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal TIME Converter.");
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
                        System.out.println("             --<    Normal Time Converter.   >--           ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Time to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your Time                                                 : ");
                        input=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your time ( in simple letter )           : ");
                        Option1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in simple letter )  : ");
                        Option2=sc.next();
                        System.out.println();
                        switch (Option1) {
                            case "year":
                                  Obj1.Cal1(Option2,input,output);
                                break;
                            case "month":
                                  Obj1.Cal2(Option2,input,output);
                                break;
                            case "week":
                                  Obj1.Cal3(Option2,input,output);
                                break;
                            case "day":
                                  Obj1.Cal4(Option2,input,output);
                                break;
                            case "hour":
                                  Obj1.Cal5(Option2,input,output);
                                break;    
                            case "minute":
                                  Obj1.Cal6(Option2,input,output);
                                break;
                            case "second":
                                  Obj1.Cal7(Option2,input,output);
                                break;
                            case "millisecond":
                                  Obj1.Cal8(Option2,input,output);
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
