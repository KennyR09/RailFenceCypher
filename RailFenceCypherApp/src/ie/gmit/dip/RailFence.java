package ie.gmit.dip;

public class RailFence {
	private char[][] metrix = null;
	private int offset;
	public int key;
	public String encrypt;
	public String decrypt;

	public RailFence(int key, int offset, int col) {// key = rows , length(text) = columns
		metrix = new char[key][col]; // matrix to cipher plain text
		for (int i = 0; i < metrix.length; i++) { // i = key, i++ to loop over rows
			for (int j = 0; j < metrix[i].length; j++) {// j = col, j++ to loop over text
				metrix[i][j] = '\n';

				boolean dir = false; // follow control, find the direction
				if (key == 0 || key == key - 1) {
					dir = !dir;
				}

			}
		}
	}

	public String encrypt(String plainText) {
		for (int row = 0; row < metrix.length; row++) {
			if (metrix[row][0] == key) {
				for (int col = 0; col < metrix.length; col++) {
					if (metrix[0][col] == key) {
						// return metrix[row][col];
					}
				}
			}
		}
		return plainText;
	}

	public String decrypt(String cypherText) {
		for (int col = 0; col < metrix[0].length; col++) {
			if (metrix[0][col] == key) {
				for (int row = 0; row < metrix.length; row++) {
					if (metrix[row][col] == key) {
						// return metrix[row][0];
					}
				}
			}
		}
		return cypherText;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public char[][] getMetrix() {
		return metrix;
	}

	public String getEncrypt() {
		return encrypt;
	}

	public String getDecrypt() {
		return decrypt;
	}

}
