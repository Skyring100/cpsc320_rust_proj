class MyObject{
    int var1;
    int var2;
    int addVars(){
        return this.var1 + this.var2;
    }
}

public class ObjectsJava {
   public static void main(String[] args) {
        MyObject obj = new MyObject();
        System.out.printf("Adding %d and %d equals %d", obj.var1, obj.var2, obj.addVars());
   }
}