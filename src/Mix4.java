public class Mix4 {
    int counter = 0;

    public static void main(String[] args) {
        int count = 0;
        Mix4 [] m4a = new Mix4[20];
        int x = 0;
        while(x < 9) {
            m4a[x] = new Mix4();
            m4a[x].counter = m4a[x].counter + 1;
            count= count + 1;
            count = count + m4a[x].maybeNew(x);
            x = x + 1;
        }
        System.out.println(count + " " + m4a[1].counter);
    }
    public  int maybeNew(int index) {
        if (index < 5) {
            Mix4 m4 = new Mix4();
            m4.counter = m4.counter + 1;
            return 1;
        }
        return 0;
    }
}
// Варианты кода: (x < 9, index < 5) (x < 20, index < 5) (x < 7, index < 7) (x < 19, index < 1)
// Возможный результат (14 7) (9 5 ) (19 1) (14 1) (25 1) (7 7) (20 1) (20 5)