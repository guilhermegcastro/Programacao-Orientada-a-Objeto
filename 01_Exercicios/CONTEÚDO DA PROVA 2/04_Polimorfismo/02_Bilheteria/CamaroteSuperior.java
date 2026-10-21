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


public class CamaroteSuperior extends Vip {
	
    private char classe;
    
    public CamaroteSuperior(Double valor, Double adicional, char classe){
        super(valor, adicional);
        this.classe = classe;
    }
    
    @Override
    public String mostrarValor(){
        Double valor = getValor() + getAdicional();
        if(Character.toLowerCase(classe) == 'a')
            return "R$" + (valor + (valor * 0.5));
        else if(Character.toLowerCase(classe) == 'b')
            return "R$" + (valor + (valor * 0.75));
        else 
            return super.mostrarValor();
    }
    
    public char getClasse() {
        return this.classe;
    }
    
    public void setClasse(char classe) {
        this.classe = classe;
    }
    
    public String toString(){
        return 
            super.toString() + 
            "\n Camarote Superior: Classe " + Character.toUpperCase(classe);
    }
}

