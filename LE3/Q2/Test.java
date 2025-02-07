interface Testable{
    void display();
}
class Test implements Testable{
    public void display(){
        System.out.println("display function from class Test that implements Testable interface");
    }
}