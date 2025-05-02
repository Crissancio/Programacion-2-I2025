package Clase0205.computadora;

public class TarjetaMadre {
    public int bios;
    public String socketCPU;
    public int v_ddr;
    public int numSlotsRAM;
    public float maxRam;

    public TarjetaMadre(int bios, String socketCPU, int v_ddr, int numSlotsRAM, float maxRam) {
        this.bios = bios;
        this.socketCPU = socketCPU;
        this.v_ddr = v_ddr;
        this.numSlotsRAM = numSlotsRAM;
        this.maxRam = maxRam;
    }

    public void mostrar() {
        System.out.println("----------INFO TARJETA MADRE----------");
        System.out.println("BIOS: " + bios);
        System.out.println("Socket CPU: " + socketCPU);
        System.out.println("DDR: " + v_ddr);
        System.out.println("Numero de slots RAM: " + numSlotsRAM);
        System.out.println("Maximo RAM: " + maxRam);
        System.out.println("--------------------------------------");
    }

    public String getSocketCPU(){
        return this.socketCPU;
    }

    public int getV_drr(){
        return this.v_ddr;
    }
}
