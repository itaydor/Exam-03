public abstract class AbstractIntSet extends IntSet{

    public abstract boolean isValid(int num) throws IllegalArgumentException;

    @Override
    public void insert(int num) throws IllegalArgumentException {
        if(isValid(num)){
            super.insert(num);
        }
    }
}
