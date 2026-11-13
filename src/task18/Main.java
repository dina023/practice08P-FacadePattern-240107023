package task18;
public class Main {
    public static void main(String[] args) {
        DeploymentFacade df = new DeploymentFacade(new GitRepoFetcher(), new CompilerService(), new UnitTestRunner(), new ArtifactPackager(), new StagingServer());
        System.out.println(df.deployBuild("main"));
        System.out.println(df.deployBuild("feature-broken"));
    }
}
