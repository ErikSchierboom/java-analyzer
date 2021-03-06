class Hamming {
	
	String leftStrand = "";
	String rightStrand = "";
	
    Hamming(String leftStrand, String rightStrand) {
    	if(!(leftStrand.isEmpty() && rightStrand.isEmpty())) {
	    	if(leftStrand.isEmpty()) throw new IllegalArgumentException("left strand must not be empty.");
	    	if(rightStrand.isEmpty()) throw new IllegalArgumentException("right strand must not be empty.");
    	}
    	if(leftStrand.length() != rightStrand.length()) throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");

    		this.leftStrand = leftStrand;
    		this.rightStrand = rightStrand;
    }

    int getHammingDistance()   {
    	if(leftStrand.contentEquals(rightStrand)) return 0;

    	int hammingDistance = 0;
    	
    	for(int i = 0; i < leftStrand.length(); i++) {
    		if(leftStrand.charAt(i) != rightStrand.charAt(i)) hammingDistance++;
    	}
    	
    	return hammingDistance;
    }

}
