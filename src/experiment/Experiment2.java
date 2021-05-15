package experiment;
import java.util.Scanner;
public class Experiment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i < n; i++){
            ObjectCounter obj = new ObjectCounter();
        }
        System.out.println(ObjectCounter.getCount());
    }
    //5
    //        Scanner sc = new Scanner(System.in);
//        int x = sc.nextInt();
//        int y = sc.nextInt();
//        System.out.println(B.getX());
//        Point.fun1(B);
//        B = Point.fun2();
//        System.out.println(B.getX());

    //4
    //        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入名字：");
//        String name = sc.next();
//        System.out.println("请输入年龄：");
//        int age = sc.nextInt();
//        System.out.println("请输入学号: ");
//        int student_id = sc.nextInt();
//        Student student = new Student(name,age,student_id);
//        System.out.println("Name: " + student.getName() + " Age: " + student.getAge() + " Student_id: " + student.getStudent_id());

    //6.
    //        int m,n;    //第一个数的实部和虚部
//        int p,q;    //第二个数的实部和虚部
//        Scanner scanner =new Scanner(System.in);
//        m=scanner.nextInt();
//        n=scanner.nextInt();
//        p=scanner.nextInt();
//        q=scanner.nextInt();
//        Complex t =new Complex(m,n);
//        Complex s =new Complex(t);
//        Complex r=new Complex(p,q);
//        (s.Add(r)).Print();
//        (t.Sub(r)).Print();


    //7
    //        Cuboid c = new Cuboid(1,2,3);
//        System.out.println("The area is: " + Cuboid.count_S(c));
//        System.out.println("The volume is: " + Cuboid.count_V(c));
    //1.1038
    public  static class Prime{
        public  static boolean prime(int number){
            boolean is_prime = true;
            for(int i = 2;i < number;i++){
                if(number % i ==0){
                    is_prime = false;
                    break;
                }
            }
            if(is_prime){
                System.out.println("YES");
            }
            else
                System.out.println("NO");
            return is_prime;
        }
    }

    //2.1039
    public static class Number_two{
        private int i1;
        private int i2;
        private double d1;
        private double d2;
        private double d3;
        private String str1;
        private String str2;

        public Number_two(int i1,int i2){
            this.i1 = i1;
            this.i2 = i2;
        }

        public Number_two(double d1,double d2,double d3){
            this.d1 = d1;
            this.d2 = d2;
            this.d3 = d3;
        }

        public Number_two(String str1,String str2){
            this.str1 = str1;
            this.str2 = str2;
        }

        public int compare(){
            if(i1 >=  i2){
                System.out.println("The bigger number i1 = " + i1);
                return i1;
            }
            else
                System.out.println("The bigger number i2 =  " + i2);
            return i2;
        }

        public double multiply(){
            System.out.println("三个double值的乘积为：" + d1*d2*d3);
            return d1*d2*d3;
        }

        public Boolean equals(){
            if(str1.equals(str2)){
                System.out.println("相同");
                return true;
            }
            else
                System.out.println("不相同");
            return false;
        }
    }

    //3.1044
    public static class Student{
        private String name;
        private int age;
        private int student_id;
        public Student(String name,int age,int student_id){
            this.name = name;
            this.age = age;
            this.student_id = student_id;
        }

        public String getName(){
            return name;
        }
        public void setName(String name){
            this.name = name;
        }
        public int getAge(){
            return age;
        }
        public void setAge(int age){
            this.age = age;
        }
        public int getStudent_id(){
            return student_id;
        }
        public void setStudent_id(int student_id){
            this.student_id = student_id;
        }
    }

    //4.1051
    public static class Dog{
        private String name;
        private String color;
        private int age;
        public Dog(){
            name = "dog1";
            color = "white";
            age = 1;
        }
        public Dog(String name, String color, int age){
            this.name = name;
            this.color = color;
            this.age = age;
        }

        public String getName(){
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

    }

    //5.7201
    public static class Point{
        private  int x;
        private  int y;

        public Point(int xx,int yy)	//构造方法
        {
            this.x=xx;
            this.y=yy;
        }
        public int getX() {
            return x;
        }
        public int getY() {
            return y;
        }

        //write your code

        public static void fun1(Point p)
        {
            System.out.println(p.getX());
        }

        public static Point fun2()
        {
            Point A =new Point(1,2);
            return A;
        }
    }

    //6.7202
    public static class Complex{
        private int a;
        private int b;
        public Complex(){
            a = 0;
            b = 0;
        }
        public Complex(int a,int b){
            this.a = a;
            this.b = b;
        }
        public Complex(Complex c){
            this.a = c.getA();
            this.b = c.getB();
        }

        public int getA(){return a;}
        public void setA(int a){this.a = a;}
        public int getB(){return b;}
        public void setB(int b){this.b = b;}

        public Complex Add(Complex c){
            this.a = this.a + c.getA();
            this.b = this.b + c.getB();
            return this;
        }
        public Complex Sub(Complex c){
            this.a -= c.getA();
            this.b -= c.getB();
            return this;
        }
        public void Print(){
            if(this.getA()==0 && this.getB()==0){
                System.out.println(0);
            }
            else
                System.out.println(a+"+"+b+"i");
        }
    }

    //7.1342
    public static class Cuboid{
        private int length;
        private int wide;
        private int high;
        public Cuboid(int length, int wide, int high){
            this.length = length;
            this.wide = wide;
            this.high = high;
        }

        public int getLength() {
            return length;
        }

        public void setLength(int length) {
            this.length = length;
        }

        public int getWide() {
            return wide;
        }

        public void setWide(int wide) {
            this.wide = wide;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }

        public static int count_S(Cuboid c){
            return c.getHigh()*c.getLength()*2 + c.getLength() * c.getWide()*2 + c.getWide()*c.getHigh()*2;
        }
        public static int count_V(Cuboid c){
            return c.getHigh()*c.getWide()*c.getLength();
        }
    }

    //8.7203
    public static int count;
    public static class ObjectCounter{
        public ObjectCounter(){
            count += 1;
        }

        public static int getCount(){
            return count;
        }
    }

}
