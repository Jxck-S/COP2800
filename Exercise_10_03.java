public class Exercise_10_03 {
    public static void main(String[] args) {
        MyInteger int1 = new MyInteger(5);
        MyInteger int2 = new MyInteger(56);
        MyInteger int3 = new MyInteger(2);
        MyInteger int4 = new MyInteger(23);

        System.out.printf("%d is prime? %s%n", int1.getValue(), int1.isPrime());
        System.out.printf("%d is prime? %s%n", int2.getValue(), int2.isPrime());
        System.out.printf("%d is prime? %s%n", int3.getValue(), int3.isPrime());

        System.out.printf("%d is even? %s%n", int1.getValue(), int1.isEven());
        System.out.printf("%d is even? %s%n", int2.getValue(), int2.isEven());
        System.out.printf("%d is even? %s%n", int3.getValue(), int3.isEven());

        System.out.printf("93 is odd? %s%n", MyInteger.isOdd(93));
        
        System.out.printf("%d equals %d? %s%n", int1.getValue(), int4.getValue(), int1.equals(int4));

        System.out.printf("%d%n", MyInteger.parseInt(new char[] {'1', '5', '6'}));
        System.out.printf("%d%n", MyInteger.parseInt("454"));
    }
}
class MyInteger{
	private int value;

	public MyInteger (int uno) {
		value = uno;
	}

    public int getValue(){
		return value;
	}

	public boolean isEven() {
		if (value % 2 == 0){
			return true ;
		}
		else{
			return false;
		}
	}
	public boolean isOdd() {
		if (value % 2 == 1){
			return true;
		}
		else{
			return false;
		}
	}
	public boolean isPrime() {
        if (value == 1 ) {
            return false;
        }
        if (value == 2){
            return true;
        }
        else {
            for (int i = 2; i < value; i++) {
                if (i % value == 0) return false;
            }
        }
        return true;
	}

	public static boolean isEven(int intIn) {
        return (intIn % 2) == 0;
    }
	public static boolean isOdd(int intIn) {
        return (intIn % 2) == 1;
    }
	public static boolean isPrime(int intIn) {
        if (intIn == 1 ) {
            return false;
        }
        if (intIn == 2){
            return true;
        }
        else {
            for (int i = 2; i < intIn; i++) {
                if (i % intIn == 0) return false;
            }
        }
        return true;
	}
	public static boolean isEven(MyInteger intIn) {
        return intIn.isEven();
    }

    public static boolean isOdd(MyInteger intIn) {
        return intIn.isOdd();
    }

    public static boolean isPrime(MyInteger intIn) {
        return intIn.isPrime();
    }
	public boolean equals(int intIn) {
		if (intIn == value) {
            return true;
		}
        return false;
    }
	public boolean equals(MyInteger intIn) {
		if (intIn.value == this.value) {
            return true;
		}
        return false;
    }
	public static int parseInt(char[] valIn) {
    	int sum = 0;
        for (char i : valIn) {
            sum += Character.getNumericValue(i);
        }
        return sum;
    }
    public static int parseInt(String valIn) {
        return Integer.parseInt(valIn);
    }
}