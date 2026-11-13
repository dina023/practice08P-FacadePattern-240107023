package task18;
public class GitRepoFetcher {
    public StageResult fetch(String b) { return new StageResult(true, "Fetch", "Fetched branch " + b); }
}
