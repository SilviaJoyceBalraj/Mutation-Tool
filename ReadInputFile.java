import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.InputStream;
import java.io.*;
import java.io.FileWriter;
import java.io.FileReader;
import java.util.Scanner;
import java.io.FileNotFoundException;
class ReadInputFile
{
	static int countword=0;
	static int Live_Mutants=0;
	static int Killed_Mutants=0;
	static int Total_Mutants=0;
	static int Skipped_Mutants;
	static int Mutation_Score;
	public static void main(String args[]) throws IOException
	{
				
			ReadInputFile readobject=new ReadInputFile();
			FileInputStream file= new FileInputStream("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
			
			int line;
			int count=0;
			int operatortable[];
			int operators[]={42,43,45,47};
			String content;
			char character;
			File f= new File("jacuda.java");
			FileOutputStream out= new FileOutputStream(f);
			while ((line = file.read()) != -1) 
			{	
				
				character=(char)line;
				if(line==43 || line==45 || line==42 || line==47)
				{
					count=count+1;
				}
			}
			System.out.println(count);
			int counts=1;
			for(int i=1;i<=count;i++)
			{
				for(int j=0;j<=3;j++)
				{
					counts=1;
					FileInputStream fileread=new FileInputStream("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
					FileOutputStream filewrite= new FileOutputStream("jacuda.java");
					while ((line = fileread.read())!= -1) 
					{	
						
						character=(char)line;
						if(line==43 || line==45 || line==42 || line==47)
						{
							
							if(counts==i)
							{
								character=(char)operators[j];
								System.out.println("Change to "+ character);
							
							}
							counts=counts+1;
						}
						filewrite.write(character);
					}
					try
					{
						Process pro = Runtime.getRuntime().exec("javac TestRunner.java");
						Thread.sleep(2400);
						Process pro1 = Runtime.getRuntime().exec("java TestRunner");
						Thread.sleep(2900);
						pro1.destroy();
						Total_Mutants++;
						printLines(" stdout:", pro1.getInputStream());
						File file1 = new File("jacuda.class");
						File file2 = new File("AbstractArrayTest.class");
						File file3 = new File("jacuda.java");
						if(file1.exists())
						{	
							file1.delete();
						}
						if(file2.exists())
						{
							file2.delete();
						}
						if(file3.exists())
						{
							file3.delete();
						}
					}
					catch (Exception e) 
					{
           		 			e.printStackTrace();
      					}			
				}
			}



					// for mutating float to int



		File newfile = new File("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
		countword=0;
		countword=readobject.countWord("float",newfile);
		System.out.println("float word occurnce is "+countword);
		for(int m=1;m<=countword;m++)
		{
			int countreplace=1;
			FileReader newfile1 = new FileReader("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
			FileWriter outputfile = new FileWriter("jacuda.java");
   			//FileWriter fWriter = new FileWriter(outputfile);
    			//PrintWriter pWriter = new PrintWriter(fWriter);
			//Scanner scanner = new Scanner(newfile1);

			BufferedReader br = new BufferedReader(newfile1);
			//BufferedWriter br1 = new BufferedWriter(outputfile);
			
			try
			{
				String nextline1="",out1="";
				while ((nextline1 = br.readLine())!= null)
				{
				//String x = scanner.nextLine();
					
   					if (nextline1.contains("float"))
					{
						if(m==countreplace)
						{
							nextline1 = nextline1.replace("float","int");
							//System.out.println("Found int");
						}
						countreplace=countreplace+1;
					}
					//System.out.println(nextToken1);
					//printer.write("hi");
					out1=out1+nextline1+"\r\n";
				
				}
				//System.out.println(out1);
				outputfile.write(out1);
				outputfile.close();
			}
			catch(Exception e){}
			
		
			try
			{
				//file1.close();
				Process pro = Runtime.getRuntime().exec("javac  TestRunner.java");
				Thread.sleep(2400);
				Process pro1 = Runtime.getRuntime().exec("java  TestRunner");
				Thread.sleep(2900);
				pro1.destroy();
			
				//System.out.println(pro1.exitValue());
				Total_Mutants++;
				printLines(" stdout:", pro1.getInputStream());
				File file1 = new File("jacuda.class");
				File file3 = new File("jacuda.java");
				File file2 = new File("AbstractArrayTest.class");
				if(file1.exists())
				{	
					file1.delete();
				}
				if(file2.exists())
				{
					file2.delete();
				}
				if(file3.exists())
				{
					file3.delete();
				}
		
			}
			catch (Exception e) 
			{
           			e.printStackTrace();
      			}			
		}
		


			// for mutating public to protected


		File new_file = new File("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
		
		//readobject.countWord("public",new_file);
		//System.out.println("public word occurnce is " +countword);
		countword=0;
		countword=readobject.countWord("public",new_file);
		System.out.println("public word occurnce is " +countword);
		for(int m=1;m<=countword;m++)
		{
			int countreplace=1;
			FileReader newfile1 = new FileReader("C:/Users/prince/Desktop/Silvia_MS_Folders/Topics_in_CSE/jacuda.java");
			FileWriter outputfile = new FileWriter("jacuda.java");

			BufferedReader br = new BufferedReader(newfile1);
			
			try
			{
				String nextline1="",out1="";
				while ((nextline1 = br.readLine())!= null)
				{
   					if (nextline1.contains("public"))
					{
						if(m==countreplace)
						{
							nextline1 = nextline1.replace("public","protected");
							//System.out.println("Found int");
						}
						countreplace=countreplace+1;
					}
					//System.out.println(nextToken1);
					//printer.write("hi");
					out1=out1+nextline1+"\r\n";
				
				}
				//System.out.println(out1);
				outputfile.write(out1);
				outputfile.close();
			}
			catch(Exception e){}
			
		
		try
		{
			//file1.close();
			Process pro = Runtime.getRuntime().exec("javac  TestRunner.java");
			Thread.sleep(2400);
			Process pro1 = Runtime.getRuntime().exec("java  TestRunner");
			Thread.sleep(2900);
			pro1.destroy();
			//System.out.println(pro1.exitValue());
			Total_Mutants++;
			printLines(" stdout:", pro1.getInputStream());
			File file1 = new File("jacuda.class");
			File file2 = new File("AbstractArrayTest.class");
			File file3 = new File("jacuda.java");
			if(file1.exists())
			{	
				file1.delete();
			}
			if(file2.exists())
			{
				file2.delete();
			}
			if(file3.exists())
			{
				file3.delete();
			}
		
		}
		catch (Exception e) 
		{
           		e.printStackTrace();
      		}			
		}
		
		Skipped_Mutants=Total_Mutants-(Killed_Mutants+Live_Mutants);
		Total_Mutants=Total_Mutants-Skipped_Mutants;
		System.out.println("Total number of mutants= "+Total_Mutants);
		System.out.println("Total number of killed mutants= "+Killed_Mutants);
		Mutation_Score=((Killed_Mutants*100)/Total_Mutants);
		System.out.println("Mutation score is "+Mutation_Score);
	}





	//for counting the occurence of a particular word


	public int countWord(String word, File file) 
	{
		try
		{
			Scanner scanner = new Scanner(file);
			while (scanner.hasNext())
			{
				try
				{
    					String nextToken = scanner.next();
					
   					if (nextToken.contains(word))
					{
						//System.out.println("Found"+nextToken);
    						countword++;
					}
				}
				catch(Exception no)
				{}
			}
			scanner.close();
		}
		catch(FileNotFoundException f)
		{}
		return countword;
	}


				//for reading and printing


	 private static void printLines(String name, InputStream ins) throws Exception
	 {
         	String ans = null;
		int count=0;
		
          	BufferedReader br = new BufferedReader(new InputStreamReader(ins));
          	while ((ans= br.readLine())!= null)
		{
              		System.out.println(name + " " +ans);
			if(ans.equals("true"))
			{
				Live_Mutants=Live_Mutants+1;
			}
			else
			{
				Killed_Mutants=Killed_Mutants+1;
			}
			
		}
          }
		
		
	
}
		