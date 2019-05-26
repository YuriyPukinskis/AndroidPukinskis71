package ru.netology.androidpukinskis51;

public class NumberCreate {
    public static double numbering(boolean point, double number, double digit, int elem){
        if (point){
            number=number+elem/digit;
        }
        else
        {
            number=number*10+elem;
        }
        return number;
    }
    public static double execute(double value1,double value2,Operation operation){
        switch (operation){
            case ADD:value1+=value2;break;
            case SUB:value1-=value2;break;
            case MUL:value1*=value2;break;
            case DIV:value1=value1/value2;break;
            case PER:value1=value2/100*value1;
            default:break;
        }
        return value1;
    }
    public static void reset(){
        MainActivity.number=0;
        MainActivity.point=false;
        MainActivity.digit=1;
    }
}
