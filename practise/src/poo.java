import java.util.Random;

public class poo{
static int count = 1;
public static void main(String[] args){
	for (int i = 0; i < 4; i++) {
		System.out.println(getRandomNum());
	}
}

//public static int getRandomNum(int lowerlimit, int upperlimit, int zxxa){
public static int getRandomNum(){
	Random r = new Random();
	return r.nextInt();
}


/*
public static string getRandomNum(){
	System.out.println(r.nextInt(2) + count);
	try{
	Thread.sleep(1000);
	}catch(Exception ex){}
	}
	*/
}
