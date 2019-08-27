class Hamming {

    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {

        if (leftStrand.length() != rightStrand.length()) {

            if (rightStrand.isEmpty()) {
                throw new IllegalArgumentException("right strand must not be empty.");
            }

            if (leftStrand.isEmpty()) {
                throw new IllegalArgumentException("left strand must not be empty.");
            }

            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.hammingDistance = 0;
        for (int i = 0; i < leftStrand.length(); i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                this.hammingDistance++;
            }
        }
    }

    int getHammingDistance() {
        return this.hammingDistance;
    }

}
