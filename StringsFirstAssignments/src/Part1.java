public class Part1 {

    public String findSimpleGene(String dna) {
        String result = "";
        int startIndex = dna.indexOf("ATG");
        if (startIndex == -1) {
            return "";
        }
        int endIndex = dna.indexOf("TAA", startIndex + 3);
        if (endIndex == -1) {
            return "";
        }
        if ((startIndex - endIndex) % 3 == 0) {
            result = dna.substring(startIndex, endIndex + 3);
        }
        return result;
    }

    public void testSimpleGene() {
        String dna = "LOPMYQAUXNABATGAVAKULXNBTAAAOQPAMZQT";
        System.out.println("DNA strand is: " + dna);
        String gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);

        dna = "ATGVADVJHAFNVAK"; // missing TAA
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);

        dna = "DKFANVADUIWOAWOZXMVATAA"; // missing ATG
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);

        dna = "ATGWAXZLOPWTAA"; // Don't have the correct codons (3 nucleotides)
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);

        dna = "WAXZLOPWTAWALJKVAPIUWFVMLADFLJ"; // missing ATG and TAA
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna);
        System.out.println("Gene is: " + gene);

    }
}
