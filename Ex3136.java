class Ex3136 {
	public static void main(String[] args) {
		int i = 1;
		int x = 0;
		System.out.println(x);
		System.out.println(i);
		for (int y = 0; y <= 10; y++)  {
			i = i + x;
			x = i - x;
			System.out.println(i);
		}
	}
}