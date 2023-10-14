package PKG;

public class TC {
    void T1(String tc2,double input_value,double output_value)
    {
        switch (tc2) {
            case "C":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" 'C");
                    System.out.println();
                break;
            case "F":
                    output_value=((input_value*9)/5)+32;
                    System.out.print(">> After convert your Value is : "+output_value+" 'F");
                    System.out.println();
                break;
            case "K":
                    output_value=input_value+273.15;
                    System.out.print(">> After convert your Value is : "+output_value+" K");
                    System.out.println();
                break;
            case "R":
                    output_value=((input_value*9)/5)+491.67;
                    System.out.print(">> After convert yo/Math.pow(10,9)ur Value is : "+output_value+" 'R");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void T2(String tc2,double input_value,double output_value)
    {
        switch (tc2) {
            case "C":
                    output_value=((input_value-32)*5)/9;
                    System.out.print(">> After convert your Value is : "+output_value+" 'C");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" 'F");
                    System.out.println();
                break;
            case "K":
                    output_value=((input_value-32)*5)/9+273.15;
                    System.out.print(">> After convert your Value is : "+output_value+" K");
                    System.out.println();
                break;
            case "R":
                    output_value=input_value+459.67;
                    System.out.print(">> After convert your Value is : "+output_value+" 'R");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void T3(String tc2,double input_value,double output_value)
    {
        switch (tc2) {
            case "C":
                    output_value=input_value-273.15;
                    System.out.print(">> After convert your Value is : "+output_value+" 'C");
                    System.out.println();
                break;
            case "F":
                    output_value=(((input_value-273.15)*9)/5)+32;
                    System.out.print(">> After convert your Value is : "+output_value+" 'F");
                    System.out.println();
                break;
            case "K":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" K");
                    System.out.println();
                break;
            case "R":
                    output_value=input_value*1.8;
                    System.out.print(">> After convert your Value is : "+output_value+" 'R");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void T4(String tc2,double input_value,double output_value)
    {
        switch (tc2) {
            case "C":
                    output_value=((input_value-491.67)*5)/9;
                    System.out.print(">> After convert your Value is : "+output_value+" 'C");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value-459.67;
                    System.out.print(">> After convert your Value is : "+output_value+" 'F");
                    System.out.println();
                break;
            case "K":
                    output_value=(input_value*5)/9;
                    System.out.print(">> After convert your Value is : "+output_value+" K");
                    System.out.println();
                break;
            case "R":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" 'R");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
}
