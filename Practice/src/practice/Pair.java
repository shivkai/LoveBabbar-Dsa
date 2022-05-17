package practice;

public class Pair<T1, T2> {
T1 x;
T2 y;
	public Pair(T1 x,T2 y)
	{
		this.x = x;
		this.y=y;
	}
	public T1 getKey()
	{
		return this.x;
	}
	public T2 getValue()
	{
		return this.y;
	}
}
