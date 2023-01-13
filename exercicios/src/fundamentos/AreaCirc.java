package fundamentos;

public class AreaCirc {
	double PI = 3.14;
	double raio;
	
AreaCirc(){	
}
AreaCirc(double r){
	raio = r;
}
	
    double Area() {
    	return PI * Math.pow(raio, raio);
    }
}
