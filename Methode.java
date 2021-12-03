public class Methode {

    static void display(String message){
        System.out.println(message);
    }

    static void sum(int a,int b){
        int c = a + b;
        System.out.println(c);
    }

    static int sumReturn(int a,int b){
         return a+b;
    }

    static void fullName(String fName,String lName){
        System.out.println(fName+" "+lName);
    }

    static int maxNumber(int a ,int b){
        return a > b ? a : b;
    };

    static void displayArray (int[] arr){
        System.out.println("{");
        for(int i=0;i<arr.length;i++){
            String show = arr[i]+ (i<arr.length-1?",":"");
            System.out.println(show);
        }
        System.out.println("}");
    };

    static int findMaxInArray (int[] arr){
        int result = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i] > result){
                result = arr[i] ;
            }
        }
        return result;
    }

    static int findMaxIndexArray (int[] arr){
        int result = 0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > arr[result] ){
                result = i ;
            }
        }
        return result;
    }

    static boolean compareArray(int[] a,int[] b ){

        if(a.length != b.length){
            return false;
        }

        for(int i=0;i<a.length;i++){
            if(a[i]!=b[i]){
                return false;
            }
        }

        return true;
    }

    static void swapElement (int[] a,int x,int y){
        int temp = a[x];
        a[x] = a[y];
        a[y] = temp;
    }

    static int[] copyArray(int[] arr){
        // สร้าง array ที่มีค่าเปล่าตมความยาว
        int[] newArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            newArr[i] = arr[i];
        }
        return newArr;
    }

    static int findIndexOfIntArray(int[] arr,int a){
        for(int i=0;i<arr.length;i++){
            if(arr[i] == a){
                return i;
            }
        }
        return -1;
    }

    static int findIndexOfStringArray(String[] arr,String a){
        for(int i=0;i<arr.length;i++){
            if(arr[i].equals(a)){
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        display("Hello");
        sum(1,2);
        fullName("Chanwit", "Pansila");
        int c = sumReturn(3, 2);
        int max = maxNumber(-10, -20);
        System.out.println(max);
        System.out.println(c);

        int[] arrNum1 = {1,2,3,5,4};
        int[] arrNum2 = {1,2,3,5,4,5};
        displayArray(arrNum1);
        int maxNum = findMaxInArray(arrNum1);
        System.out.println(maxNum);
        int maxNumIndex = findMaxIndexArray(arrNum1);
        System.out.println(maxNumIndex);

        boolean isMatch = compareArray(arrNum1, arrNum2);
        System.out.println(isMatch);

        swapElement(arrNum1,4,3);
        displayArray(arrNum1);

        displayArray(copyArray(arrNum2));

        System.out.println(findIndexOfIntArray(arrNum1,5));

        String[] fruit = {"Apple","Orange","Banana"};
        System.out.println(findIndexOfStringArray(fruit,"Orange"));

    }
}
