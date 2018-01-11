import java.util.ArrayList;
import java.util.Random;
public class randomZeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> numsRandom = new ArrayList<>();
		Random gen = new Random();
		int num = 0;
		for(int i = 0; i < 10; i++){
			num = gen.nextInt(100)+1;
			numsRandom.add(num);
		}
		System.out.println("Generated List: " + numsRandom);
		for(int i = 0; i < numsRandom.size(); i++){
			numsRandom.set(i, 0);
		}
		System.out.println("Modified List: " + numsRandom);
	}

}
