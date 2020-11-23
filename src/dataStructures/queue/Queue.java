package dataStructures.queue;

public class Queue<T> {

	private Object[] values;
	
	public Queue()
	{
		values = new Object[0];
	}
	
	public void enqueue(T data)
	{
		//Create a new array with the new data at the head
		Object[] newValues = new Object[values.length + 1];
		newValues[0] = data;
		
		// Add the existing data to the new array
		for (int i = 0; i < values.length; i++)
		{
			newValues[i + 1] = values[i];
		}
		
		values = newValues;
	}
	
	public T dequeue()
	{
		if (this.isEmpty())
		{
			return null;  // Not ideal, since client can validly enqueue a null reference
		}

		T data = (T) values[values.length - 1];

		Object[] newValues = new Object[values.length - 1];
		for (int i = 0; i < newValues.length; i++)
		{
			newValues[i] = values[i];
		}

		values = newValues;
		
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
		String returnString = "Queue{";
		
		for (Object value : values)
		{
			returnString += value.toString();
			returnString += ",";
			returnString += System.lineSeparator();
		}
		
		return returnString + "}";
	}
	
}
