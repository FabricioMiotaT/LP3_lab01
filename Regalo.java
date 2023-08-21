public class Regalo {
	public static String elegir(int vida) {
		String gift = "";
		switch (vida) {
		case 3: gift =" un pasaje al caribe";
		case 2: gift = "un visita al museo";
		case 1: gift = "una entrada al cine";
		}
		return gift;
	}

}