package PKG;
import PKG.Speed;
import java.util.Scanner;
import java.lang.Math;
public class SpeedConverter {
    
    PKG.Speed Obj1=new PKG.Speed();
    Scanner sc=new Scanner(System.in);
    String units[]={"# Meter per second         :- 'ms' ",
                    "# Kilometer per hour       :- 'kmh'",
                    "# Kilometer per second     :- 'kms'",
                    "# Foot per second          :- 'fps'",
                    "# Inch per second          :- 'ips'"};
    String Option1,Option2;
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
        System.out.println("    ---<    SPEED CONVERTER (SC)   >---    ");
        System.out.println("____________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal Speed Converter.");
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
                        System.out.println("            --<    Normal Speed Converter.   >--          ");
                        System.out.println("      _______________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can convert any Speed to any unit you want <<");
                        display();
                        System.out.println();
                        System.out.print("> Enter Your value                                                : ");
                        input_value=sc.nextDouble();
                        System.out.print("> Enter Unit notation of Your value ( in simple letter )          : ");
                        Option1=sc.next();
                        System.out.print("> Enter Unit notation , You want to convert ( in simple letter )  : ");
                        Option2=sc.next();
                        System.out.println();
                        switch (Option1) {
                            case "ms":
                                    Obj1.Cal1(Option2,input_value,output_value);
                                break;
                            case "kmh":
                                    Obj1.Cal2(Option2,input_value,output_value);
                                break;
                            case "kms":
                                    Obj1.Cal3(Option2,input_value,output_value);
                                break;
                            case "fps":
                                    Obj1.Cal4(Option2,input_value,output_value);
                                break;
                            case "ips":
                                    Obj1.Cal5(Option2,input_value,output_value);
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


