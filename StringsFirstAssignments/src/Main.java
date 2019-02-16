public class Main {

    public static void main(String[] args) {

        Part1 firstGeneTest = new Part1();
        firstGeneTest.testSimpleGene();

        Part2 secondGeneTest = new Part2();
        secondGeneTest.testSimpleGene();

        Part3 occurance = new Part3();
        occurance.testing();
        System.out.println(occurance.lastPart("by", "byebye"));
        System.out.println(occurance.lastPart("zoo", "forest"));

        Part4 testing = new Part4();
        testing.urlResource();
    }
}
