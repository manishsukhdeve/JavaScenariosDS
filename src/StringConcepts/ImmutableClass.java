package StringConcepts;

	final class ImmutableClass 
	{
		private int i;	// Instance variable
			ImmutableClass(int i) // Constructor
			{
				this.i = i;
			}
			
		// Because of modify method ImmutableClass is become immutable.
		public ImmutableClass modify(int i) // return type modify method name is ImmutableClass
			{
				if(this.i == i)
				{
					return this;
				}
				else
				{
					return (new ImmutableClass(i));
				}
			}
		// Because of modify method ImmutableClass is become immutable.
		
	public static void main(String[] args) 
	{
		ImmutableClass t1 = new ImmutableClass(10);	// Object created in Heap and SCP t1
		ImmutableClass t2 = t1.modify(100);			// Object created in Heap and SCP t2
		ImmutableClass t3 = t1.modify(10);			// Object refer to t1 = t3
		
		System.out.println(t1 == t2); //false
		System.out.println(t1 == t3); //true
	}
}