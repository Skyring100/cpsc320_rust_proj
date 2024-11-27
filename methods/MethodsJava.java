public class IfJava {
   public static int test(int param1, int param2, char param3, char param4){
       System.out.printf("The two characters are %c, %c\n", param3, param4);
       int answer = param1 + param2;
       return answer;
   }
   public static void main(String[] args) {
       int w = 5;
       int x = 6;
       char y = 'd';
       char z = 'c';
       int ans = test(w,x, y,z);
       System.out.printf("Adding the two numbers makes %d\n", ans);
   }
}

