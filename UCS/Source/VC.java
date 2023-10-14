package PKG;
public class VC
{
    //milimeter
    void V1(String vc2,double input_value,double output_value)
    {
        switch (vc2) {
            case "MM":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" mm^");
                    System.out.println();
                break;
            case "CM":
                    output_value=input_value/1000;
                    System.out.print(">> After convert your Value is : "+output_value+" cm^");
                    System.out.println();
                break;
            case "IN":
                    output_value=input_value/16390;
                    System.out.print(">> After convert your Value is : "+output_value+" inch^");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value/2.832*10000000;
                    System.out.print(">> After convert Your Value is : "+output_value+" foot^");
                    System.out.println();
                break;

            case "M":
                    output_value=input_value/1000000000;
                    System.out.print(">> After convert your Value is : "+output_value+" m^");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
            }

    }

//centimeters
    void V2(String vc2,double input_value,double output_value)
    {
        switch (vc2) {
            case "MM":
                    output_value=input_value*1000;
                    System.out.print(">> After convert your Value is : "+output_value+" mm^");
                    System.out.println();
                break;
            case "CM":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" cm^");
                    System.out.println();
                break;
            case "IN":
                    output_value=input_value/16.387;
                    System.out.print(">> After convert your Value is : "+output_value+" inch^");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value/28320;
                    System.out.print(">> After convert Your Value is : "+output_value+" foot^");
                    System.out.println();
                break;

            case "M":
                    output_value=input_value/1000000;
                    System.out.print(">> After convert your Value is : "+output_value+" m^");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
            }

    }

    //inches
    void V3(String vc2,double input_value,double output_value)
    {
        switch (vc2) {
            case "MM":
                    output_value=input_value*16390;
                    System.out.print(">> After convert your Value is : "+output_value+" mm^");
                    System.out.println();
                break;
            case "CM":
                    output_value=input_value*16.387;
                    System.out.print(">> After convert your Value is : "+output_value+" cm^");
                    System.out.println();
                break;
            case "IN":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" inch^");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value/1728;
                    System.out.print(">> After convert Your Value is : "+output_value+" foot^");
                    System.out.println();
                break;

            case "M":
                    output_value=input_value/61020;
                    System.out.print(">> After convert your Value is : "+output_value+" m^");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
            }

    }

    //feets
    void V4(String vc2,double input_value,double output_value)
    {
        switch (vc2) {
            case "MM":
                    output_value=input_value*2.832*10000000;
                    System.out.print(">> After convert your Value is : "+output_value+" mm^");
                    System.out.println();
                break;
            case "CM":
                    output_value=input_value*28320;
                    System.out.print(">> After convert your Value is : "+output_value+" cm^");
                    System.out.println();
                break;
            case "IN":
                    output_value=input_value*1728;
                    System.out.print(">> After convert your Value is : "+output_value+" inch^");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value*1;
                    System.out.print(">> After convert Your Value is : "+output_value+" foot^");
                    System.out.println();
                break;

            case "M":
                    output_value=input_value/35.315;
                    System.out.print(">> After convert your Value is : "+output_value+" m^");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
            }

    }

    //meters
    void V5(String vc2,double input_value,double output_value)
    {
        switch (vc2) {
            case "MM":
                    output_value=input_value*1000000000;
                    System.out.print(">> After convert your Value is : "+output_value+" mm^");
                    System.out.println();
                break;
            case "CM":
                    output_value=input_value*1000000;
                    System.out.print(">> After convert your Value is : "+output_value+" cm^");
                    System.out.println();
                break;
            case "IN":
                    output_value=input_value*61020;
                    System.out.print(">> After convert your Value is : "+output_value+" inch^");
                    System.out.println();
                break;
            case "F":
                    output_value=input_value*35.315;
                    System.out.print(">> After convert Your Value is : "+output_value+" foot^");
                    System.out.println();
                break;

            case "M":
                    output_value=input_value*1;
                    System.out.print(">> After convert your Value is : "+output_value+" m^");
                    System.out.println();
                break;
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
            }

    }
}

	
	/*cm3
inch3
foot3
m3*/
