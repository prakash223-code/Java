interface Father{
    abstract void Gender();
}
interface Mother{
    abstract void Gender();
}
class Son implements Father,Mother{
    public void Gender(){
        System.out.println("Male");
    }
}
class Daughter implements Father,Mother{
    public void Gender(){
        System.out.println("Female");
    }
}
class Main {
    public static void main(String[] args) {
        Son son=new Son();
        son.Gender();
        
        Daughter daughter=new Daughter();
        daughter.Gender();
    }
}
