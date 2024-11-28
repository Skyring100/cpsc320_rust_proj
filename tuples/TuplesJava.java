public class PatternRust {
    public static void main (String[] args) {

        TwoTuple <Boolean, Integer> tuple1 = new TwoTuple<Boolean, Integer>(Boolean.valueOf(true), Integer.valueOf(6));
        TwoTuple <Boolean, Integer> tuple2 = new TwoTuple<Boolean, Integer>(Boolean.valueOf(false), Integer.valueOf(10));

        System.out.println(tupleFunction(tuple1));
        System.out.println(tupleFunction(tuple2));

    }

    public static Integer tupleFunction (TwoTuple<Boolean, Integer> tuple) {
        if (tuple.first) {
            return tuple.second;
        }
        if (!tuple.first) {
            return -1;
        }
        return 0;
    }

    private static class TwoTuple <i, j> {
        final i first;
        final j second;

        TwoTuple (i f, j s) {
            first = f; second = s;
        }

    }

}


