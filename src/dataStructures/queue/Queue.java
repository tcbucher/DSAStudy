package dataStructures.queue;

import java.util.Arrays;

public class Queue<T> {

	private Object[] values;
	
	public Queue()
	{
		values = new Object[0];
	}
	
	public void enqueue(T data)
	{
		values = Arrays.copyOf(values, values.length + 1);
		values[values.length - 1] = data;
	}
	
	public T dequeue()
	{
		if (this.isEmpty())
		{
			return null;  // Not ideal, since client can validly enqueue a null reference
		}

		T data = (T) values[0];
		values = Arrays.copyOfRange(values, 1, values.length);

		return data;
	}
	
	public T front()
	{
		return (this.isEmpty())? null : (T) values[0];
	}
	
	public T rear()
	{
		return (this.isEmpty())? null : (T) values[values.length - 1];
	}

	private boolean isEmpty()
	{
		return values.length == 0;
	}
	
	@Override
	public String toString()
	{
		String returnString = "Queue {";

		for (Object value : values)
		{
			returnString += value.toString();
			returnString += ", ";
 		}

		return returnString.substring(0, returnString.length() - 2) + "}";
	}
	
}
