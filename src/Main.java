public class Main {


    public static void main(String[] args) {

        Trinity a = new Trinity("sdfk", "asdasdad", "as");

        System.out.println(a.getFirst() + " " + a.getSecond() + " " + a.getThird());
        a.setSecond("adasdas");
        System.out.println(a.getFirst() + " " + a.getSecond() + " " + a.getThird());


    }
}
