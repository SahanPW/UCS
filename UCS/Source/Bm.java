package PKG;
public class Bm
{
    
// G
    void W1(String he,double weight,double output_value_w,double output_value_h,double height,double bmi)
    {
        
        switch(he)
        {
            case "CM":
                output_value_w=(weight/1000);
                output_value_h=height/100;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case "M":
                output_value_w=(weight/1000);
                output_value_h=height*1;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"IN":
                output_value_w=(weight/1000);
                output_value_h=height/39.37;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"F":
                output_value_w=(weight/1000);
                output_value_h=height/3.281;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            default:
                System.out.println(">> Error...! , Invalid Units.");
                break;
        }
    }



//KG
    void W2(String he,double weight,double output_value_w,double output_value_h,double height,double bmi)
    {
        
        switch(he)
        {
            case "CM":
                output_value_w=(weight*1);
                output_value_h=height/100;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case "M":
                output_value_w=(weight*1);
                output_value_h=height*1;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"IN":
                output_value_w=(weight*1);
                output_value_h=height/39.37;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"F":
                output_value_w=(weight*1);
                output_value_h=height/3.281;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            default:
                System.out.println(">> Error...! , Invalid Units.");
                break;
        }
    }

//P
    void W3(String he,double weight,double output_value_w,double output_value_h,double height,double bmi)
    {
        
        switch(he)
        {
            case "CM":
                output_value_w=(weight/2.205);
                output_value_h=height/100;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case "M":
                output_value_w=(weight/2.205);
                output_value_h=height*1;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"IN":
                output_value_w=(weight/2.205);
                output_value_h=height/39.37;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            case"F":
                output_value_w=(weight/2.205);
                output_value_h=height/3.281;
                bmi=(output_value_w/(output_value_h*output_value_h));
                System.out.println("< YOUR BMI VALUE IS : "+bmi +" Kg/m^");
                break;

            default:
                System.out.println(">> Error...! , Invalid Units.");
                break;
        }
    }

 
}

