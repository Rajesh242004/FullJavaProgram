package Exceptions;
class Demo{
    public static void main(String[] args) {
        int i = 0;
        int j = 0;

        try{
            j=29/i;
        }
        catch(Exception e){
            System.out.println("something went wrong");
        }
        System.out.println("its all good");
    }
}