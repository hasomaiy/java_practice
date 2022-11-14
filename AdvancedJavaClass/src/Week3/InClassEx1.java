package Week3;

enum Operation{
    PLUS{
        double work(double a, double b)
        {
            return a+b;
        }
    
    },
    MINUS{
        double work(double a, double b)
        {
            return a-b;
        }
    },
    TIMES{
        double work(double a, double b)
        {
            return a*b;
        }
    },
    DIVIDE{
        double work(double a, double b)
        {
            return a/b;
        }

    };
    

//    Operation operation;
//    private Operation(Operation operation) {
//        // TODO Auto-generated constructor stub
//        this.operation = operation;
//        };
//    

    double work(double a, double b)
    {
        return 0;
    }
    double apply(double a, double b) {
        return work(a,b);
    }
    

            
    
    
}
public class InClassEx1 {
    
     public static void main(String[] args) {
         double a = 10;
         double b = 5;
         for (Operation op : Operation.values())
          System.out.printf("%f %s %f = %f\n",a, op, b, op.apply(a, b));
          } 

}