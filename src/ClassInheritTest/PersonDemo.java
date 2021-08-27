package ClassInheritTest;

public class PersonDemo {
    public static void main(String[] args) {
        //创建老师类对象并进行测试
        Teacher t1 =new Teacher();
        t1.setName("chen");
        t1.setAge(30);
        System.out.println(t1.getName()+","+t1.getAge());
        t1.teach();

        Teacher t2 = new Teacher("pan",18);
        System.out.println(t2.getName()+","+t2.getAge());
        t2.teach();
    }
}
