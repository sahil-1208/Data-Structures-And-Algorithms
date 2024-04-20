package stack;

public class Stack {

    public static void main(String[] args) {

        StackImpl stackImpl = new StackImpl(5);

        stackImpl.push(4);
        stackImpl.push(3);
        stackImpl.push(2);
        stackImpl.push(1);
        stackImpl.push(0);

        System.out.println("Pop Element : " + stackImpl.pop().value);
        System.out.println("Pop Element : " + stackImpl.pop().value);
        System.out.println("Pop Element : " + stackImpl.pop().value);

        System.out.println("Top Element : " + stackImpl.getTop().value);
        System.out.println("Height : " + stackImpl.getHeight());


        System.out.println("Stack : ");
        stackImpl.printStack();


    }


}
