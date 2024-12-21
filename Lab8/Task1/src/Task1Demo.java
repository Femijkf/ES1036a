public class Task1Demo {
    public static void main(String[] args) {
        // creation of two objects of type ProductionWorker
        // takes in the provided variable values as arguments
        ProductionWorker workerOne = new ProductionWorker("John Smith", "123-A", "11-15-2005", 1, 16.50);
        ProductionWorker workerTwo = new ProductionWorker("Joan Jones", "222-L", "12-12-2005", 2, 18.50);

        System.out.println(workerOne);
        System.out.println(workerTwo);

    }
}
