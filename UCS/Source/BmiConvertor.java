package PKG;
import PKG.Bm;
import java.util.Scanner;
import java.lang.Math;
public class BmiConvertor
{
    PKG.Bm w=new PKG.Bm();

    Scanner sc=new Scanner(System.in);
    String units1[]={"# Gram      :- 'G' ",
                     "# KiloGram  :- 'KG' ",
                     "# Pounds    :- 'P' "};

    String units2[]={"# Centimeters :- 'CM' ",
                     "# Meters      :- 'M' ",
                     "# Inchs       :- 'IN' ",
                     "# Feets       :- 'F' "};
                     
    int sub_menu1;
    double output_value_w,output_value_h,len;
    String we,he;
    double weight,height;
    int i,j;
    char end,sym;
    int Usize1=units1.length;
    int Usize2=units2.length;
    double bmi;

    void display1()
    {
        
        System.out.println(" >> When the program asks which unit the value you enter belongs to , You should enter as below. <<");
        System.out.println("----------WEIGHT----------");
        for(i=0;i<Usize1;i++)
        {
            System.out.println(units1[i]);
        }
    }

    void display2()
    {
        
        System.out.println(" >> When the program asks which unit the value you enter belongs to , You should enter as below. <<");
        System.out.println("----------HEIGHT----------");
        for(j=0;j<Usize2;j++)
        {
            System.out.println(units2[j]);
        }
    }

       
    public void details()
    {
        do {
        System.out.println("    ---<    BMI CONVERTER (BMI)   >---    ");
        System.out.println("_________________________________________________");
        System.out.println();
        System.out.println(">> Choice Board.");
        System.out.println("    01.Normal BMI Converter.");
        System.out.println("    02.Exit.");
        System.out.println();
        System.out.print("# Express your Option (1 or 2): ");
        sub_menu1=sc.nextInt();
        System.out.println("____________________________________________");
        System.out.println();

        switch (sub_menu1) {
            case 1:
                    do
                    {
                        System.out.println("             --<    Normal BMI Converter.   >--           ");
                        System.out.println("        ____________________________________________________      ");
                        System.out.println();
                        System.out.println(" >> Here you can Subsititute Weight and Height In any units you want <<");
                        
                        display1();
                        System.out.println();
                        System.out.println();
                        
                        display2();
                        System.out.println();
                        System.out.print("> Enter Your Weight                                                    : ");
                        weight=sc.nextDouble();
                        System.out.print("> Enter Unit notation (weight) of Your value ( in capital letter )     : ");
                        we=sc.next();
                        System.out.println();
                        System.out.print("> Enter Your Height                                                    : ");
                        height=sc.nextDouble();
                        System.out.print("> Enter Unit notation (height) of Your value ( in capital letter )     : ");
                        he=sc.next();
                        System.out.println();

                            switch(we)
                            {
                                case "G":
                                    w.W1(he,weight,output_value_w,output_value_h,height,bmi);
                                    break;

                                case "KG":
                                    w.W2(he,weight,output_value_w,output_value_h,height,bmi);
                                    break;

                                case "P":
                                    w.W3(he,weight,output_value_w,output_value_h,height,bmi);
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


class App
{
    public static void main(String args[])
    {
        BmiConvertor bm=new BmiConvertor();
        //bm.display1();
        //bm.display2();
        bm.details();
    }
}

