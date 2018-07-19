import java.io.*;
public class Scientific_Calculator
{
	static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	public static void main(String[] args)throws IOException
	{
		int domain=1;
		do
		{
			System.out.println("This program imitates the functioning of a scientific calculator , and has all it's functions");
			System.out.println("It will enable you to perform you almost all important arithmatic functions");
			System.out.println("Which is the function that you want to perform: arithmetic or trignometric");
			System.out.println("enter '1' for arithmetic functions and '2' for trignometric ");
			System.out.println("(1.) Simple arithematic activity");
			System.out.println("");
			System.out.println("");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("(i) Addition ");
			System.out.println("(ii) Subtraction");
			System.out.println("(iii) Multiplication");
			System.out.println("(iv) Division");
			System.out.println("(v) Modulus");
			System.out.println("(vi) Percentage");
			System.out.println("(vii) Square");
			System.out.println("(viii) Cube");
			System.out.println("(ix) Square root");
			System.out.println("(x) Cube root");
			System.out.println("(xi) M++ function");
			System.out.println("(xii) M-- function");
			System.out.println("(xiii) Logarithm");
			System.out.println("(xiv) Factorial");
			System.out.println();
			System.out.println();
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("(2.) Trignometrical activities");
			System.out.println("");
			System.out.println("");
			System.out.println("------------------------------------------------------------------------------------------------------------------------------------------");
			System.out.println("(i) Sinosine calculation (angle has to be user given)");
			System.out.println("(ii) Cosine calculation (angle has to be user given)");
			System.out.println("(iii) Tangent calculation (angle has to be user given)");
			System.out.println("(iv) Cotangent calculation (angle has to be user given)");
			System.out.println("(v) Sec calculation (angle has to be user given)");
			System.out.println("(vi) Cosec calculation (angle has to be user given)");
			System.out.println("(vii) Asinosine calculation (angle value has to be user given)");
			System.out.println("(viii) Acosine calculation (angle value has to be user given)");
			System.out.println("(ix) Atangent calculation (angle value has to be user given)");
			System.out.println("(x) Acotangent calculation (angle value has to be user given)");
			System.out.println("(xi) Asec calculation (angle value has to be user given)");
			System.out.println("(xii) Acosec calculation (angle value has to be user given)");
			int choiceMain=Integer.parseInt(br.readLine());
			switch(choiceMain)
			{
			case 1:
				int doart=1;
				do
				{     
					Scientific_Calculator arithact=new Scientific_Calculator();
					System.out.println("The Functions are:");
					System.out.println();
					System.out.println("(1) Addition ");                                                                                                 
					System.out.println("(2) Subtraction");
					System.out.println("(3) Multiplication");
					System.out.println("(4) Division");
					System.out.println("(5) Modulus");
					System.out.println("(6) Percentage");
					System.out.println("(7) Square");
					System.out.println("(8) Cube");
					System.out.println("(9) Square root");
					System.out.println("(10) Cube root");
					System.out.println("(11) M++ function");
					System.out.println("(12) M-- function");
					System.out.println("(13) Logarithm");
					System.out.println("(14) Factorial");
					System.out.println();
					System.out.println("------------------------------------------------------------------");
					System.out.print("Enter the numeral in front of the operation you want to perform  : > ");
					int choicearithematic=Integer.parseInt(br.readLine());
					switch(choicearithematic)
					{
					case 1:
						arithact.addition();
						break;

					case 2:
						arithact.subtraction();
						break;

					case 3:
						arithact.multiplication();
						break;

					case 4:
						arithact.division();
						break;

					case 5:
						arithact.modulus();
						break;

					case 6:
						arithact.percentage();
						break;

					case 7:
						arithact.square();
						break;

					case 8:
						arithact.cube();
						break;

					case 9:
						arithact.squareroot();
						break;

					case 10:
						arithact.cuberoot();
						break;

					case 11:
						arithact.mplus();
						break;

					case 12:
						arithact.mminus();
						break;

					case 13:
						arithact.log();
						break;
					case 14:
						arithact.Factorial();
						break;

					default:
						System.out.println("This is an invalid choice:");
					}
					System.out.print("\n\n Do you want to continue with the arithematic operations? if yes press 1, else if you want to opt for some other operation, press 0 :> ");
					doart=Integer.parseInt(br.readLine());
				}while(doart==1);
				break;
			case 2:
				int dotri=1;
				do
				{
					Scientific_Calculator trignoact= new Scientific_Calculator();
					System.out.println("The functions are:");
					System.out.println();
					System.out.println("--------------------------------------------------------");
					System.out.println("(1) Sinosine calculation (angle has to be user given)");
					System.out.println("(2) Cosine calculation (angle has to be user given)");
					System.out.println("(3) Tangent calculation");
					System.out.println("(4) Cotangent calculation");
					System.out.println("(5) Sec calculation");
					System.out.println("(6) Cosec calculation");
					System.out.println("(7) Asinosine calculation (angle value has to be user given)");
					System.out.println("(8) Acosine calculation (angle value has to be user given)");
					System.out.println("(9) Atangent calculation (angle value has to be user given)");
					System.out.println("(10) Acotangent calculation (angle value has to be user given)");
					System.out.println("(11) Asec calculation (angle value has to be user given)");
					System.out.println("(12) Acosec calculation (angle value has to be user given)");
					System.out.println("----------------------------------------------------");
					System.out.print("Enter the function you want to perform:> ");
					int choicetrignometry=Integer.parseInt(br.readLine());
					switch(choicetrignometry)
					{
					case 1:
						trignoact.sinosine();
						break;

					case 2:
						trignoact.cosine();
						break;

					case 3:
						trignoact.tangent();
						break;

					case 4:
						trignoact.cotangent();
						break;

					case 5:
						trignoact.sec();
						break;

					case 6:
						trignoact.cosec();
						break;

					case 7:
						trignoact.Asinosine();
						break;

					case 8:
						trignoact.Acosine();
						break;

					case 9:
						trignoact.Atangent();
						break;

					case 10:
						trignoact.Acotangent();
						break;

					case 11:
						trignoact.Asec();
						break;

					case 12:
						trignoact.Acosec();
						break;
					default:
						System.out.println("Invalid choice");
					}
					System.out.print("\n\n Do you want to continue with the trignometric activities? if yes,press 1; else if you want to opt for some other operation,press 0 : > ");
					dotri=Integer.parseInt(br.readLine());
				}while(dotri==1);
				break;
			default :
				System.out.println("Invalid choice");
			}
			System.out.println("\n\n Do you want to operate this whole programme once more?if yes,press 1, else 0");
			domain=Integer.parseInt(br.readLine());
		}while(domain==1);
		System.out.print("------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println("-----------------------------------");
		System.out.println("This programme has come to an end");
	}
	public void addition()throws IOException
	{
		System.out.println("How many numbers do you want to add");
		int addnum=Integer.parseInt(br.readLine());
		double A[]=new double[addnum];
		for(int i=0;i<addnum;i++)
		{
			System.out.print("Enter the "+(i+1)+" number");
			A[i]=Integer.parseInt(br.readLine());
		}
		double sum=0;
		for(int i=0;i<addnum;i++)
		{
			sum=sum+A[i];
		}
		System.out.print("The sum of these numbers is  "+sum);
	}
	public void subtraction()throws IOException
	{
		System.out.println("Enter the 2 numbers you want to use in this operation:");
		int onesubtractnum=Integer.parseInt(br.readLine());
		int twosubtractnum=Integer.parseInt(br.readLine());
		System.out.println("Do you want to subtract the Second number from the First?If yes,press one, or if you want to do the opposite, press 0");
		int subtract1=Integer.parseInt(br.readLine());
		int subtract;
		if(subtract1==1)
		{
			subtract=(onesubtractnum-twosubtractnum);
		}
		else
		{
			subtract=(twosubtractnum-onesubtractnum);
		}
		System.out.println("The subtract of the two numbers is "+subtract);
	}
	public void multiplication()throws IOException
	{
		System.out.println("How many numbers do you want to Multiply");
		int mulnum=Integer.parseInt(br.readLine());
		double W[]=new double[mulnum];
		for(int i=0;i<mulnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			W[i]=Integer.parseInt(br.readLine());
		}
		double product=1;
		for(int i=0;i<mulnum;i++)
		{
			product=product*W[i];
		}
		System.out.print("The product of these numbers is "+product);
	}
	public void division()throws IOException
	{
		System.out.println("Enter the 2 numbers you want to use in this operation:");
		double onedividenum=Integer.parseInt(br.readLine());
		double twodividenum=Integer.parseInt(br.readLine());
		System.out.println("Do you want to divide the first number from the second?If yes,press 1, or if you want to do the opposite, press 0");
		int divide1=Integer.parseInt(br.readLine());
		double quotient;
		if(divide1==1)
		{
			quotient=(onedividenum/twodividenum);
		}
		else
		{
			quotient=(twodividenum/onedividenum);
		}
		System.out.print("The quotient is "+quotient);
	}
	public void modulus()throws IOException
	{
		System.out.println("Enter the 2 numbers you want to use in this operation:");
		double onemodulusnum=Integer.parseInt(br.readLine());
		double twomodulusnum=Integer.parseInt(br.readLine());
		System.out.println("Do you want to divide the first number from the second?If yes,press 1, or if you want to do the opposite, press 0");
		int modulus1=Integer.parseInt(br.readLine());
		double remainder;
		if(modulus1==1)
		{
			remainder=(onemodulusnum%twomodulusnum);
		}
		else
		{
			remainder=(twomodulusnum%onemodulusnum);
		}
		System.out.print("The remainder is "+remainder);
	}
	public void percentage()throws IOException
	{
		System.out.println("Enter the total number,from whom yo want to find the percentage");
		double percenttotalnum=Integer.parseInt(br.readLine());
		System.out.println("Enter the number whose percentage you want to find");
		double percenttnum=Integer.parseInt(br.readLine()); 
		double percentage=(percenttnum/percenttotalnum)*100;
		System.out.print("The percentage composition is "+percentage);
	}
	public void square()throws IOException
	{
		System.out.println("Of How many numbers do you want to find the square of");
		int squarenum=Integer.parseInt(br.readLine());
		double B[]= new double[squarenum];
		double Bsquare[]= new double[squarenum];
		for(int i=0;i<squarenum;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			B[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<squarenum;i++)
		{
			Bsquare[i]=Math.pow(B[i],2);
		} 
		for(int i=0;i<squarenum;i++)
		{
			System.out.println("The square of the "+(i+1)+" number is "+Bsquare[i]);
		}
	}
	public void cube()throws IOException
	{
		System.out.println("Of How many numbers do you want to find the cube of");
		int cubenum=Integer.parseInt(br.readLine());
		double C[]= new double[cubenum];
		double Ccube[]= new double[cubenum];
		for(int i=0;i<cubenum;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			C[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<cubenum;i++)
		{
			Ccube[i]=Math.pow(C[i],3);
		} 
		for(int i=0;i<cubenum;i++)
		{
			System.out.println("The cube of the "+(i+1)+" number is "+Ccube[i]);
		}
	}
	public void squareroot()throws IOException
	{
		System.out.println("Of How many numbers do you want to find the squareroot of");
		int squarerootnum=Integer.parseInt(br.readLine());
		double D[]= new double[squarerootnum];
		double Dsquareroot[]= new double[squarerootnum];
		for(int i=0;i<squarerootnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			D[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<squarerootnum;i++)
		{
			Dsquareroot[i]=Math.pow(D[i],1/2);
		} 
		for(int i=0;i<squarerootnum;i++)
		{
			System.out.println("The squareroot of the "+(i+1)+" number is "+Dsquareroot[i]);
		} 
	}
	public void cuberoot()throws IOException
	{
		System.out.println("Of How many numbers do you want to find the cuberoot of");
		int cuberootnum=Integer.parseInt(br.readLine());
		double E[]= new double[cuberootnum];
		double Ecuberoot[]= new double[cuberootnum];
		for(int i=0;i<cuberootnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			E[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<cuberootnum;i++)
		{
			Ecuberoot[i]=Math.pow(E[i],1/3);
		} 
		for(int i=0;i<cuberootnum;i++)
		{
			System.out.println("The cube of the "+(i+1)+" number is "+Ecuberoot[i]);
		}
	}
	public void mplus()throws IOException
	{
		System.out.println("Enter the number which you want to use in the operation");
		int mplusnum=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of times you want to press the M+ button");
		int button=Integer.parseInt(br.readLine());
		double mplusans=mplusnum*button;
		System.out.print("The answer is "+mplusans);
	}

	public void mminus()throws IOException
	{
		System.out.println("Enter the number which you want to use in the operation");
		int mminusnum=Integer.parseInt(br.readLine());
		System.out.println("Enter the number of times you want to press the M- button");
		int bbutton=Integer.parseInt(br.readLine());
		double mminusans=mminusnum-(bbutton*mminusnum);
		System.out.print("The answer is "+mminusans);
	}
	public void log()throws IOException
	{
		System.out.println("Of How many numbers do you want to find the log value of");
		int logarithmmain=Integer.parseInt(br.readLine());
		double F[]=new double[logarithmmain];
		double Flog[]=new double[logarithmmain];
		for(int i=0;i<logarithmmain;i++)
		{
			System.out.println("Enter the "+(i+1)+" number");
			F[i]=Integer.parseInt(br.readLine());
		}
		for(int i=0;i<logarithmmain;i++)
		{
			Flog[i]=Math.log(F[i]);
		} 
		for(int i=0;i<logarithmmain;i++)
		{
			System.out.println("The logarithm of the "+(i+1)+" number is "+Flog[i]);
		}
	}
	public void Factorial()throws IOException
	{
		int factoriala;
		int factoriald=1;
		System.out.print("Enter the mumber whose factorial is to be found ");
		factoriala=Integer.parseInt(br.readLine());
		for(int i=factoriala;i>=1;i--)

		{
			factoriald=factoriald*i;
			System.out.print(i+" X ");
		}
		System.out.println(" \n                "+factoriald);
	}
	public void sinosine()throws IOException
	{
		System.out.println("Of How many angles do you want to find the sinosine value");
		int sinonum=Integer.parseInt(br.readLine());
		double G[]=new double [sinonum];
		double Gsinosine[]=new double[sinonum];
		for(int i=0;i<sinonum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			G[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<sinonum;i++)
		{
			Gsinosine[i]=Math.sin(G[i]);
		}

		for(int i=0;i<sinonum;i++)
		{
			System.out.println("The sinosine value of the "+(i+1)+" angle is "+Gsinosine[i]);
		}
	}
	public void cosine()throws IOException
	{
		System.out.println("Of How many angles do you want to find the cosine value");
		int conum=Integer.parseInt(br.readLine());
		double H[]=new  double [conum];
		double Hcosine[]=new double[conum];
		for(int i=0;i<conum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			H[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<conum;i++)
		{
			Hcosine[i]=Math.cos(H[i]);
		}

		for(int i=0;i<conum;i++)
		{
			System.out.println("The cosine value of the "+(i+1)+" angle is "+Hcosine[i]);
		}
	}
	public void tangent()throws IOException
	{
		System.out.println("Of How many angles do you want to find the tangent value");
		int tannum=Integer.parseInt(br.readLine());
		double I[]=new double[tannum];
		double Itangent[]=new double[tannum];
		for(int i=0;i<tannum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			I[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<tannum;i++)
		{
			Itangent[i]=Math.tan(I[i]);
		}

		for(int i=0;i<tannum;i++)
		{
			System.out.println("The tangent value of the "+(i+1)+" angle is "+Itangent[i]);
		}
	}
	public void cotangent()throws IOException
	{
		System.out.println("Of How many angles do you want to find the cotangent value");
		int cotannum=Integer.parseInt(br.readLine());
		double J[]=new double[cotannum];
		double Jcotangent[]=new double[cotannum];
		for(int i=0;i<cotannum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			J[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<cotannum;i++)
		{
			Jcotangent[i]=(1/Math.tan(J[i]));
		}

		for(int i=0;i<cotannum;i++)
		{
			System.out.println("The cotangent value of the "+(i+1)+" angle is "+Jcotangent[i]);
		}
	}
	public void sec()throws IOException
	{
		System.out.println("Of How many angles do you want to find the sec value");
		int secnum=Integer.parseInt(br.readLine());
		double K[]=new double[secnum];
		double Ksec[]=new double[secnum];
		for(int i=0;i<secnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			K[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<secnum;i++)
		{
			Ksec[i]=(1/Math.cos(K[i]));
		}

		for(int i=0;i<secnum;i++)
		{
			System.out.println("The cotangent value of the "+(i+1)+" angle is "+ Ksec[i]);
		}
	}
	public void cosec()throws IOException
	{
		System.out.println("Of How many angles do you want to find the cosec value");
		int cosecnum=Integer.parseInt(br.readLine());
		double L[]=new double[cosecnum];
		double Lcosec[]=new double[cosecnum];
		for(int i=0;i<cosecnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" angle");
			L[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<cosecnum;i++)
		{
			Lcosec[i]=(1/Math.sin(L[i]));
		}

		for(int i=0;i<cosecnum;i++)
		{
			System.out.println("The cotangent value of the "+(i+1)+" angle is "+Lcosec[i]);
		}
	}
	public void Asinosine()throws IOException
	{
		System.out.println("Of How many values do you want to find the sinosine angles");
		int asinonum=Integer.parseInt(br.readLine());
		double Ga[]=new double [asinonum];
		double Gasinosine[]=new double[asinonum];
		for(int i=0;i<asinonum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			Ga[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<asinonum;i++)
		{
			Gasinosine[i]=Math.asin(Ga[i]);
		}

		for(int i=0;i<asinonum;i++)
		{
			System.out.print("The sinosine angle of the "+(i+1)+" value is "+Gasinosine[i]);
		}
	}
	public void Acosine()throws IOException
	{
		System.out.println("Of How many values do you want to find the cosine angles");
		int aconum=Integer.parseInt(br.readLine());
		double Ha[]=new  double [aconum];
		double Hacosine[]=new double[aconum];
		for(int i=0;i<aconum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			Ha[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<aconum;i++)
		{
			Hacosine[i]=Math.cos(Ha[i]);
		}

		for(int i=0;i<aconum;i++)
		{
			System.out.println("The cosine angle of the "+(i+1)+" value is "+Hacosine[i]);
		}
	}
	public void Atangent()throws IOException
	{
		System.out.println("Of How many values do you want to find the tangent angles");
		int atannum=Integer.parseInt(br.readLine());
		double Ia[]=new double[atannum];
		double Iatangent[]=new double[atannum];
		for(int i=0;i<atannum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			Ia[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<atannum;i++)
		{
			Iatangent[i]=Math.atan(Ia[i]);
		}

		for(int i=0;i<atannum;i++)
		{
			System.out.println("The tangent angle of the "+(i+1)+" value is "+Iatangent[i]);
		}
	}
	public void Acotangent()throws IOException
	{
		System.out.println("Of How many values do you want to find the cotangent angles");
		int acotannum=Integer.parseInt(br.readLine());
		double Ja[]=new double[acotannum];
		double Jacotangent[]=new double[acotannum];
		for(int i=0;i<acotannum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			Ja[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<acotannum;i++)
		{
			Jacotangent[i]=(1/Math.atan(Ja[i]));
		}

		for(int i=0;i<acotannum;i++)
		{
			System.out.println("The cotangent angle of the "+(i+1)+" value is "+Jacotangent[i]);
		}
	}
	public void Asec()throws IOException
	{
		System.out.println("Of How many values do you want to find the sec angles");
		int asecnum=Integer.parseInt(br.readLine());
		double Ka[]=new double[asecnum];
		double Kasec[]=new double[asecnum];
		for(int i=0;i<asecnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			Ka[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<asecnum;i++)
		{
			Kasec[i]=(1/Math.acos(Ka[i]));
		}

		for(int i=0;i<asecnum;i++)
		{
			System.out.println("The cotangent angle of the "+(i+1)+" value is "+ Kasec[i]);
		}
	}
	public void Acosec()throws IOException
	{
		System.out.println("Of How many values do you want to find the cosec angles");
		int acosecnum=Integer.parseInt(br.readLine());
		double La[]=new double[acosecnum];
		double Lacosec[]=new double[acosecnum];
		for(int i=0;i<acosecnum;i++)
		{
			System.out.println("Enter the "+(i+1)+" value");
			La[i]=Integer.parseInt(br.readLine());
		}

		for(int i=0;i<acosecnum;i++)
		{
			Lacosec[i]=(1/Math.asin(La[i]));
		}

		for(int i=0;i<acosecnum;i++)
		{
			System.out.println("The cotangent angles of the "+(i+1)+" value is "+Lacosec[i]);
		}
	}
}