package APCS_2017_03_04;

public class c290_CreditCard {

	public static String checkCreditCard(String cardNo) {
		String result = "Wrong card number!!";
		try {
			// length validation must bigger than sixteen.
			int length = cardNo.length();
			if (length == 16) {

				String type = "";
				if (cardNo.substring(0, 2).compareTo("50") >= 0) {
					type = "Master";
				} else if (cardNo.substring(0, 1).equals("4") == true) {
					type = "Visa";
				}

				// separate the card number.
				char[] sepCard = cardNo.toCharArray();
				// create a new array.
				int[] newCard = new int[16];

				for (int i = 0; i < sepCard.length; i++) {
					if ((i + 1) % 2 == 0) {
						newCard[i] = Character.digit(sepCard[i], 10);
					} else {
						newCard[i] = Character.digit(sepCard[i], 10) * 2;
						if (newCard[i] > 9)
							newCard[i] -= 9;
					}
				}

				int sum = 0;
				for (int i = 0; i < newCard.length; i++) {
					sum += newCard[i];
				}

				if (sum % 10 == 0)
					result = type + " card.";
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

	public static void main(String argv[]) {

		String cardNo = "5432123456788881";
		System.out.print(checkCreditCard(cardNo));

	}

}
