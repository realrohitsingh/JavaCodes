package constructor;
class Container{
    int capacity;
    Container(int arg){
        capacity=arg;
    }
}
public class Mainclass5 {
    public static void main(String[] args) {
        Container c1=new Container(2000);
        System.out.println(c1.capacity);
        System.out.println("---------------------");
        Container c2=new Container(5000);
        System.out.println(c2.capacity);
        System.out.println("---------------------");
        Container c3=new Container(10000);
        System.out.println(c3.capacity);
    }
}

