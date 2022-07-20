package buoi5;

public interface Subject {
    void register(Observers o);
    void removeObservers(Observers o);
    void notifyObservers();
}
