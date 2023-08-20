public class AppleHeavyPredicate implements ApplePredicate{
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight()>200;
    }

    @Override
    public boolean weight(Apple apple) {
        return apple.getWeight()>80;
    }
}
