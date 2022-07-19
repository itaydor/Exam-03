public class IntSetN extends AbstractIntSet{

    private int n;

    public IntSetN(int n){
        this.n = n;
    }

    @Override
    public boolean isValid(int num) throws IllegalArgumentException{
        if(num <= n){
            throw new IllegalArgumentException(num + " is not bigger then N - " + n);
        }
        return true;
    }
}
