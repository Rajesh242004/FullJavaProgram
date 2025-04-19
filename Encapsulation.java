class Bank{
    private long accno;
    private String username;
    
    public long getaccno(){
        return accno;
    }
    public void setaccno(long accno){
        this.accno=accno;
                                   
    }
    public String getusername(){
        return username;
    }
    public void setusername(String username){
        this.username=username;
    }
}
class Encapsulation{
    public static void main(String args[]){
        Bank obj = new Bank();
        obj.setaccno(98766576597765L);
        obj.setusername("rajesh");

        System.out.println("Username: "+obj.getusername()+"\nAccount Number: "+obj.getaccno());
    }
}