package Day08;


public class Cat {
    private String  color;
    private String breed;

    public Cat() {
    }
    public Cat(String color, String breed){
        this.color=color;
        this.breed=breed;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setBreed(String breed){
        this.breed=breed;
    }
    public String getColor(){
        return color;
    }

    public String getBreed() {
        return breed;
    }
    public void eat(){
        System.out.printf("%s的%s正在吃鱼",color,breed);
        System.out.println();
    }
    public void catchMouse(){
        System.out.printf("%s的%s正在抓鼠",color,breed);
        System.out.println();
    }
}
