package logic_program;

public class Find_Duplicate_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// String[] strArray = {"Java", "JSP", "Servlets", "Java", "Struts", "JSP", "JDBC"};

		int[] strArray = new int [] {1,3,3};

		System.out.println(strArray.length);

		int count = 0;

		// System.out.println(strArray.length);

		for (int i = 0; i <=strArray.length-1; i++)
		{

			//System.out.println("1");
			for (int j = i+1; j <=strArray.length-1; j++)
			{
				if( (strArray[i]==(strArray[j]))  )
				{
					System.out.println("Duplicate Element is : "+strArray[j]);


				}

			}



		}



	}



}
