public class EvenIntSet1 extends IntSet{

    @Override
    public void insert(int num) throws IllegalArgumentException {
        if(num % 2 == 0){
            throw new IllegalArgumentException("Illegal action! - cannot insert even number to this set.");
        }
        super.insert(num);
    }

    @Override
    public String toString() {
        IntSet clone = SetApplication.clone(this);
        String result = "";
        while (clone.size() > 0){
            result += clone.findBiggest() + " ";
            clone.remove(clone.findBiggest());
        }
        return result;
    }
}
