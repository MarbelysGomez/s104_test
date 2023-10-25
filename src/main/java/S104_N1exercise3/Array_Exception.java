package S104_N1exercise3;

public class Array_Exception {
    public void throwException(int index) {
        int[] array = {1,2,3,4,5};

        try {
            System.out.println(array[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index: " + index);
            throw  e;
        }
    }
}

