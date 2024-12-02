package Day09;



public class Q4 {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student stu1=new Student(1,"张三",18);
        Student stu2=new Student(2,"李四",24);
        arr[0]=stu1;
        arr[1]=stu2;
        Student stu3=new Student(2,"陈五",21);

        if (contains(arr,stu3)) {
            if(ifNull(arr)){
                arr[2]=stu3;
                printArr(arr);
            }
        } else {
            System.out.println("学号重复");
        }


    }
    public static void printArr(Student[] arr){
        for(int i=0;i<arr.length;i++){
            System.out.println("Id为"+arr[i].getId()+"，名字为"+arr[i].getName()+",年龄为"+arr[i].getAge());
        }
    }
    public static boolean ifNull(Student[] arr){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==null){
                return true;
            }
        }
        return false;
    }
    public static boolean contains(Student[] arr,Student stu){
        for(int i = 0 ;i<arr.length;i++){
            if (arr[i]!=null) {
                if(stu.getId()==arr[i].getId()){
                    return false;
                }
            }
        }
        return true;
    }
}
