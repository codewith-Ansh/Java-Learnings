class GenericMethod {
    // A generic method
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
    
    public static <T> void concat(T a, T b){
        System.out.println(a + "" + b);
    }

    public static void main(String[] args) {
        Integer[] intArr = {1, 2, 3};
        String[] strArr = {"A", "B", "C"};

        printArray(intArr);  // Works with Integer
        printArray(strArr);  // Works with String

        Integer a = 15;
        Integer b = 10;
        String c = "Hello ";
        String d = "World!";

        concat(a, b);
        concat(c, d);
    }
}
