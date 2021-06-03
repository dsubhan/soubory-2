import java.io.*;
import java.util.Arrays;
import java.util.Random;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][][] triD = new int[100][100][100];
		int[][][] dspole = null;
		
		Random rnd = new Random();
		
		for(int i = 0; i<triD.length; i++) {
			for(int j = 0; j<triD[i].length; j++) {
				for(int k = 0; k< triD[i][j].length; k++){
					triD[i][j][k] = (int)(Math.random()*100);
				}
			}
		}
		
		try {
			FileOutputStream fos = new FileOutputStream("test.dat");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(triD);

			FileInputStream fis = new FileInputStream("test.dat");
			ObjectInputStream ois = new ObjectInputStream(fis);
			dspole = (int[][][]) ois.readObject();
		} 
		catch (Exception e) {

		}
		
		for(int[][] row: dspole) {
			for(int[] rowColumn : row) {
				System.out.println(Arrays.toString(rowColumn));
			}
		}

	}

}
