package duotai;

public class person {
    private int age;
    private  String name;
 public person(){

 }
 public person(int age,String name){
     this.age = age;
     this.name = name;
 }
 public void dl(){
     System.out.println("nihao");
 }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
