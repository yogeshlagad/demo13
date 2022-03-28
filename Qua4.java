package P1;
public class Qua4 {

	public static void main(String[] args) {

String str="yogesh";
String ptr="lagad";
int slen= str.length(); //9

int s1len=ptr.length();//4

int max= Integer.max(slen,s1len);
//output j1a2v3a4

String newString=" ";
for(int i=0;i<max;i++)
{

	if(i<slen) 		newString  += str.substring(i,i+1);
	if(i<s1len) 	newString  += ptr.substring(i,i+1);
}
System.out.println(newString);

	}

}
