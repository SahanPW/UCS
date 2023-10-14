package PKG;

public class MC {
    void M1(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value/Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value/Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value/Math.pow(10,9);
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/Math.pow(10,12);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value/(4.536*Math.pow(10,8));
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value/200000;
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M2(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value/Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value/Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/Math.pow(10,9);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value/453600;
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value/200;
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M3(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value/Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value/453.6;
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value/5;
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M4(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*Math.pow(10,9);
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value*Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value*2.205;
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value*5000;
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M5(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*Math.pow(10, 12);
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*Math.pow(10,9);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value*Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value*2205;
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value*(5*Math.pow(10,6));
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M6(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*(4.536*Math.pow(10,8));
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*453600;
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value*453.6;
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value/2.205;
                    System.out.print(">> After convert your Value is : "+output_value+" ft");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/2205;
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value*2268;
                    System.out.print(">> After convert your Value is : "+output_value+" miles");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
    void M7(String L2,double input_value,double output_value)
    {
        switch (L2) {
            case "mi":
                    output_value=input_value*200000;
                    System.out.print(">> After convert your Value is : "+output_value+" mug");
                    System.out.println();
                break;
            case "mg":
                    output_value=input_value*200;
                    System.out.print(">> After convert your Value is : "+output_value+" mg");
                    System.out.println();
                break;
            case "g":
                    output_value=input_value/5;
                    System.out.print(">> After convert your Value is : "+output_value+" g");
                    System.out.println();
                break;
            case "kg":
                    output_value=input_value/5000;
                    System.out.print(">> After convert your Value is : "+output_value+" kg");
                    System.out.println();
                break;
            case "t":
                    output_value=input_value/(5*Math.pow(10,6));
                    System.out.print(">> After convert your Value is : "+output_value+" t");
                    System.out.println();
                break;
            case "lb":
                    output_value=input_value/2268;
                    System.out.print(">> After convert your Value is : "+output_value+" lb");
                    System.out.println();
                break;
            case "ct":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" ct");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
}
