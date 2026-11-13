package task16;
public class GameLevelFacade {
    private final AssetLoader al; private final TextureCache tc; private final PhysicsEngine pe;
    private final AudioMixer am; private final SaveStateReader sr; private int currentLevel = -1;
    public GameLevelFacade(AssetLoader al, TextureCache tc, PhysicsEngine pe, AudioMixer am, SaveStateReader sr) {
        this.al = al; this.tc = tc; this.pe = pe; this.am = am; this.sr = sr;
    }
    public void loadLevel(int levelNumber, String saveSlot) {
        if (currentLevel != -1) unloadCurrentLevel();
        al.loadGeometry(levelNumber); tc.cacheTextures(levelNumber); pe.initializeBounds(levelNumber);
        am.queueMusic(levelNumber); sr.readCheckpoint(saveSlot); currentLevel = levelNumber;
    }
    public void unloadCurrentLevel() {
        if (currentLevel == -1) return;
        am.stopAllAudio(); pe.resetState(); tc.clearCache(); al.releaseGeometry(); currentLevel = -1;
    }
}
