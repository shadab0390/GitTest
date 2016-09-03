
public class Tax {	
	private int med ;
	private int hra ;
		
	int taxpay(int basSal)
	{
		int netSal = 0;
		if(basSal<=250000)
		{
			med = (10*basSal)/100;
			hra = (15*basSal)/100;
			netSal = basSal+med+hra ;
		}
		else
			if(basSal>250000 && basSal<=500000)
			{
				med = (10*basSal)/100;
				hra = (15*basSal)/100;
				basSal = basSal - ((basSal*10)/100);
				netSal = basSal+med+hra ;
			}
			else
				if(basSal>500000 && basSal<=1000000)
				{
					med = (10*basSal)/100;
					hra = (15*basSal)/100;
					basSal = basSal - ((basSal*20)/100);
					netSal = basSal+med+hra ;
				}
				else
					if(basSal>1000000)
					{
						med = (10*basSal)/100;
						hra = (15*basSal)/100;
						basSal = basSal - ((basSal*30)/100);
						netSal = basSal+med+hra ;
					}
		return netSal ;
	}
	
}
