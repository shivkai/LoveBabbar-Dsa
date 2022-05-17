package mediumQuestions;

import java.util.Arrays;

public class EliminateMaxMonsters {

	public static void main(String[] args) {
		int dis[] = {1,1,2,3};
		int speed[] = {1,1,1,1};
		
		for(int i=0;i<dis.length;i++)
		{
			speed[i]= (int)Math.ceil(dis[i]/(double)speed[i]);
		}
		Arrays.sort(speed);
		int time = 0,kill=0;
		for(int i=0;i<dis.length;i++)
		{
			if(speed[i]<=time)
			{
				break;
			}
			time++;
			kill++;
		}
		System.out.println(kill);
	}

}
