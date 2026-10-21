/*
 * Normal.java
 * 
 * Copyright 2026 Guilherme Castro <guigos@guilherme-aspirea51545>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class Normal extends Ingresso {
	
    private boolean pista;
    
    public Normal(Double valor, boolean pista){
        super(valor);
        this.pista = pista;
    }
    
    @Override
    public String mostrarValor(){
        if(!pista)
            return super.mostrarValor();
        else 
            return "R$" + (getValor() + (getValor() * 0.1)) ;
    }
    
    public boolean getPista() {
        return this.pista;
    }
    
    public void setPista(boolean pista) {
        this.pista = pista;
    }
    
    public String toString(){
        return 
            "\nTipo de Ingresso: Normal" +
            "\nAcesso a pista: " + ((pista)?  "Sim" : "Não" );
    }
}

