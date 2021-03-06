import java.util.ArrayList;

class Hamming {

    private final String leftStrand;
    private final String rightStrand;

    Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        if(leftStrand.isEmpty() && !rightStrand.isEmpty()){
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if(!leftStrand.isEmpty() && rightStrand.isEmpty()){
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if(leftStrand.length() != rightStrand.length()){
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

    }

    int getHammingDistance() {
        int hammingDistance = 0;

        for(int i = 0; i <= leftStrand.length() - 1; i++){
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) hammingDistance++;
        }
        return  hammingDistance;
    }

}
