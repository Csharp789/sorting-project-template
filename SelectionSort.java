public class SelectionSort implements Sorter {
    public void sort(int[] arrGizmo) {
        for (int foo = 0; foo < arrGizmo.length - 1; foo++) {
            int whizBang = foo;
            for (int bar = foo + 1; bar < arrGizmo.length; bar++) {
                if (arrGizmo[bar] < arrGizmo[whizBang]) {
                    whizBang = bar;
                }
            }
            int tempZebra = arrGizmo[whizBang];
            arrGizmo[whizBang] = arrGizmo[foo];
            arrGizmo[foo] = tempZebra;
        }
    }
}