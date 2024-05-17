public class SalesPerson {
    private int id;
    private String name;
    private double salary;



    public SalesPerson(){
        this.id=0;
        this.name="";
        this.salary=200.0;
    }

    public void setId(int Id){
        this.id = Id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
    public int getId(){
        return this.id;
    }

    public void update_salary(int commission_rate, double item){

        this.salary += ((double) commission_rate /100) * item ;
    }
    public double getSalary(){
        return this.salary;
    }
    public void  print(){
        System.out.printf("name: %s%nID: %d%n salary:%.2f%n", this.name , this.id , this.salary);
    }
}

