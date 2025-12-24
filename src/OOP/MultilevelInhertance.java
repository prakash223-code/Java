class GrandFather{
    String gender="Male";
    
    void print(){
        System.out.println(gender);
    }
}
class Mother extends GrandFather{
     String gender="Female";
}
class Daughter extends Mother{
    void display(){
        System.out.println(gender);
    }
}
class Main {
    public static void main(String[] args) {
      Daughter child=new Daughter();
      child.display();
    }
}
