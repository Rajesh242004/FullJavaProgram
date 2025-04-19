class Bank{
    private long accno;
    private String username;

    public Bank(String username,long accno){
        this.username=username;
        this.accno=accno;
    }
    public long getaccno(){
        return accno;
    }
    public String getusername(){
        return username;
    }
}
class Constructor{
    public static void main(String args[]){
        Bank obj =new Bank("rajesh",8785465464l);
        System.out.println("Username: "+obj.getusername()+"\nAccount number: "+obj.getaccno());

    }
}