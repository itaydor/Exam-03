public interface ISet {

    int size();

    void insert(int num) throws IllegalArgumentException;

    void remove(int num) throws IllegalArgumentException;

    int findBiggest();
}
