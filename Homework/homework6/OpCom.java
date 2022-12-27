package Homework.homework6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
public class OpCom {
    Map <Integer, Computer> DictComputers = new HashMap<>();
    public static void main(String[] args) {
        OpCom test = new OpCom();
        Computer test1 = new Computer(3.2 , "Nvidia 6 GB", 240, 32, 1000, "Windows 10");
        Computer test2 = new Computer(2.8 , "Radeon 6 GB", 500, 8, 0, "Windows 11");
        Computer test3 = new Computer(2.4 , "Nvidia 4 GB", 1000, 16, 500, "Windows 11");
        Computer test4 = new Computer(3.0 , "Nvidia 2 GB", 1000, 8, 0, "Windows 10");
        Computer test5 = new Computer(3.2 , "Radeon 3 GB", 240, 32, 1000, "Windows 10");
        // System.out.println(test1.toString());
        // System.out.println(test2.toString());
        // System.out.println(test3.toString());
        // System.out.println(test4.toString());
        // System.out.println(test5.toString());
        test.AddComputer(test1);
        test.AddComputer(test2);
        test.AddComputer(test3);
        test.AddComputer(test4);
        test.AddComputer(test5);
        System.out.println(test.SortByRam(17).toString());
        System.out.println();
        System.out.println(test.SortByCPU(3).toString());
        System.out.println();
        System.out.println(test.SortBySSD(700).toString());
        System.out.println();
        System.out.println(test.SortByCPU(1200).toString());
        System.out.println();
        System.out.println(test.SortByOS("Windows 11").toString());
        System.out.println();
        System.out.println(test.SortByGPU("Nvidia").toString());
    }
    public void AddComputer(Computer com){
        int id = DictComputers.keySet().size() + 1;
        DictComputers.put(id, com);
    }
    public List<Computer> SortByRam (Integer minValue) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).RAM >= minValue){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
    public List<Computer> SortByCPU (Integer minValue) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).CPU >= minValue){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
    public List<Computer> SortBySSD (Integer minValue) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).SSD >= minValue){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
    public List<Computer> SortByHDD (Integer minValue) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).HDD >= minValue){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
    public List<Computer> SortByOS (String os) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).OS.contains(os)){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
    public List<Computer> SortByGPU (String gpu) {
        List <Computer> sortDone = new ArrayList<>();
        for (Integer id : DictComputers.keySet()) {
            if (DictComputers.get(id).GPU.contains(gpu)){
                sortDone.add(DictComputers.get(id));
            }
        }
        return sortDone;        
    }
}
        


