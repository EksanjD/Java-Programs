class Multiply{
	 static int multiply(int a,int b){
		return a*b;
      
}
static int multiply(int a,int b,int c){
	 return a*b*c;
     
}
     public static void main(String[] args){
     int num1 = multiply(10,20);
    int num2 =  multiply(10,20,30);
System.out.println(num1);
System.out.println(num2);
}
}