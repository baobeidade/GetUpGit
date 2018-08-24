public class Demo {

    private   String medor;

    public static void main(String[] args) {
        Demo a = new Demo();
        a.a();
        Demo b = new Demo();
        b.b();
    }
    public void a(){
        medor="aaaa";
        System.out.println(medor);
    };
    public void b(){

        System.out.println(medor);
    };

}
