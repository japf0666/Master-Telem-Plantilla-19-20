package response;

import java.io.Serializable;

public class MatrixDTO implements Serializable {
	
	int [][] m = new int[0][0];
	
	public int[][] getM() {
		return m;
	}

	public void setM(int[][] m) {
		this.m = m;
	}

	public MatrixDTO() {}
	
	public MatrixDTO(int [][] matrix) {
		m = new int[matrix.length][matrix[0].length];
	}
	
}
