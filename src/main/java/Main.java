class Main {


/*10*/
	
	public static int a(int n) {
		if(n==1) {
			return 1*2;
		}
		if(n%2==0) {
			return a(n-1)+n*n;
		}
		return a(n-1)*2;
	}
	
/*11*/
	
	public static double b(int n ,int a,int k,int c) { 
		if(n==c) {
		return a-Math.sqrt(k);	
		}
		return b(n,a+4,k+4,c+1)+(a-Math.sqrt(k));
	}
	
/*12*/
	
	public static int c(int n1,int n2,int a) {
		if(a*n2>=n1) {
			return 0;
		}
		return c(n1,n2,a+1)+a*n2;
	}
	
/*13*/
	
	public static int d(int a,int b,int c) {
		if(c==1) {
			return a;
		}
		return d(b,a*a+b*b,c-1);
	}
	
	
/*21*/
	

    public static int e(String str, int index) {
        if (index == str.length()) {
            return 0;
        }
        
        int count = 0;
        if (str.charAt(index) >= 'a' && str.charAt(index) <= 'z') {
            count = 1;
        }
        
        return count + e(str, index + 1);
    }
	    
/*22*/
	    

	    public static String f(String str, int index) {
	        if (index >= str.length()) {
	            return "";
	        }
	        if (index > 0 && index % 3 == 0) {
	            return "*" + str.charAt(index) + f(str, index + 1);
	        }
	        return str.charAt(index) + f(str, index + 1);
	    }
	    
/*23*/
	    
	        public static String g(String str, int index) {
	            if (index == str.length()) {
	                return "";
	            }

	            return g(str, index + 1) + str.charAt(index);
	        }
	        
/*24*/

	        public static void h(char start, char end) {
	            if (start > end) {
	                return;
	            }

	            System.out.print(start + " ");

	            h((char) (start + 1), end);
	        }
/*25*/
	        

	        public static void printDivisors(int n, int divisor) {
	            if (divisor > n) {
	                return;
	            }
	            
	            if (n % divisor == 0) {
	                System.out.print(divisor + " ");
	            }
	  	            printDivisors(n, divisor + 1);
	        }
	        
/*26*/

	        public static void i(int n) {
	            if (n == 0) {
	                return;
	            }
	            int lastDigit = n % 10;
	            if (lastDigit % 2 == 0) {
	                System.out.print(lastDigit + " ");
	            }
	            
	            i(n / 10);
	        }
	        
/*27*/
	        
	    	    public static void j(int i, int k) {
	    	        if (k > 10) {
	    	            if (i < 10) {
	    	                System.out.println(); 
	    	                j(i + 1, 1); 	            }
	    	            return;
	    	        }
	    	        System.out.print(i * k + "\t");
	    	        j(i, k + 1);
	    	    }
/*28*/
	    	    
	    	    public static void k(int a1, int d, int n) {
	    	        if (n == 0) {
	    	            return;
	    	        }
	    	        
	    	        System.out.print(a1 + " ");
	    	        
	    	        k(a1 + d, d, n - 1);

	    	    }
/*29*/
	    	    

	    	    public static void l(int current, int increment, int n) {
	    	        if (n == 0) {
	    	            return;
	    	        }
	    	        
	    	        System.out.print(current + " ");
	    	        
	    	        l(current + increment, increment + 1, n - 1);
	    	    }
	    	    
/*30*/
	    	    
	    	    public static void m(int n, int current, boolean isIncrease) {
	    	        if (n == 0) return;
	    	        System.out.print(current + " ");
	    	        if (isIncrease) {
	    	            m(n - 1, current + 1, false);
	    	        } else {
	    	            m(n - 1, current - 1, true);
	    	        }}
	    	    
/*31*/
	    	    
	    	    public static void n(int r, int current, boolean isIncrease) {
	    	        if (r == 0) return;
	    	        System.out.print(current + " ");
	    	        if (isIncrease) {
	    	            n(r - 1, current + 1, false);
	    	        } else {
	    	            n(r - 1, current - 1, true);
	    	        }}
/*32*/
	    	    
	    	    public static void o(int[] arr, int index) {
	    	   	 if (index >= arr.length-1) {
	    	   	 return;
	    	   	 }
	    	   	 if (arr[index] < arr[index+1]) {
	    	   	 System.out.println(arr[index]);
	    	   	 }
	    	   	 o(arr, index + 1);
	    	    }
	    	    
/*42*/
	    	    public static int p(int n) { 
	    	           if (n<10) {
	    	           return n;
	    	       }
	    	       int sum = 0;
	    	       while (n >0) {
	    	           sum += n /10;  
	    	           n /= 10; 
	    	       }

	    	        return p(sum);
	    	    }
