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
		boolean flag = false;
    	for (int i = 2; i <= value / 2; ++i) {
      		if (value % i == 0) {
        		flag = true;
        		break;
      		}
   		}
		return flag;
	}

	public static boolean isEven(int intIn) {
        return (intIn % 2) == 0;
    }
	public static boolean isOdd(int intIn) {
        return (intIn % 2) == 1;
    }
	public static boolean isPrime(int intIn) {
		boolean flag = false;
    	for (int i = 2; i <= intIn / 2; ++i) {
      		if (intIn % i == 0) {
        		flag = true;
        		break;
      		}
   		}
		return flag;
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