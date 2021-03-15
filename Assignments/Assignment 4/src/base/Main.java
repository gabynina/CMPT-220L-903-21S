package base;

public class Main {

    public static void main(String[] args) {
		int[] lista= {2,3,5,2,3,6,7,8,2};
		System.out.println(summation(lista));
	}

	static int summation(int[] givenlist){

    	int listlength = givenlist.length;
    	int total = 0;

    	for(int i =0; i<listlength; i++)
    		total += givenlist[i];

    	return total;
		}

    }

