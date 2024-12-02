package Day13.Num2;

public class Students extends Person{
    String classNum;
    public Students(){}
    public Students(String name,int age,String classNum){
        super(name,age);
        this.classNum=classNum;
    }
    public void write(){
        System.out.println("write");
    }
    public String getClassNum() {
        return classNum;
    }

    public void setClassNum(String classNum) {
        this.classNum = classNum;
    }
}
