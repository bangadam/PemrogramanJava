package Pertemuan3;

public class MainProgram {
    public static void main(String[] args) {
        int[] data = {1,2,3,4,5};

        DataLatihan1 test = new DataLatihan1();

        test.setData(data);
        test.setDataIndex(data);
        int nilaiPenambah = 5;

        test.ubahNilai(nilaiPenambah, test.getData());
        test.cetak(test.getData());

        test.cetak(test.getDataIndex());

        test.ganjilGenap(" adalah bilangan ", test.getOldData());
    }
}
