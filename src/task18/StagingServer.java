package task18;
public class StagingServer {
    private String version = "v1.4.2-stable";
    public StageResult deploy(String b) { version = "v1.5.0-" + b; return new StageResult(true, "Deploy", "Deployed " + version); }
    public String getVersion() { return version; }
}
