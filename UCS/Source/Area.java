package PKG;
public class Area {
    void Cal1(String Option2,double input_value,double output_value)
    {
        switch (Option2) { 
            case "mm":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    output_value=(input_value)/100;
                    System.out.print(">> After convert your Value is : "+output_value +" cm");
                    System.out.println();
                break;
            case "m":
                    output_value=input_value/1000000;
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "km":
                    output_value=input_value/(Math.pow(10,12));
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "inch":
                    output_value=input_value/(25*25);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    output_value=input_value/(300*300);
                    System.out.print(">> After convert your Value is : "+output_value+" foot");
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
            case "mm":
                    output_value=input_value*100;
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" cm");
                    System.out.println();
                break;
            case "m":
                    output_value=input_value/(Math.pow(10,4));
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "km":
                    output_value=input_value/(Math.pow(10,10));
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "inch":
                    output_value=input_value/(2.5*2.5);
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    output_value=input_value/(30*30);
                    System.out.print(">> After convert your Value is : "+output_value+" foot");
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
            case "mm":
                    output_value=input_value*Math.pow(10,10);
                    System.out.print(">> After convert your Value is : "+input_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    output_value=input_value*Math.pow(10,4);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "m":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" m");
                    System.out.println();
                break;
            case "km":
                    output_value=input_value/(Math.pow(10,6));
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "inch":
                    output_value=input_value*40*40;
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    output_value=input_value*3.33*3.33;
                    System.out.print(">> After convert your Value is : "+output_value+" foot");
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
            case "mm":
                    output_value=input_value*Math.pow(10,12);
                    System.out.print(">> After convert your Value is : "+input_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    output_value=input_value*Math.pow(10,10);
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "m":
                    output_value=input_value*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "km":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" km");
                    System.out.println();
                break;
            case "inch":
                    output_value=input_value*40000*40000;
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    output_value=input_value*3300*3300;
                    System.out.print(">> After convert your Value is : "+output_value+" foot");
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
            case "mm":
                    output_value=input_value*25*25;
                    System.out.print(">> After convert your Value is : "+input_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    output_value=input_value*2.5*2.5;
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "m":
                    output_value=input_value/(40*40);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "km":
                    output_value=input_value*(Math.pow(10,4)*4);
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "inch":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    output_value=input_value/144;
                    System.out.print(">> After convert your Value is : "+output_value+" foot");
                    System.out.println();
                break;    
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

  void Cal6(String Option2,double input_value,double output_value)
    {
        switch (Option2) {
            case "mm":
                    output_value=input_value*300*300;
                    System.out.print(">> After convert your Value is : "+output_value+" mm");
                    System.out.println();
                break;
            case "cm":
                    output_value=input_value*30*30;
                    System.out.print(">> After convert your Value is : "+output_value+" cm");
                    System.out.println();
                break;
            case "m":
                    output_value=input_value/(3.33*3.33);
                    System.out.print(">> After convert your Value is : "+output_value+" m");
                    System.out.println();
                break;
            case "km":
                    output_value=input_value/(333*333*Math.pow(10,2));
                    System.out.print(">> After convert your Value is : "+output_value+" km");
                    System.out.println();
                break;
            case "inch":
                    output_value=input_value*144;
                    System.out.print(">> After convert your Value is : "+output_value+" inch");
                    System.out.println();
                break;

            case "foot":
                    
                    System.out.print(">> After convert your Value is : "+input_value+" foot");
                    System.out.println();
                break;    
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }



}
   


   