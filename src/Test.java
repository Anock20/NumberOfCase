
public class Test {
    public static int recur(int n) {
        if (n < 3 || n == 4) return -1; // 만들 수 없는 경우 -1
        if (n == 3 || n == 5) return 1;
        int count3 = recur(n - 3); //재귀함수
        int count5 = recur(n - 5);
        int total = 0;
        if (count3 != -1) { // -1인 경우를 제외하고 total에 값을 더해줌
            total += count3;
        }
        if (count5 != -1) { // -1인 경우를 제외하고 total에 값을 더해줌
            total += count5;
        }
        if(total==0) total--; // 만들 수 없는 경우 -1
        return total;
    }
    public static void testRecur(int n){
       int a = recur(n);
       System.out.println(a);
    }
    public static void main(String[] args) {
        testRecur(13);
        testRecur(5);
        testRecur(7);
        testRecur(20);
    }
}