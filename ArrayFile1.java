class ArrayFile1{
    public static void main(String args[]){
        int num[] = {1,2,3,4,};
        num[1] = 10;
        System.out.println(num[2]);

        String cars[] = {"BMW","Benz","Audi","Bugati"};
        System.out.println(cars[1]);

        int number[] = new int[5];     //by default every element is 0
        System.out.println(number[2]);

        //To print all the elements in array

        int number1[] = new int[4];
        number1[0] = 80;
        number1[1] = 10;
        number1[2] = 50;
        number1[3] = 30;
        

        for(int i=0;i<4;i++){
            System.out.println(number1[i]);
        }

    }
}