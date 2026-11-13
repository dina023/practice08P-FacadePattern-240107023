package task14;
public class Main {
    public static void main(String[] args) {
        GymOnboardingFacade gym = new GymOnboardingFacade(new ProfileRegistry(), new HealthScreening(), new LockerAssigner(), new AccessCardIssuer());
        System.out.println(gym.registerNewMember("Alikhan", 15, true));
        System.out.println(gym.registerNewMember("Ruslan", 24, true));
    }
}
