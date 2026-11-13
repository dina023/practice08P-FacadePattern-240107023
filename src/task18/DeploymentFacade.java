package task18;
import java.util.*;
public class DeploymentFacade {
    private final GitRepoFetcher f; private final CompilerService c; private final UnitTestRunner t;
    private final ArtifactPackager p; private final StagingServer s;
    public DeploymentFacade(GitRepoFetcher f, CompilerService c, UnitTestRunner t, ArtifactPackager p, StagingServer s) {
        this.f = f; this.c = c; this.t = t; this.p = p; this.s = s;
    }
    public DeploymentReport deployBuild(String branchName) {
        List<StageResult> stages = new ArrayList<>();
        for (StageResult r : List.of(f.fetch(branchName), c.compile(branchName), t.runTests(branchName))) {
            stages.add(r);
            if (!r.success()) return new DeploymentReport(false, s.getVersion(), stages);
        }
        StageResult pkg = p.packageJar(branchName); stages.add(pkg);
        if (!pkg.success()) return new DeploymentReport(false, s.getVersion(), stages);
        StageResult dep = s.deploy(branchName); stages.add(dep);
        return new DeploymentReport(dep.success(), s.getVersion(), stages);
    }
}
