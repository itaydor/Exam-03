public class EvenIntSet2 extends AbstractIntSet{

    @Override
    public boolean isValid(int num) throws IllegalArgumentException{
        if(num % 2 == 0){
            throw new IllegalArgumentException(num + " is not odd.");
        }
        return true;
    }
}
