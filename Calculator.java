package Real_CALCULATOR;
import java.util.Scanner;
class CalculatorBrackets{
    public static Scanner sc = new Scanner(System.in);
    public static String z;
    public static float d=20;
    public static float o=0;
    public static String getOperator(){
        String w;
        while (true){
            try{
                w=sc.next();
                if(w.equals("+")||w.equals("-")||w.equals("*")||w.equals("/")||w.equals(")")){
                    break;
                }
                else{
                    throw new Exception("Input Proper Operator");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return w;
    }
    public static float getNumber(){
        float f;
        while(true){
            try{
                String s=sc.next();
                if(s.equals("(")){
                    f = Addition1(0,0);
                }
                else{
                    f=Float.parseFloat(s);
                    if(f>10000){
                        throw new Exception("Input is Greater than 10000");
                    }
                }
                break;
            }
            catch(Exception e){
                sc.nextLine();
                System.out.println(e);
            }
        }
        return f;
    }

    public static float Addition1(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            float g = a+b;
            b+=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase(")")){
                d--;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase(")")){
                    o=a+b;
                    return a+b;
                }
            }
            if(z.equalsIgnoreCase(")")){
                break;
            }
        }
        return o;
    }
    public static float Subtraction1(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            l *=(-1);
            float g = a+b;
            b+=l;
            z= getOperator();
            if(z.equalsIgnoreCase("+") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase(")")){
                d--;
                if(z.equalsIgnoreCase("+")){
                    try{Addition1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division1(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase(")")){
                    o=a+b;
                    return a+b;
                }
            }
            if(z.equalsIgnoreCase(")")){
                break;
            }
        }
        return o;
    }
    public static float Multiplication1(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            b*=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("+") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase(")")){
                d--;
                float g = b+a;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction1(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("+")){
                    try{Addition1(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division1(a,b);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase(")")){
                    o=a+b;
                    return a+b;
                }
            }
            if(z.equalsIgnoreCase(")")){
                break;
            }
        }
        return o;
    }
    public static float Division1(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            l=1/l;
            b*=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("+") || z.equalsIgnoreCase(")")){
                d--;
                float g = b+a;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction1(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("+")){
                    try{Addition1(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication1(a,b);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase(")")){
                    o=a+b;
                    return a+b;
                }
            }
            if(z.equalsIgnoreCase(")")){
                break;
            }
        }
        return o;
    }
}
class CalculatorFunction{
    public static Scanner sc = new Scanner(System.in);
    public static String z;
    public static float d=20;
    public static String getOperator(){
        String w;
        while (true){
            try{
                w=sc.next();
                if(w.equals("+")||w.equals("-")||w.equals("*")||w.equals("/")||w.equals("=")){
                    break;
                }
                else{
                    throw new Exception("Input Proper Operator");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        return w;
    }
    public static float getNumber(){
        float f;
        while(true){
            try{
                String s=sc.next();
                if(s.equals("(")){
                    f = CalculatorBrackets.Addition1(0,0);
                }
                else{
                    f=Float.parseFloat(s);
                    if(f>10000){
                        throw new Exception("Input is Greater than 10000");
                    }
                }
                break;
            }
            catch(Exception e){
                sc.nextLine();
                System.out.println(e);
            }
        }
        return f;
    }
    public static void Addition(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            float g = a+b;
            b+=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase("=")){
                d--;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("=")){
                    System.out.printf("Your Result Is : %f\n",a+b);
                   break;
                }
            }
            if(z.equalsIgnoreCase("=")){
                break;
            }
        }
    }
    public static void Subtraction(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            l *=(-1);
            float g = a+b;
            b+=l;
            z= getOperator();
            if(z.equalsIgnoreCase("+") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase("=")){
                d--;
                if(z.equalsIgnoreCase("+")){
                    try{Addition(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division(g,l);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("=")){
                    System.out.printf("Your Result Is : %f",a+b);
                    break;
                }
            }
            if(z.equalsIgnoreCase("=")){
                break;
            }
        }
    }
    public static void Multiplication(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            b*=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("+") || z.equalsIgnoreCase("/") || z.equalsIgnoreCase("=")){
                d--;
                float g = b+a;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("+")){
                    try{Addition(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("/")){
                    try{Division(a,b);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("=")){
                    System.out.printf("Your Result Is : %f",a+b);
                    break;
                }
            }
            if(z.equalsIgnoreCase("=")){
                break;
            }
        }
    }
    public static void Division(float a,float b){
        for(int c = 0;c<d;c++){
            float l;
            l=getNumber();
            l=1/l;
            b*=l;
            z= getOperator();
            if(z.equalsIgnoreCase("-") || z.equalsIgnoreCase("*") || z.equalsIgnoreCase("+") || z.equalsIgnoreCase("=")){
                d--;
                float g = b+a;
                if(z.equalsIgnoreCase("-")){
                    try{Subtraction(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("+")){
                    try{Addition(g,0);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("*")){
                    try{Multiplication(a,b);}
                    catch(Exception h){
                        System.out.println(h);
                    }
                }
                else if(z.equalsIgnoreCase("=")){
                    System.out.printf("Your Result Is : %f",a+b);
                    break;
                }
            }
            if(z.equalsIgnoreCase("=")){
                break;
            }
        }
    }
}




public class Calculator {
    public static void main(String[] args) {
        CalculatorFunction.Addition(0,0);
    }
}
