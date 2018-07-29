package Week4;


class UfoPiloot{
	void vliegen(long afstand) {
		System.out.println("Afstand in long ");
		}
		void vliegen(int afstand) {
		System.out.println("afstand in int	");
		}
		void vliegen(String ufo) {
		System.out.println("Ufo");
		}
		void vliegen(Object alien) {
		System.out.println("Alien");
		}
}		
		class VraagVoorMyrthe {
		public static void main(String[] args) {
			UfoPiloot ufopiloot = new UfoPiloot();
			char c = 20;
			ufopiloot.vliegen(c);
			ufopiloot.vliegen("alien");
}
}