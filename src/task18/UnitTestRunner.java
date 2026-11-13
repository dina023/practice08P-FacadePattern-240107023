package task18;
public class UnitTestRunner {
    public StageResult runTests(String b) {
        if (b.contains("broken")) return new StageResult(false, "UnitTests", "Unit tests failed on " + b);
        return new StageResult(true, "UnitTests", "All tests passed.");
    }
}
