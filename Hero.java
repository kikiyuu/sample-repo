public class Hero {
    String name = "勇者";
    int hp = 150;

    // 戦う
    // public void attack(Slime s) {
    //     System.out.println(this.name + "の攻撃");
    //     s.hp -= 10;
    //     System.out.println("スライム" + s.suffix + "にダメージを与えた"); 
    // }

    // 逃げる
    public void run() {
        System.out.println(this.name + "は逃げ出した");
    }


}

