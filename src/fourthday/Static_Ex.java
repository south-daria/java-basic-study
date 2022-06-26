package fourthday;

class Num{
    static int num = 0; //클래스 필드
    int num2 = 0; //인스턴스 필드
}

class SouthKoreaPerson{
    static String nation;
    String name;
    int age;

    static String getNation(){
        return nation;
    }
}

public class Static_Ex {
    public static void main(String[] args) {
        Num a = new Num(); //첫번째 number
        Num b = new Num(); //두번째 number

        a.num++; //클래스 필드 num을 1증가시킴
        a.num2++; //인스턴스 필드 num을 1증가시킴
        System.out.println(b.num); //두번째 number의 클래스 필드 출력
        System.out.println(b.num2); //두번째 number의 인스턴스 필드 출력
        System.out.println(Num.num);

//        SouthKoreaPerson njy = new SouthKoreaPerson();
//        njy.age = 21;
//        njy.name = "jungyun";
//        njy.nation = "south korea";
//
//        SouthKoreaPerson ljh = new SouthKoreaPerson();
//        ljh.age = 33;
//        ljh.name = "junghyuk";
//        ljh.nation = "korea";
//
//        System.out.println(njy.name + njy.age + njy.nation);
//        System.out.println(ljh.name + ljh.age + ljh.nation);
//        SouthKoreaPerson.nation = "korea";
        System.out.println(SouthKoreaPerson.getNation());
    }
}