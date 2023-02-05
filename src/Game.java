public class Game {
    public static void main(String[] args) {
        Player anotherWorld = new Player();
        
        anotherWorld.name = "Pann";
        anotherWorld.speed = 100;
        anotherWorld.healthPoin = 0;
        
        anotherWorld.Run();
        if(anotherWorld.isDead()){
            System.out.println("Game Over");
        }
    }
}
