package StudentManager;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static void main(String[] args) {
        //创建集合对象，用于存储学生数据
        ArrayList<Student> array=new ArrayList<Student>();
        while (true) {
            System.out.println("--------欢迎来到学生管理系统--------");
            System.out.println("1 添加学生");
            System.out.println("2 删除学生");
            System.out.println("3 修改学生");
            System.out.println("4 查看所有学生");
            System.out.println("5 退出");
            System.out.println("请输入你的选择：");
            Scanner sc = new Scanner(System.in);
            String line = sc.nextLine();
            switch (line) {
                case "1":
                    //System.out.println("添加学生");
                    addStudent(array);
                    break;
                case "2":
                    //System.out.println("删除学生");
                    deleteStudent(array);
                    break;
                case "3":
                    //System.out.println("修改学生");
                    updateStudent(array);
                    break;
                case "4":
                    //System.out.println("查看所有学生");
                    findAllStudent(array);
                    break;
                case "5":
                    System.out.println("谢谢使用");
                    //break;
                    System.exit(0);//JVM退出
            }
        }
    }
    //定义一个方法，用于添加学生信息
    public static void addStudent(ArrayList<Student> array){
        Scanner sc =new Scanner(System.in);
        //键盘录入信息
        String sid;//为了在while循环外可以访问
        //为了使程序可以回到这里，使用循环实现
        while (true) {
            System.out.println("请输入学生学号");
            sid = sc.nextLine();

            boolean flag = isUsed(array, sid);
            if (flag) {
                System.out.println("你输入的学号已经被使用，请重新输入！");
            }else {
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name=sc.nextLine();
        System.out.println("请输入学生年龄");
        String age=sc.nextLine();
        System.out.println("请输入学生居住地");
        String address=sc.nextLine();
        //创建学生对象，把键盘录入的数据赋值给学生对象的成员变量
        Student s =new Student();
        s.setSid(sid);
        s.setName(name);
        s.setAge(age);
        s.setAdderss(address);
        //将学生对象添加到集合中
        array.add(s);
        //给出添加成功提示
        System.out.println("添加学生成功");
    }
    //定义一个方法，用于查看学生信息
    public static void findAllStudent(ArrayList<Student> array){
        //判断集合中是否有数据，如果没有显示提示信息
        if (array.size()==0){
            System.out.println("无信息，请先添加信息后在查询！");
            return;//为了不让程序往下执行
        }
        //显示表头信息  \t tab键
        System.out.println("学号\t姓名\t年龄\t居住地");
        //将集合中数据取出按照对应的格式显示学生信息，年龄显示补充“岁”
        for (int i=0;i<array.size();i++){
            Student s = array.get(i);
            System.out.println(s.getSid()+"\t\t"+s.getName()+"\t"+s.getAge()+"岁\t"+s.getAdderss());
        }
    }
    //定义一个方法，用于删除学生信息
    public static void deleteStudent(ArrayList<Student> array){
        //键盘录入要删除的学生学号，显示提示信息
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要删除的学生的学号：");
        String sid = sc.nextLine();
        int index=-1;
        //遍历集合将对应学生对象从集合中删除
        for (int i = 0 ;i<array.size();i++){
            Student s =array.get(i);
            if (s.getSid().equals(sid)){
                //array.remove(i);
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("该信息不存在，请重新输入！");
        }else {
            array.remove(index);
            //给出删除成功提示
            System.out.println("删除学生成功！");
        }
    }
    //定义一个方法，用于修改学生信息
    public static void updateStudent(ArrayList<Student> array){
        //键盘录入要修改的学生学号，显示提示信息
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入你要修改的学生学号：");
        String sid = sc.nextLine();
        int index = -1;
        for (int i=0;i<array.size();i++){
            Student s=array.get(i);
            if (s.getSid().equals(sid)){
                index=i;
                break;
            }
        }
        if (index==-1){
            System.out.println("该信息不存在，请重新输入！");
        }else {
            //键盘录入要修改的学生信息
            System.out.println("请输入学生新姓名：");
            String name = sc.nextLine();
            System.out.println("请输入学生新年龄：");
            String age = sc.nextLine();
            System.out.println("请输入学生新居住地：");
            String address = sc.nextLine();
            //创建学生对象
            Student s = new Student();
            s.setSid(sid);
            s.setName(name);
            s.setAge(age);
            s.setAdderss(address);
            //遍历集合修改对应的学生信息
            for (int i = 0; i < array.size(); i++) {
                Student student = array.get(i);
                if (student.getSid().equals(sid)) {
                    array.set(i, s);
                    break;
                }
            }
            //给出修改成功提示
            System.out.println("修改学生信息成功！");
        }
    }
    //定义一个方法，对学号是否被使用进行判断
    public static boolean isUsed(ArrayList<Student> array,String sid){
        boolean flag=false;
        for (int i =0;i<array.size();i++){
            Student s =array.get(i);
            if (s.getSid().equals(sid)){
                flag=true;
                break;
            }
        }
        return flag;
    }
}
