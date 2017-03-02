import static org.junit.Assert.*;


import org.junit.After;

import org.junit.Before;

import org.junit.Test;


public class AbstractArrayTest 
{


	
	//jacuda job= new jacuda();
	@Before
	
	public void setUp() throws Exception {
}

	
	@After
	
	public void tearDown() throws Exception {
}

	
	@Test

	public void testAdd()
	 {
	jacuda job= new jacuda();	
		float[] a = new float[getArraySize()];
	
		float[] b = new float[getArraySize()];


		for (int i = 0; i < getArraySize(); i=i+1) 
		{
		
			a[i] = i;

			b[i] = i;

		}

	
		float[] result = job.add(a, b);

	
		for (int i = 0; i < getArraySize(); i=i+1) 
		{
	
			assertTrue(result[i] == (i + i));

		}
	
	}

	
	@Test
	
	public void testSubstract() 
	{
	jacuda job= new jacuda();	
		float[] a = new float[getArraySize()];
	
		float[] b = new float[getArraySize()];

	
		for (int i = 0; i < getArraySize(); i=i+1)
 		{
			
			a[i] = i;
		
			b[i] = i;
	
		}

		
		float[] result = job.substract(a, b);


		for (int i = 0; i < getArraySize(); i=i+1)
 		{
			
			assertTrue(result[i] == 0);

		}
	
	}

	
	@Test
	
	public void testMultiply() 
	{
	jacuda job= new jacuda();	
		float[] a = new float[getArraySize()];
	
		float[] b = new float[getArraySize()];

	
		for (int i = 0; i < getArraySize(); i=i+1) 
		{
			
		a[i] = i;
		
		b[i] = 2;
	
		}

		
		float[] result = job.multiply(a, b);


		for (int i = 0; i < getArraySize(); i=i+1)
		 {
		
			assertTrue(result[i] == (i * 2));

		}
	
	}

	
	@Test
	
	public void testDivide() 
	{
	jacuda job= new jacuda();
		float[] a = new float[getArraySize()];
	
		float[] b = new float[getArraySize()];

	
		for (int i = 1; i <= getArraySize(); i=i+1)
 		{
			
			a[i-1] = i;
		
			b[i-1] = i;
	
		}

	
		float[] result = job.divide(a, b);

	
		for (int i = 1; i <= getArraySize(); i=i+1) 
		{
			
			assertTrue(result[i-1] - a[i-1]/b[i-1] < 0.000001);
	
		}
	
	}


	public int getArraySize()
 	{
		
		return 50;

	}


	@Test

	public void testScalarProduct() 
	{
	jacuda job= new jacuda();	
		float[][] matrix = new float[2][2];
		
		float scalar = 7;
		
	
		matrix[0][0] =1;
	
		matrix[0][1] =2;
		
		matrix[1][0] =3;
		
		matrix[1][1] =4;
		
	
		float[][] result =  job.scalarProduct(matrix, scalar);


		assertTrue(result.length == matrix.length);

	
		for(int i = 0; i < result.length; i++)
		{
		
			assertTrue(result[i].length == matrix[i].length);

		}
		
		
		assertTrue(result[0][0] == 7);
		
		assertTrue(result[0][1] == 14);
		
		assertTrue(result[1][0] == 21);
		
		assertTrue(result[1][1] == 28);
		

		assertTrue(result[1][0] == 21);
	
		assertTrue(result[1][1] == 28);
		
	
	}
	
	
	@Test
	
	public void testUnevenScalarProduct()
 	{
	jacuda job= new jacuda();	
		float[][] matrix = new float[2][12];
	
		float scalar = 7;
		
		
		matrix[0][0] =1;
		
		matrix[0][1] =2;
		
		matrix[0][2] =1;
		
		matrix[0][3] =2;
		
		matrix[1][0] =3;
		
		matrix[1][1] =4;
		
		matrix[1][2] =3;
		
		matrix[1][3] =4;
		
		
		float[][] result =  job.scalarProduct(matrix, scalar);


		assertTrue(result.length == matrix.length);

	
		for(int i = 0; i < result.length; i++)
		{
	
			assertTrue(result[i].length == matrix[i].length);

		}
		
		
		assertTrue(result[0][0] == 7);
		
		assertTrue(result[0][1] == 14);
		
		assertTrue(result[1][0] == 21);
	
		assertTrue(result[1][1] == 28);
	
	
	assertTrue(result[1][0] == 21);
	
		assertTrue(result[1][1] == 28);
		

	}


}
