package classe;

public class valorVsReferencia {
	public static void main(String[] args) {
		double a = 2;
		double b = a; // atribuição por valor
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		Data d1 = new Data(1, 6, 2022);
		
		d1.dia=0;
		d1.ano=0;
		d1.mes=0;
		
		Data d2 = d1; // atribuicação por referencia
		
		System.out.println(d2.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
		
		voltaDataParaPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d1.obterDataFormatada());
		
		int c = 5;
		
		alterarPrimitivo(5);
		
		System.out.println(c);
	}
	
	static void voltaDataParaPadrao( Data d){
		d.dia = 1;
		d.mes = 1;
		d.ano = 1970;
		
	}
	
	static void alterarPrimitivo(int a) {
		
		a++;
	}
}
