package PKG;
public class Speed {
    void Cal1(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "ms":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" M/s");
                    System.out.println();
                break;
            case "kmh":
                    output_value=(input_value*3600)/1000;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/h");
                    System.out.println();
                break;
            case "kms":
                    output_value=input_value/1000;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/s");
                    System.out.println();
                break;
            case "fps":
                    output_value=input_value*3.3;
                    System.out.print(">> After convert your Value is : "+output_value+" Fps");
                    System.out.println();
                break;
            case "ips":
                    output_value=input_value*40;
                    System.out.print(">> After convert your Value is : "+output_value+" Ips");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
   


   void Cal2(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "ms":
                    output_value=(input_value*1000)/3600;
                    System.out.print(">> After convert your Value is : "+output_value+" M/s");
                    System.out.println();
                break;
            case "kmh":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" Km/h");
                    System.out.println();
                break;
            case "kms":
                    output_value=input_value/3600;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/s");
                    System.out.println();
                break;
            case "fps":
                    output_value=(input_value*3333.33)/3600;
                    System.out.print(">> After convert your Value is : "+output_value+" Fps");
                    System.out.println();
                break;
            case "ips":
                    output_value=(input_value*40000)/3600;
                    System.out.print(">> After convert your Value is : "+output_value+" Ips");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
   


   void Cal3(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "ms":
                    output_value=input_value*1000;
                    System.out.print(">> After convert your Value is : "+output_value+" M/s");
                    System.out.println();
                break;
            case "kmh":
                    output_value=input_value*3600;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/h");
                    System.out.println();
                break;
            case "kms":
                    System.out.print(">> After convert your Value is : "+input_value+" Km/s");
                    System.out.println();
                break;
            case "fps":
                    output_value=input_value*3333.33;
                    System.out.print(">> After convert your Value is : "+output_value+" Fps");
                    System.out.println();
                break;
            case "ips":
                    output_value=input_value*40000;
                    System.out.print(">> After convert your Value is : "+output_value+" Ips");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
   


   void Cal4(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "ms":
                    output_value=input_value/3.3;
                    System.out.print(">> After convert your Value is : "+output_value+" M/s");
                    System.out.println();
                break;
            case "kmh":
                    output_value=(input_value*3600)/3333.33;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/h");
                    System.out.println();
                break;
            case "kms":
                    output_value=input_value/3333.33;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/s");
                    System.out.println();
                break;
            case "fps":
            
                    System.out.print(">> After convert your Value is : "+input_value+" Fps");
                    System.out.println();
                break;
            case "ips":
                    output_value=input_value*12;
                    System.out.print(">> After convert your Value is : "+output_value+" Ips");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
   

   void Cal5(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "ms":
                    output_value=input_value/40;
                    System.out.print(">> After convert your Value is : "+output_value+" M/s");
                    System.out.println();
                break;
            case "kmh":
                    output_value=(input_value*3600)/40000;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/h");
                    System.out.println();
                break;
            case "kms":
                    output_value=input_value/40000;
                    System.out.print(">> After convert your Value is : "+output_value+" Km/s");
                    System.out.println();
                break;
            case "fps":
                    output_value=input_value/12;
                    System.out.print(">> After convert your Value is : "+output_value+" Fps");
                    System.out.println();
                break;
            case "ips":
                    System.out.print(">> After convert your Value is : "+input_value+" Ips");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
}