//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double item1=2500.00;
        double item2=129.75;
        double item3=99.95;
        double item4=350.89;
        Scanner input = new Scanner(System.in);
        System.out.printf("Enter The commission rate :%n ");
        int commission_rate = input.nextInt();
        System.out.printf("Enter the number of your employees. (exist enter -1 )%n");
        int emp_no = input.nextInt();
        if (emp_no != -1 ){
            int iteration = 0 ;
            while((emp_no > 0)){
                ++iteration;
                SalesPerson s = new SalesPerson();
                System.out.printf("Enter employee name:%n");
                String name = input.next();
                s.setName(name);
                System.out.printf("Enter employee id:%n");
                int id = input.nextInt();
                s.setId(id);
                System.out.printf("enter number of items: %n");
                int no_items = input.nextInt();
                double final_total= 0.0;
                while(no_items>0){
                    System.out.println("enter item:, and number sold ");
                    int item = input.nextInt();
                    double number_sold=input.nextDouble();
                    double total_item = 0.0;
                    switch (item) {
                        case 1:
                            total_item += item1*number_sold;
                            break;
                        case 2:
                            total_item += item2*number_sold;
                            break;
                        case 3 :
                            total_item+= item3*number_sold;
                            break;
                        case 4 :
                            total_item+= item4*number_sold;
                            break;

                    }
                    final_total += total_item;
                    no_items--;
                }//end of item while
                s.update_salary(commission_rate,final_total);
                s.print();
                emp_no--;
            }// end of while emp
        }else {
            System.out.print("no employees");
        }
}
}