package task14;
public class ProfileRegistry {
    private int nextId = 1001;
    public String createProfile(String name, int age) { return "GYM-" + (nextId++); }
}
