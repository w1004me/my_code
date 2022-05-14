package grade_calcul;
import java.util.*;

public class grd_cal {
	public static void main(String[] args)
	{
		ArrayList<students> std = new ArrayList<>();
		std.add(new students("강감찬", "2201" ,"국어국문학", "국어", 95, 56));
		std.add(new students("김유신", "2203" ,"컴퓨터공학", "수학", 95, 95));
		students st = new students("이순신", "2204" ,"국어국문학", "국어", 89, 95);
		std.add(st);
		st = new students("홍길동", "2205" ,"컴퓨터공학", "수학", 85, 56);
		std.add(st);
		
		for(students i : std) {
			i.printinfo();
		}
		System.out.println("국어 과목 등급");
		KorGrad kg = new KorGrad();
		kg.check_major(std);
		System.out.println("수학 과목 등급");
		matGrad mg = new matGrad();
		mg.check_major(std);
	}
}

class KorGrad{
	void check_major(ArrayList<students> std) {
		for(students i : std) {
			i.kor_check_print();
		}
	}
}

class matGrad{
	void check_major(ArrayList<students> std) {
		for(students i : std) {
			i.mat_check_print();
		}
	}
}

class students{
	private String name;
	private String std_id; 
	private String Major;
	private String nes;
	private int kor;
	private int mat;
	
	public students(String name, String std_id, String Major, String nes, int kor, int mat) {
		this.name = name;
		this.std_id = std_id;
		this.Major = Major;
		this.nes = nes;
		this.kor = kor;
		this.mat = mat;
	}
	
	public void printinfo()
	{
		System.out.println(name+" "+std_id+" "+Major+" "+nes+" "+kor+" "+mat);
	}
	public void mat_check_print()
	{
		String rank="";
		if(this.nes.equals("수학") == true)//필수일 때
		{
			//S      A      B      C      D      F
			//100~95  94~90  89~80  79~70  69~60  60점미만
			if(this.mat >= 95)
			{
				rank = "S";
			}
			else if(this.mat < 95 && this.mat >= 90)
			{
				rank = "A";
			}
			else if(this.mat < 90 && this.mat >= 80)
			{
				rank = "B";
			}
			else if(this.mat < 80 && this.mat >= 70)
			{
				rank = "C";
			}
			else if(this.mat < 70 && this.mat >= 60)
			{
				rank = "D";
			}
			else if(this.mat < 60)
			{
				rank = "F";
			}
		}
		else//선택일 때
		{
			//A      B      C      D      F
			//100~90  89~80  79~70  69~55  55점미만
			if(this.mat >= 90)
			{
				rank = "A";
			}
			else if(this.mat < 90 && this.mat >= 80)
			{
				rank = "B";
			}
			else if(this.mat < 80 && this.mat >= 70)
			{
				rank = "C";
			}
			else if(this.mat < 70 && this.mat >= 55)
			{
				rank = "D";
			}
			else if(this.mat < 55)
			{
				rank = "F";
			}
		}
		System.out.println(name+" "+std_id+" "+Major+" "+nes+" "+kor+" "+rank);
	}
	public void kor_check_print()
	{
		String rank="";
		if(this.nes.equals("국어") == true)//필수일 때
		{
			//S      A      B      C      D      F
			//100~95  94~90  89~80  79~70  69~60  60점미만
			if(this.kor >= 95)
			{
				rank = "S";
			}
			else if(this.kor < 95 && this.kor >= 90)
			{
				rank = "A";
			}
			else if(this.kor < 90 && this.kor >= 80)
			{
				rank = "B";
			}
			else if(this.kor < 80 && this.kor >= 70)
			{
				rank = "C";
			}
			else if(this.kor < 70 && this.kor >= 60)
			{
				rank = "D";
			}
			else if(this.kor < 60)
			{
				rank = "F";
			}
		}
		else//선택일 때
		{
			//A      B      C      D      F
			//100~90  89~80  79~70  69~55  55점미만
			if(this.kor >= 90)
			{
				rank = "A";
			}
			else if(this.kor < 90 && this.kor >= 80)
			{
				rank = "B";
			}
			else if(this.kor < 80 && this.kor >= 70)
			{
				rank = "C";
			}
			else if(this.kor < 70 && this.kor >= 55)
			{
				rank = "D";
			}
			else if(this.kor < 55)
			{
				rank = "F";
			}
		}
		System.out.println(name+" "+std_id+" "+Major+" "+nes+" "+kor+" "+rank);
	}
}
