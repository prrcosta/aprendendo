class Ex3138 {
	public static void main(String[] args) {
		int x = 0;
		int i;
		int y;
		for (x++; x <= 1; x = x) {
			i = 1;
			y = x * i;
			System.out.println(y);
			for (x++; x <= 2; x = x) {
				i = 1;
				y = x * i;
				System.out.print(y);
				i++;
				y = x * i;
				System.out.println(" "+y);
				for (x++; x <= 3; x = x) {
					i = 1;
					y = x * i;
					System.out.print(y);
					i++;
					y = x * i;
					System.out.print(" "+y);
					i++;
					y = x * i;
					System.out.println(" "+y);
					for (x++; x <= 4; x = x) {
						i = 1;
						y = x * i;
						System.out.print(y);
						i++;
						y = x * i;
						System.out.print(" "+y);
						i++;
						y = x * i;
						System.out.print(" "+y);
						i++;
						y = x * i;
						System.out.print(" "+y);
						x++;
					}
				}
			}
		}
	}
}