public class Part2 {
    public String findSimpleGene(String dna, int startCodon, int endCodon) {
        String geneResult = "";

        startCodon = dna.indexOf("ATG");
        if (startCodon == -1) {
            return "";
        }
        endCodon = dna.indexOf("TAA", startCodon + 3);
        if (endCodon == -1) {
            return "";
        }
        if ((startCodon - endCodon) % 3 == 0) {
            geneResult = dna.substring(startCodon, endCodon + 3);
        }

        return geneResult;
    }

    public void testSimpleGene() {
        String dna = "adlfkjwatgadadflkjwialtaaadfkjw";
        System.out.println("DNA strand is: " + dna);
        String gene = findSimpleGene(dna.toUpperCase(), 0, 0);
        if (dna == dna.toLowerCase()) {
            System.out.println("Gene is: " + gene.toLowerCase());
        } else {
            System.out.println("Gene is: " + gene);
        }

        dna = "ATGVADVJHAFNVAK"; // missing TAA
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna, 0, 0);
        System.out.println("Gene is: " + gene);

        dna = "DKFANVADUIWOAWOZXMVATAA"; // missing ATG
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna, 0, 0);
        System.out.println("Gene is: " + gene);

        dna = "ATGWAXZLOPWTAA"; // Don't have the correct codons (3 nucleotides)
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna, 0, 0);
        System.out.println("Gene is: " + gene);

        dna = "WAXZLOPWTAWALJKVAPIUWFVMLADFLJ"; // missing ATG and TAA
        System.out.println("DNA strand is: " + dna);
        gene = findSimpleGene(dna, 0, 0);
        System.out.println("Gene is: " + gene);
    }


}
