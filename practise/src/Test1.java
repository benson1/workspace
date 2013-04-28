import java.util.Random;


public class Test1{
static Random r = new Random();
static int count = 1;

public static void main(String[] args){
getRandomNum();
}

public static void getRandomNum(){
while (true){
for (int x = 0; x < 5; x++){
System.out.println(r.nextInt(2) + count);
try{
Thread.sleep(1000);
}catch(Exception ex){}
}
count += 2;



}
}
}