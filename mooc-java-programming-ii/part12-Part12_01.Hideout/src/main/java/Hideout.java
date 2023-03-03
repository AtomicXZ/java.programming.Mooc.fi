public class Hideout<T> {
    private T hideout;

    public void putIntoHideout(T toHide) {
        hideout = toHide;
    }

    public T takeFromHideout() {
        T toReturn = hideout;
        hideout = null;
        return toReturn;
    }

    public boolean isInHideout() {
        return !(hideout == null);
    }
}
