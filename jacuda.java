public class jacuda
{
	float[] result;
	float[][] result1;
	static int i=0;
	static int k=0;
	public float[] add(float[] a, float b[]) 
	{
		
		if (a.length == b.length) 
		{
			
			 result = new float[a.length];

			
			for (int i = 0; i < a.length; i=i+1) 
			{
				
				result[i] = a[i] + b[i];
			
			}
			
					
		}


		return result;
		
			
	}

	
	public float[] divide(float[] a, float b[]) 
	{
	
		if (a.length == b.length) 
		{
			
			result = new float[a.length];

			
			for (int i = 0; i < a.length; i=i+1) 
			{
				
				result[i] = a[i] / b[i];
			
			}
			
					
		}

		
	
	return result;

	}

	
	public float[] multiply(float[] a, float b[]) 
	{
		
		if (a.length == b.length) 
		{
			
			 result = new float[a.length];

			
			for (int i = 0; i < a.length; i=i+1) 
			{
				
				result[i] = a[i] * b[i];
			
			}
			
					
		}

		
		return result;

		
	}

	
	public float[] substract(float[] a, float b[]) 
	{
		
		if (a.length == b.length) 
		{
			
			result= new float[a.length];

			
			for (int i = 0; i < a.length; i=i+1) 
			{
				
				result[i] = a[i] - b[i];
			
			}
			
				
		}


		return result;
		
			
	}

	public float[][] scalarProduct(float[][] matrix, float scalar) 
	{

		result1 = new float[matrix.length][];

		
for(int i = 0; i < matrix.length;i=i+1)
		{


			result1[i]= new float[matrix[i].length];

			
for(int x = 0; x < matrix[i].length;x=x+1)
			{

				result1[i][x] = matrix[i][x] * scalar;

			}
		
		}

		return result1;
	
	}


	
}