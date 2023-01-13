package classe;



public class DataTeste {
	public static void main(String[] args) {
		
		
		
		Data data = new Data();
		
		var data2 = new Data(15,12,1998);
		
		
		String dataFormatada1 = data.obterDataFormatada();
		System.out.println(dataFormatada1);
		System.out.printf(data2.obterDataFormatada());
		
	}
}
