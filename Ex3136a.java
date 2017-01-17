class Ex3136a {
	public static void main(String[] args) {
		int i = 1;
		int x = 0;
		System.out.println(x);
		System.out.println(i);
		for (x = 0; x <= 55; x = x)  {
			i = i + x;
			x = i - x;
			System.out.println(i);
		}
	}
}