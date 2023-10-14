import PKG.LengthConverter.*;
import PKG.MassConverter.*;
import PKG.TemperatureConverter.*;
import PKG.LengthConverter;
import PKG.TemperatureConverter;
import PKG.AreaConvert;
import PKG.BmiConvertor;
import PKG.DISCOUNT;
import PKG.SpeedConverter;
import PKG.DataConverter;
import PKG.TimeConverter;
import PKG.VolumeConverter;
import java.util.Scanner;
public class UCS {
    Scanner sc=new Scanner(System.in);
    public static void main(String args[])
    {
        PKG.LengthConverter LC=new PKG.LengthConverter();
        PKG.MassConverter MC=new PKG.MassConverter();
        PKG.TemperatureConverter TC=new PKG.TemperatureConverter();
        PKG.BmiConvertor BM=new PKG.BmiConvertor();
        PKG.DISCOUNT DI=new PKG.DISCOUNT();
        PKG.SpeedConverter SP=new PKG.SpeedConverter();
        PKG.TimeConverter TM=new PKG.TimeConverter();
        PKG.VolumeConverter VC=new PKG.VolumeConverter();
        PKG.DataConverter DC=new PKG.DataConverter();
        PKG.AreaConvert AC=new PKG.AreaConvert();
        Scanner sc=new Scanner(System.in); 
        int menu;
        char end;
        do {
        System.out.println("    ---<    UNIVERSAL CONVERTER SUITE ( UCS )   >---    ");
        System.out.println("________________________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.AREA Converter.");
        System.out.println("    02.BMI Calculator.");
        System.out.println("    03.DATA Converter.");
        System.out.println("    04.DISCOUNT Calculator.");
        System.out.println("    05.LENGTH Converter.");
        System.out.println("    06.MASS Converter.");
        System.out.println("    07.SPEED Converter.");
        System.out.println("    08.TEMPERATURE Converter.");
        System.out.println("    09.TIME Converter.");
        System.out.println("    10.VOLUME Converter.");
        System.out.println("    11.Exit.");
        System.out.println();
        System.out.print("# Express your Option (1 or 2): ");
        menu=sc.nextInt();
        System.out.println("____________________________________________");
        System.out.println();
            switch (menu) {
                case 1:
                        AC.details();
                    break;
                case 2:
                       BM.details(); 
                    break;
                case 3:
                        DC.details();
                    break;
                case 4:
                        DI.Details();;
                    break;
                case 5:
                        LC.details();
                    break;
                case 6:
                        MC.details();
                    break;
                case 7:
                        SP.details();
                    break;
                case 8:
                       TC.details();; 
                    break;
                case 9:
                        TM.details();
                    break;
                case 10:
                        VC.details();
                    break;
                case 11:
                        System.out.println(">> Thank You.... Have a Nice day..!!");
                        System.exit(0);
                    break;

                default:
                        System.out.println(">> Error...! , Invalid Units.");
                    break;
            }
            System.out.print(">> Do you want to convert anothe value ? (Y/N) : ");
            end=sc.next().charAt(0);
        } while (end=='Y' || end=='y');
        System.out.println(">> Thank You.... Have a Nice day..!!");
        System.exit(0);
    }
    
}
