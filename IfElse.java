public class IfElse {
    public static void main(String args[]){
        int a = 2;
        if(a==0)
        System.out.println("hello");
        else
        System.out.println("hi");

        int b = 10;
        if(b>20 && b<20)
        System.out.println("b is bigger");
        else
        System.out.println("b is smaller");

        int x = 1;
        int y = 2;
        int z = 3;

        if(x>y && x>z)
        System.out.println("x is bigger");
        else if(y>z)
        System.out.println("y is bigger");
        else
        System.out.println("z is bigger");

        //Ternary Operator

        int n = 4;
        int result;
        result = n%2==0?10:20; 
        System.out.println(result);

        //Switch case

        String day = "monday";
        switch(day){
            case "monday":
            System.out.println("7am");
            break;
            case "tuesday":
            System.out.println("8am");
            break;
            case "wednesday":
            System.out.println("9am");
            break;
            case "thursday":
            System.out.println("6am");
            break;
            case "friday":
            System.out.println("7am");
            break;
            case "saturday":
            System.out.println("6am");
            break;
            case "sunday":
            System.out.println("9am");
            break;
            default:
            System.out.println("Enter a valid day");
            break;
        }


    }
    
}
