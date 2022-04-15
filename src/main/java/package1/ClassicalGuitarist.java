package package1;

public  class ClassicalGuitarist extends Guitarist {

    void mozart(){
        System.out.println("Playing mozart");
    };

    @Override
    public void playMusic() {
        System.out.println("Playing Classical Guitar");
    }
}
