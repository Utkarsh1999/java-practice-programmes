class CmdException
{
	public static void main(String[] args)
	 {
	 	int sum = 0;
		for(int i=0;i<args.length;i++)
		{
			int n = Integer.parseInt(args[i]);
			try{


					if(n<0)
					{
						throw new Exception("number is negative");
					}
					else if(n%10==0)
					{
						throw new Exception("number is divisible by 10");
					}
					else if(n>1000 && n<2000)
					{
						throw new Exception("number is between 1000 and 2000");
					}
					else if(n>7000)
					{
						throw new Exception("number is greater than 7000");
					}
					else
					{
						sum+=n;
					}
				}
				catch(Exception e)
				{
					System.err.println(e);
				}
				
		}	
		System.out.println(sum);
	 }
}