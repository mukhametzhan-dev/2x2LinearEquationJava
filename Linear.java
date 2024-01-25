import java.util.Scanner;
class Linear{
static class Equation{
	private static int a,b,c,d,e,f;
	Equation(int a,int b,int c,int d,int e,int f){
		this.a= a;this.b = b; this.c = c; this.d = d;this.e =e ;this.f = f;
	

}
private boolean isSolveable(){
	if(a*d - b*c != 0){
		return true;

	}
	else{
		return false;

	}

	}
	private int getX(){
		int x = (e * d - b *f)/(a*d - b * c);
		return x;}

	private int getY(){
		int y = (a*f - e *f )/(a*d - b *c );
		return y;
	}
	private void getEquation(){
		System.out.println(a + "x" +  "+" +b  + "y" + "=" + e);
		System.out.println(c + "x" + "+" + d + "y" + "=" + f );
	}
}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();int b = in.nextInt(); int c = in.nextInt();int d = in.nextInt();
		int e = in.nextInt();int f = in.nextInt();
		Equation problem = new Equation(a,b,c,d,e,f);

		System.out.println("Is the equation solveable? " + problem.isSolveable());
        if (problem.isSolveable()) {
            System.out.println("Solution: x = " + problem.getX() + ", y = " + problem.getY());
        }
        problem.getEquation();
    }

}
