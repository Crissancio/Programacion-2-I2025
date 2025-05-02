package Clase0205.computadora;

public class PC {
    public CPU cpu;
    public RAM ram[];
    public Memoria almacenamiento;
    public TarjetaMadre tarjetaMadre;
    public FuenteDePoder fuente;

    public PC(CPU cpu, RAM ram[], Memoria almacenamiento, TarjetaMadre tarjetaMadre, FuenteDePoder fuente) {
        this.cpu = cpu;
        this.ram = ram;
        this.almacenamiento = almacenamiento;
        this.tarjetaMadre = tarjetaMadre;
        this.fuente = fuente;
    }

    public void mostrar() {
        System.out.println("----------INFO PC----------");
        cpu.mostrar();
        for(int i = 0; i < this.ram.length; i++){
            if(this.ram[i] != null){
                this.ram[i].mostrar();
            }
        }
        almacenamiento.mostrar();
        tarjetaMadre.mostrar();
        fuente.mostrar();
        System.out.println("----------------------------");
    }

    public void cambiarCPU(CPU nuevaCPU){
        if(this.tarjetaMadre.getSocketCPU().equals(nuevaCPU.getSocket())){
            this.cpu = nuevaCPU;
            System.out.println("Cpu cambiado correctamente");
        }else{
            System.out.println("ERROR: EL CPU Y LA TARJETA MADRE DEL EQUIPO NO SON COMPATIBLES");
            System.out.println("SOCKET NUEVO CPU: "+ nuevaCPU.getSocket());
            System.out.println("SOCKET T. MADRE: "+ tarjetaMadre.getSocketCPU());
        }
    }

    /*
    public void cambiarRAM(RAM nuevaRAM){
        if(this.tarjetaMadre.getV_drr() == nuevaRAM.getV_drr()){
            this.ram = nuevaRAM;
            System.out.println("La RAM ha sido cambiada correctamente");   
        }else{
            System.out.println("ERROR: LA RAM Y LA TARJETA MADRE DEL EQUIPO NO SON COMPATIBLES");
            System.out.println("VERSION DDR NUEVA RAM: "+ nuevaRAM.getV_drr());
            System.out.println("VERSION DDR T. MADRE: "+ tarjetaMadre.getV_drr());
        }
    }
    */

    public void cambiarRam(RAM nuevaRAM, int i){
        if(this.ram[i] != null){
            //cambio
            if(this.tarjetaMadre.getV_drr() == nuevaRAM.getV_drr()){
                this.ram[i] = nuevaRAM;
            }else{
                System.out.println("ERROR: LA RAM Y LA TARJETA MADRE DEL EQUIPO NO SON COMPATIBLES");
                System.out.println("VERSION DDR NUEVA RAM: "+ nuevaRAM.getV_drr());
                System.out.println("VERSION DDR T. MADRE: "+ tarjetaMadre.getV_drr());
            }
        }else{
            System.out.println("SLOT "+i+" VACIO");
        }
    }
}
