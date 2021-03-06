import java.util.stream.IntStream;

class Hamming {

    private String leftStrand;
    private String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        if (leftStrand == null || (leftStrand.length() == 0 && rightStrand.length() > 0)) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (rightStrand == null || (rightStrand.length() == 0 && leftStrand.length() > 0)) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    int getHammingDistance() {
        return (int) IntStream.range(0, leftStrand.length())
                              .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                              .count();
    }

}
