public class Main {
    public static void main(String[] args) {
        Student student1=new Student("Nurbek bk",38,1.50,85);
        Student student2=new Student("Elmir",17,1.80,60);
        Student student3=new Student("Bektur",24,1.67,88);
        if(student2.getAge()>student1.getAge() && student2.getAge()>student3.getAge()) {
            System.out.println("самый старший: "+student1.getAge());
        }else if(student1.getAge()>student2.getAge() && student1.getAge() > student3.getAge() ){
            System.out.println("самый младший: "+student2.getAge());
        }else{
            System.out.println(student3);
        }



    }
}