public class Main {

    // the return type of this method is void i.e. there is no return
    public static void main(String[] args) {
        System.out.println("Methods!");
        int sum = add(2,3);
        System.out.println(sum);

        printName("Joe",8);
    }

    /*
    a method declaration consists of the following:
    access modifier, optional modifier, return type, method name, parameters, and of course the method's body
    */

    // this thing is called a Javadoc, it makes hover tooltips work better
    /**
     * Computes the sum of the two supplied numbers
     *
     * @param a the first number
     * @param b the second number
     * @return sum of a and b
     */
    public static int add(int a, int b){
        return a+b;
    }

    // this overloaded method prints out the supplied string
    public static void printName(String name){
        System.out.println(name);
    }

    // this overloaded method prints out the supplied string the specified number of times
    public static void printName(String name, int numberOfTimes){
        for (int i =0; i<numberOfTimes; i++) {
            System.out.println(name);
        }
    }
}