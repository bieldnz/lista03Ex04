package view;

import controller.ControllerBinario;

public class Principal {
	public static void main(String[] args) {
		
		ControllerBinario controller = new ControllerBinario();
		
		String result = controller.binario(3, "");
		
		System.out.println(result);
		
	}
}
