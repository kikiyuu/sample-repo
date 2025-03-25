public class SuperHero extends Hero {

    String name = "伝説の勇者";
    int hp = 300;

    // 追加したフィールド
    boolean flying;

    // 飛ぶ
    public void fly() {
        this.flying = true;
        System.out.println(this.name + "は上空に飛んだ");
    }

    // 着手する
    public void land() {
        this.flying = false;
        System.out.println(this.name + "は着地した");
    }

    // 逃げる(オーバーライド)
    public void run() {
        System.out.println(this.name + "は撤退した");
    }

}


