package gt.edu.url.examen1.impl;

import gt.edu.url.examen1.api.Demo;

/**
 *
 * @author luzdiny1806
 * @param <String>
 */
public class DemoImpl implements Demo{

	private String saludar;
	
    //@Override
    
    public DemoImpl(String saludar){
    	this.saludar = saludar;
    }
    
    public String saludar() {
        return this.saludar + ", Este es el proyecto de Luz Rodríguez.";
    }
    
}
