public class Student {
    int age ;
    String name;
    public void display(){
        System.out.print("My name is " + this.name + ". I am "  + this.age + " years old");
    }
    public  void sayhello(String A){
        System.out.println(this.name + " says hello to " + A);
    }
    public static void main(String arg[]){
        Student s1 = new Student();
        s1.age =10;
        s1.name ="priyanka";
        s1.display();
        System.out.println();
        //s1.sayhello("nisarg");
        Student s2 = s1;
        s2.age = 20;
        s2.name = "B";

        s2.display();
        System.out.println();
        s1.display();
    }

}

