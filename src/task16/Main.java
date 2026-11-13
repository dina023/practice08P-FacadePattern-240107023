package task16;
public class Main {
    public static void main(String[] args) {
        GameLevelFacade game = new GameLevelFacade(new AssetLoader(), new TextureCache(), new PhysicsEngine(), new AudioMixer(), new SaveStateReader());
        game.loadLevel(1, "Slot_A");
        game.loadLevel(2, "Slot_A");
        game.unloadCurrentLevel();
    }
}
