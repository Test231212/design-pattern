package ex04;

/**
 * 목적 : 문지기를 메모리에 하나만 올리고 싶다.
 */

public class Doorman {

    public static Doorman instance = new Doorman();

    private Doorman () {}

    public void 쫒아내(Animal a) {
        System.out.println(a.getName() + "를 쫒아내");
    }

}