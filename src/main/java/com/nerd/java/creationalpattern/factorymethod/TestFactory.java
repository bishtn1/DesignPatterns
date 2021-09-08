package main.java.com.nerd.java.creationalpattern.factorymethod;

public class TestFactory {
    public static void main(String args[]){
      Computer pc=FactoryPattern.getComputer("PC","3gb", "2.4 GHz","500 GB");
      Computer sever=FactoryPattern.getComputer("Server","24gb", "2.9 GHz","500 TB");
        System.out.println("Factory PC config: "+pc);
        System.out.println("Factory Server config: "+sever);
    }
}
