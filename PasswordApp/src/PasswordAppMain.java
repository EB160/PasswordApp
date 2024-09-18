
public class PasswordAppMain {
	private int largestBlock;
	
	public int findLongestBlock(String s) {
		largestBlock = 1;
		int currentBlockLength = 1;
		char c;
		for (int i = 0; i < s.length() - 1; i++) {
			c = s.charAt(i);
			if(c == s.charAt(i + 1)) {
				currentBlockLength++;
			} else {
				if (currentBlockLength > largestBlock) {
					largestBlock = currentBlockLength;
				}
				currentBlockLength = 1;
			}
			
		}
		return Math.max(largestBlock, currentBlockLength);
	}
}
