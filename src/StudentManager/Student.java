package StudentManager;

public class Student {
    private String sid;
    private String name;
    private String age;
    private String adderss;

    public Student(){ //Alt+Insert 自动生成
    }
    public Student(String sid,String name,String age,String adderss){
        this.sid=sid;
        this.name=name;
        this.age=age;
        this.adderss=adderss;
    }
    public String getSid(){return sid;}
    public String setSid(String sid){this.sid=sid;return sid;}
    public String getName(){return name;}
    public void  setName(String name){this.name=name;}
    public String getAge(){return age;}
    public void setAge(String age){this.age=age;}
    public String getAdderss(){return adderss;}
    public void setAdderss(String adderss){this.adderss=adderss;}
}
