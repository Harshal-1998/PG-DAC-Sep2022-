
// Java Program to Create Outer Class Bank Account and the Inner Class Interest in it


class BankAcct 
{
    int principal = 200, rate = 4, time = 2;
	
    void test() 
    {
        Interest inner_obj = new Interest();
        inner_obj.display();
    }
	
    class Interest 
    {
        void display() 
        {
            int si = (principal * rate * time) / 100;
            System.out.println("Interest : " + si + " Rs");
        }
    }
}

public class COB_06_InnerClassDemo
{
	public static void main(String args[]) 
    {
        BankAcct outer_obj = new BankAcct();
        outer_obj.test();
    }
}




// 