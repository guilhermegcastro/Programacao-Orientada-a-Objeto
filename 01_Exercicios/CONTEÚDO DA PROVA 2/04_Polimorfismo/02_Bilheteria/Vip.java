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


public class Vip extends Ingresso {
	
    protected Double adicional;
    
    public Vip(Double valor, Double adicional){
        super(valor);
        this.adicional = adicional;
    }
    
    @Override
    public String mostrarValor(){
            return "R$" + (getValor() + adicional);
    }
    
    public Double getAdicional() {
        return this.adicional;
    }
    
    public void setAdicional(Double adicional) {
        this.adicional = adicional;
    }
    
    public String toString(){
        return
            "Tipo de Ingresso: VIP" +
            "\nValor adicional: R$" + adicional;
    }
}

