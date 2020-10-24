package com.RiZe.Meet.Komposisi;

public class demoComputer {
    public static void main(String[] args) {
        Computer computer = new Computer("Gaming");
        Keyboard keyboard = new Keyboard("Sades", "Mechacincal");
        Mouse mouse = new Mouse("Razer", "800");
        Monitor monitor = new Monitor("Armageddon", "24", "144");
        Cpu cpu = new Cpu("Intel", "Nvidia 3070", "16");

        computer.addComponent(keyboard, mouse, monitor, cpu);

        System.out.println("Type Computer\t: "+computer.getType());
        System.out.println();

        System.out.println("Keyboard\t: ");
        computer.getKeyboard().PrintSpec();

        System.out.println("Mouse\t: ");
        computer.getMouse().printSpec();

        System.out.println("Monitor\t: ");
        computer.getMonitor().printSpec();
        System.out.println();

        System.out.println("Cpu\t: ");
        computer.getCpu().printSpec();


    }
}
