package packone;

public class C3 extends  C1{
    public class C2 {
        public static void main(String[] args) {
            C1 c1 = new C1();
            c1.disp();
            System.out.println(c1.x); // visible cause x is default now and c2 and c1 are in same package

        }
    }

}
