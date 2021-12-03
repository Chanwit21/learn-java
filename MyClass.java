import java.util.ArrayList;
import java.util.Collections;

/**
 * MyClass
 */
// ชื่อ class ต้องตรงกับชื่อ file ใน 1 file มี public class แค่อันเดียว
public class MyClass {

    public static void main(String[] args){
        String name = null;
        final int num = 5;
        System.out.println(name);
        System.out.println(num);

        // Primitive Data Types
        // Integer
        byte byteNum = 100;
        System.out.println("byteNum " + byteNum);
        short shortNum = 5000;
        System.out.println("shortNum " + shortNum);
        int intNum = 100000;
        System.out.println("intNum " + intNum);
        long longNum = 1500000000L;
        System.out.println("longNum " + longNum);

        // Float
        float floatNum = 5.75f;
        System.out.println("floatNum " + floatNum);
        double doubleNum = 19.99d;
        System.out.println("doubleNum " + doubleNum);
        float floatENum = 35e3f;
        System.out.println("floatENum " + floatENum);
        double doubleENum =  12E4d;
        System.out.println("doubleENum " + doubleENum);

        // Booleans
        boolean isJavaFun = true;
        boolean isJavaTasty = false;
        System.out.println(isJavaFun);
        System.out.println(isJavaTasty);

        // Characters
        char myGrade = 'A';
        System.out.println("myGrade " + myGrade);
        //เอาตัวเลขมาเทียบกับ ASCII ในตาราง
        char a =65,b=50,c=90; 
        System.out.println("a " + a);
        System.out.println("b " + b);
        System.out.println("c " + c);
        

        // Reference data types

        // Widening Casting
        int myInt = 9;
        double myDouble = myInt;
        System.out.println("myInt " + myInt);
        System.out.println("myDouble " + myDouble);

        // Narrowing Casting
        double myDouble1 = 9.78d;
        int myInt1 =(int)myDouble1;
        System.out.println("myDouble1 " + myDouble1);
        System.out.println("myInt1 " + myInt1);

        // Java Operators
        int x= 150+200;
        System.out.println("x "+x);
        // Arithmetic Operators + - * / % ++ --
        // Assignment Operators = += -= *= /= %= &= |= ^= >>= <<=
        // Comparison Operators == != > < >= <=
        // Logical Operators && || !

        // Conditions and if Statements
        // The if Statement
        int z= 20;
        int y=18;
        if(z > y){
            System.out.println("x is greater than y");
        }
        // The else Statement
        int time = 20;
        if(time < 18){
            System.out.println("Good day");
        } else{
            System.out.println("Good evening");
        }
        // The else if Statement
        if(time < 10){
            System.out.println("Good morning");
        }else if(time < 20) { 
            System.out.println("Good day");
        }else {
            System.out.println("Good evening");
        }
        // Short hand if else
        String result = (time < 18) ? "Good day":"Good evening";
        String result2 = (time < 10) ? "Good morning":(time < 18) ? "Good day" :"Good evening";
        System.out.println("result " + result);
        System.out.println("result2 " + result2);

        // Java Switch Statements
        int day = 4 ;
        switch(day){
            case 1:
            System.out.println("Today is Monday");
            break;
            case 2:
            System.out.println("Today is Tuesday");
            break;
            case 3:
            System.out.println("Today is Wenday");
            break;
            case 4:
            System.out.println("Today is Thursday");
            break;
            case 5:
            System.out.println("Today is Friday");
            break;
            case 6:
            System.out.println("Today is Saturday");
            break;
            case 7:
            System.out.println("Today is Sunday");
            break;
            default:
            // default ใช้ล่างสุดของ statement เสมอดังนั้นไม่ต้องมี break ก็ได้
            System.out.println("Looking forward to Weekend.");
        }

        // While loop 
        int i = 0;
        while(i < 5){
            System.out.println(i);
            i++;
        }
        // Do while
        do{
            System.out.println(i);
            i++;
        }while(i < 10);
        // For Loop
        for(int j = 0; j < 5;j++){
            System.out.println(j);
        }
        // For-Each Loop
        String[] cars = {"Volvo","BMW","Ford","Mazda"};
        for(String item :cars){
            System.out.println(item);
        }
        // Java Break
        for(int j = 0;j < 10;j++){
            if(j==4){
                break;
            }
            System.out.println(j);
        }
        // Java Continuue
        for(int j = 0;j < 10;j++){
            if(j==4){
                continue;
                // ข้ามรอบที่ = 4 ออกไป
            }
            System.out.println(j);
        }
        // ไล่ดีๆ
        int k = 0;
        while(k < 10){
            System.out.println(k);
            k++;
            if(k==4){
                break;
            }
        }
        // Java String
        String greeting = "Hello Bomb";
        System.out.println(greeting.length());
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting.toLowerCase());
        // Index of
        System.out.println(greeting.indexOf("H"));
        // Concat
        String firstName = "Chanwit ";
        String lastName = "Pansila";
        System.out.println(firstName+ " " + lastName);
        System.out.println(firstName.concat(lastName));
        // Special Characters \\ \' \" \n \r \t \b \f
        String txt = "We are the so-called \"Viking\" from the north.";
        System.out.println(txt);
        // Adding Number and String
        String f = "21";
        int r = 20;
        String s = r +f;
        System.out.println(s);
        // Java Math
        System.out.println(Math.max(5,10));
        System.out.println(Math.min(5,10));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-4.7));
        System.out.println(Math.random());

        // Java Array
        String[] arrStr = {"Bomb","Ploy","Pear"};
        int[] arrNum = {1,2,3,4};
        System.out.println(arrStr[0]);
        System.out.println("arrStr "+ arrStr);
        System.out.print(arrNum[0]);
        arrStr[0] = "Bom";
        System.out.println(arrStr[0]);
        System.out.println(arrStr.length);
        // Loop through an array
        for(int key = 0;key < arrStr.length;key++){
            System.out.println(arrStr[key]);
        }
        for(String value: arrStr){
            System.out.println(value);
        }
        // Multimensional Arrays
        int[][] myNums = {{1,2,3},{4,5,6}};
        int g = myNums[1][2];
        System.out.println(g);
        for(int key = 0;key < myNums.length;key++){
            for(int key1= 0;key1 < myNums[key].length;key1++ ){
                System.out.println(myNums[key][key1]);
            }
        }

        // Java Array List
        ArrayList<String> arrList = new ArrayList<String>();
        // Add Items
        arrList.add("list5");
        arrList.add("list1");
        arrList.add("list4");
        arrList.add("list2");
        arrList.add("list3");
        System.out.println("arrList " + arrList);
        // Loop Through an ArrayList
        for(int key = 0;key < arrList.size();key++){
            System.out.println(arrList.get(key));
        }
        for(String value: arrList){
            System.out.println(value);
        }
        // Sort an ArrayList
        System.out.println("arrList " +arrList);
        Collections.sort(arrList);
        System.out.println("arrListSort " + arrList);
        // Other ArrayList's method
        // System.out.println(arrList[0]); Array list ทำแบบนี้ไม่ได้
        System.out.println("arrListSize " + arrList.size());
        System.out.println(arrList.get(0));
        System.out.println(arrList.set(0,"listSet"));
        System.out.println("arrListSet " + arrList);
        System.out.println(arrList.remove(0));
        System.out.println("arrListRemove " + arrList);
        arrList.clear();
        System.out.println("arrListClear " + arrList);
        
    }

}