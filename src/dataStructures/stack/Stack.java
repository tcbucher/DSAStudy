package dataStructures.stack;

public class Stack<T> {

	private Object[] values;
	
	public Stack()
	{
		values = new Object[0];
	}
	
	public void push(T data)
	{
		Object[] newValues = new Object[values.length + 1];
		newValues[0] = data;
		for (int i = 0; i < values.length; i++)
		{
			newValues[i + 1] = values[i];
		}
		
		values = newValues;
	}
	
	public T pop()
	{
		if(this.isEmpty())
		{
			return null; // Not ideal, since client can validly push a null reference
		}
		
		T data = (T) values[0];

		Object[] newValues = new Object[values.length - 1];
		for (int i = 0; i < newValues.length; i++)
		{
			newValues[i] = values[i + 1];
		}

		values = newValues;
		
		return data;
	}

	public boolean contains(T item)
	{
		for (Object value : values)
		{
			if (((T)value).equals(item))
				return true;
		}
		return false;
	}

	public T peek()
	{
		return (this.isEmpty())? null: (T) values[0];
	}
	
	public boolean isEmpty()
	{
		return values.length == 0;
	}
	
	@Override
	public String toString()
	{
		String returnString = "Stack{";
		
		for (Object value : values)
		{
			returnString += value.toString();
			returnString += ",";
			returnString += System.lineSeparator();
		}
		
		return returnString + "}";
	}

}
