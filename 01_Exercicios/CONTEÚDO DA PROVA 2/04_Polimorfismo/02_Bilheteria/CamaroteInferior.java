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


public class CamaroteInferior extends Vip {
	
    private String localizacao;
    
    public CamaroteInferior(Double valor, Double adicional, String localizacao){
        super(valor, adicional);
        this.localizacao = localizacao;
    }
    
    @Override
    public String mostrarValor(){
        Double valor = getValor() + getAdicional();
        if(localizacao.toLowerCase().equals("lateral"))
            return "R$" + (valor + (valor * 0.2));
        else if(localizacao.toLowerCase().equals("frontal"))
            return "R$" + (valor + (valor * 0.35));
        else 
            return super.mostrarValor();
    }
    
    public String getLocalizacao() {
        return this.localizacao;
    }
    
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    
    public String toString(){
        return 
            super.toString() + 
            "\n Camarote Inferior: " + localizacao.toLowerCase();
    }
}

