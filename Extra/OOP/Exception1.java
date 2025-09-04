public class Exception1 {
    public static void main(String[] args) {
        // try{
        //     int a = 5;
        //     int b = a/0;
        //     System.out.println(a);
        //     System.out.println(b);
        // } catch(ArithmeticException e){
        //     System.out.println(e);  // java.lang.ArithmeticException: / by zero
        // } finally{
        //     System.out.println("I will be executed at any cost!");
        // }

        // try{
        //     int a[] = {1,2,3};
        //     System.out.println(a[10]);
        // } catch(ArithmeticException e){
        //     System.out.println(e);
        // } catch(ArrayIndexOutOfBoundsException e){
        //     System.out.println(e);  // java.lang.ArrayIndexOutOfBoundsException: Index 10 out of bounds for length 3
        // } catch(Exception e){
        //     System.out.println("Parent Exception");
        // } finally{
        //     System.out.println("I will be executed at any cost!");
        // }
        
        try{
            int a = 5;
            int b = a/0;

            System.out.println(a);
            System.out.println(b);
            try{
                int c = 10;
                int d = c/0;

                System.out.println(c);
            } catch(Exception e){
                System.out.println(e);
            }
        }
        catch(Exception e){
            System.out.println(e);  // java.lang.ArithmeticException: / by zero
        } finally{
            System.out.println("I will be executed at any cost!");
        }
    }
}
