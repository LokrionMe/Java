package Homework.homework6;

public class Computer {
    Double CPU;
    String GPU;
    Integer SSD;
    Integer RAM;
    Integer HDD;
    String OS;
    
    Computer (double C, String G, int S, int R, int H, String os) { 
        CPU = C;
        GPU = G;
        SSD = S;
        RAM = R;
        HDD = H;
        OS = os;
    }
    @Override
    public String toString () {
        String a = "Processor: " + CPU + " GHz\n"+"Graphic card: " + GPU + "\n"+"SSD: " + SSD + " Gb\n"+"RAM: " + RAM + " Gb\n"+
        "HDD: " + HDD + " Gb\n"+"OS: " + OS + "\n";
        return a;
    }
    
}
