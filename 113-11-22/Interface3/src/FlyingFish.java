public class FlyingFish extends Fish implements Flyer {
    public FlyingFish(String name) {
        super(name);
    }
    
    @Override
    public void swim() {
        System.out.println("飛魚游泳");
    }


    @Override
    public void fly() {
        System.out.println("飛魚會飛");
    }

    public void  torpedo(){
        System.out.printf("甚平 %s 會飛%n",name);
    }
}