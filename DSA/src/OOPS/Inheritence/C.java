package OOPS.Inheritence;

public class C extends B {

    public static void main(String[] args) {
        C cObj = new C();

        // printing the value : of parent class of current class
        // parent class of C is B : print B, members value

        System.out.println(cObj.name);
        cObj.printName();
    }
}
