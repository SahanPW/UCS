package PKG;
public class Time{
    void Cal1(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    
                    System.out.print(">> After convert your Value is : "+input+" Years");
                    System.out.println();
                break;
            case "month":
                    output =  input *  12 ;
                    System.out.print(">> After convert your Value is : "+ output + " Months");
                    System.out.println();
                break;    
            case "week":
                    output=input*48;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input*365;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input*8760;
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input*525600;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*31536*Math.pow(10,3);
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*31536*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

     void Cal2(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/12;
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    
                    System.out.print(">> After convert your Value is : "+input+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input*4;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input*30;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input*30*24;
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input*30*24*60;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*30*24*60*60;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*216*Math.pow(10,6);
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

     void Cal3(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/48;
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/4;
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    
                    System.out.print(">> After convert your Value is : "+input+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input*7;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input*7*24;
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input*7*24*60;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*7*24*60*60;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*6048*Math.pow(10,5);
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

     void Cal4(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/365;
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/30;
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input/7;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    
                    System.out.print(">> After convert your Value is : "+input+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input*24;
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input*1440.0;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*24*60*60;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*864*Math.pow(10,5);
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

     void Cal5(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/9125;
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/720;
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input/168;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input/24;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    
                    System.out.print(">> After convert your Value is : "+input+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input*60;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*3600;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*36*Math.pow(10,5);
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }

     void Cal6(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/525600;
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/43200;
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input/10080;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input/1440;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                 
                    System.out.print(">> After convert your Value is : "+  input/60 +" hours");
                    System.out.println();
                break;
            case "minute":
                    
                    System.out.print(">> After convert your Value is : "+input+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input*60;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*60000;
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }


     void Cal7(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/(31536*Math.pow(10,3));
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/(2592*Math.pow(10,3));
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input/604800;
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input/86400;
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input/3600;
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input/60;
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    
                    System.out.print(">> After convert your Value is : "+input+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                    output=input*1000;
                    System.out.print(">> After convert your Value is : "+output+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }


     void Cal8(String Option2,double input,double output)
    {
        switch (Option2) {
            case "year":
                    output=input/(290.304*Math.pow(10,8));
                    System.out.print(">> After convert your Value is : "+output+" Years");
                    System.out.println();
                break;
            case "month":
                    output=input/(24.192*Math.pow(10,8));
                    System.out.print(">> After convert your Value is : "+output+" Months");
                    System.out.println();
                break;    
            case "week":
                    output=input/(6048*Math.pow(10,5));
                    System.out.print(">> After convert your Value is : "+output+" Weeks");
                    System.out.println();
                break;
            case "day":
                    output=input/(864*Math.pow(10,5));
                    System.out.print(">> After convert your Value is : "+output+" Days");
                    System.out.println();
                break;
            case "hour":
                    output=input/(36*Math.pow(10,5));
                    System.out.print(">> After convert your Value is : "+output+" hours");
                    System.out.println();
                break;
            case "minute":
                    output=input/(60*Math.pow(10,3));
                    System.out.print(">> After convert your Value is : "+output+" minutes");
                    System.out.println();
                break;
            case "second":
                    output=input/1000;
                    System.out.print(">> After convert your Value is : "+output+" Seconds");
                    System.out.println();
                break;
            case "millisecond":
                   
                    System.out.print(">> After convert your Value is : "+input+" Milliseconds");
                    System.out.println();
                break;
        
            default:
                    System.out.println(">> Error...! , Invalid Units.");
                break;
        }
 
    }
}
    