package controller;

public class ControllerBinario {
	
	public ControllerBinario() {
		super();
	}
	
	public String binario(int num, String binario) {
		if(num > 0) { //A condição de parada será quando o num não puder ser mais dividido
			if((num%2) == 0) {
				binario = "0" + binario;
			}else {
				binario = "1" + binario;
			}
			num = (int)num/2;
			binario = binario(num, binario); // 
			return binario;
		}else {
			System.out.println(binario);
			return binario;
		}
	}
	
}
