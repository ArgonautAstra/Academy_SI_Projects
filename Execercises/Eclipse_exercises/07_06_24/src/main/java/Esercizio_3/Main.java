package Esercizio_3;

public class Main {

	public static void main(String[] args) {

		PaymentMethod[][] PaymentMethods = new PaymentMethod[2][2];
		
		try {
		PaymentMethods[0][0] = new PayPal(12345, 5000);
		PaymentMethods[0][1] = new CreditCard(12345, 10000);
		PaymentMethods[1][0] = new PayPal(54321, -5000);
		PaymentMethods[1][1] = null;
		}catch(InvalidUserException e){
			System.out.println(e.toString());
		}catch(NegativeBalanceException e){
			System.out.println(e.toString());
		}
		
		for(int i = 0; i < 2; i++) {
			
			try {
				if(!PaymentMethods[i][0].processPayment(6000)) {
					if(PaymentMethods[i][1] != null) {
						PaymentMethods[i][1].processPayment(6000);
					}else{
						System.out.println("Và travagghia");
					}
				}
			}catch(NullPointerException e) {
				System.out.println("Và travagghia");
			}
			
			System.out.println("");
		}
		


	}

}
