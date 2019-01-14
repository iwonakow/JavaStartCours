public class Computer {
    String processor;
    int memory;
    //Konstruktory służą do tworzenia nowych obiektów, muszą mieć taką samą nazwę jak nazwa klasy, nic nie zwracają ani nie mają typu void.l
    Computer(String proc, int mem){
        processor = proc;
        memory = mem;
    }

    void printInfo(){
        System.out.println(processor + " " + memory);
    }
}
