package task18;
import java.util.List;
public record DeploymentReport(boolean deployed, String activeServerVersion, List<StageResult> executedStages) {}
