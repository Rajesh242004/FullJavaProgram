class Students{
    int marks;
    String name;
    int rollno;
}
class ArrayObject{
    public static void main(String args[]){
        Students s1 = new Students();
        s1.marks=89;
        s1.name="john";
        s1.rollno=1;

        Students s2 = new Students();
        s2.marks=98;
        s2.name="cena";
        s2.rollno=2;

        Students Students[] = new Students[2]; 
        Students[0]=s1;
        Students[1]=s2;

        for(int i=0;i<2;i++){
            System.out.println(Students[i].name+":"+Students[i].rollno+":"+Students[i].marks+":");
        }

    }
}