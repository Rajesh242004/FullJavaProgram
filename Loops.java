public class Loops {
    public static void main(String args[]){

        int a = 1;
        while(a<=5){
            System.out.println("hello");
            a++;
        }

        //nested while loop

        int b = 1;
        while(b<=4){
            System.out.println("java");
            int c = 1;
            while(c<=2){
                System.out.println("programming");
                c++;
            }b++;
        }

        //do while loop

        int d = 10;
        do{
            System.out.println("hi java");
            d++;
        }while(d<=5);

        //for loop

        for(int i = 1;i<=5;i++){
            System.out.println("Hello World!!");
        }

        //nested for loop

        for(int x = 1;x<=5;x++){
            System.out.println("Day"+x);
            for(int y=1;y<=9;y++){
                System.out.println(" "+(y+8)+"-"+(y+9));
            }
        }

        //reverse loop

        int z=10;
        while(z>0){
            System.out.println("hello"+z);
            z--;
        }

        
    }
    
}
