public class SetApplication {

    public static IntSet clone(IntSet rs){
        IntSet temp = new IntSet();
        IntSet clone = new IntSet();

        while (rs.size() > 0){
            int num = rs.findBiggest();
            rs.remove(num);
            temp.insert(num);
            clone.insert(num);
        }

        while (temp.size() > 0){
            rs.insert(temp.findBiggest());
            temp.remove(temp.findBiggest());
        }

        return clone;
    }

    public static IntSet buildNeg(IntSet rs){
        IntSet temp = clone(rs);
        IntSet negSet = new IntSet();

        while (temp.size() > 0){
            int num = temp.findBiggest();
            temp.remove(temp.findBiggest());
            if(num < 0){
                negSet.insert(num);
            }
        }

        return negSet;
    }
}
