public class InsertionSort implements Sorter {
    public void sort(int[] bizarroInput) {
        for (int quux = 1; quux < bizarroInput.length; quux++) {
            int zap = bizarroInput[quux];
            int fizzBuzz = quux - 1;
            while (fizzBuzz >= 0 && bizarroInput[fizzBuzz] > zap) {
                bizarroInput[fizzBuzz + 1] = bizarroInput[fizzBuzz];
                fizzBuzz--;
            }
            bizarroInput[fizzBuzz + 1] = zap;
        }
    }
}
