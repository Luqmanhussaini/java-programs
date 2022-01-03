import java.util.*;
public class Main{
    static void String_arr(String a, String b){
        char arr[]=a.toCharArray();
        for(char i:arr)
            System.out.print(i+",");
        System.out.println();
        char arr1[]=b.toCharArray();
        for(char i:arr1)
            System.out.print(i+",");
        System.out.println();
    }
    static void string_len(String a, String b){
        System.out.println("Lenght of String1:"+a.length());
        System.out.println("Lenght of String2:"+b.length());
    }
        static void str_sub(String a){
            System.out.print("Enter initial and final index of substring to generate: ");
            Scanner readn=new Scanner(System.in);
            int in1=readn.nextInt();
            int in2=readn.nextInt();
            String s=a.substring(in1,in2);
            System.out.println("Substring is: "+s);
        }
public static void main(String args[]){
Scanner read=new Scanner(System.in);
System.out.print("Enter string 1: ");
String str1=read.next();
System.out.print("Enter string 2: ");
String str2=read.next();
System.out.print("1.String to array\n2.length of string\n3.substring\n4.concatenate\n");
System.out.print("5.replace\n6.To lower case\n7.To upper case\n8.Search a substring\n");
        System.out.print("Choose an option: ");
        int opt=read.nextInt();
        switch(opt){
            case 1:
                String_arr(str1,str2);
                break;
            case 2:
                string_len(str1,str2);
                break;
            case 3:
                str_sub(str1);
                break;
               
                   
        }
    }
}
