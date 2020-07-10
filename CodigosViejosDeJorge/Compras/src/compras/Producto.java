/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Compras;

public class Producto {
    //Atributos de mis productos
        public int ID;
        public String Nombre;
        public String Categoria;
        public int Precio;
        public int Descuento;
        public int Estrellas;
        
        public Producto (Integer setID, String setNombre, String setCategoria, Integer setPrecio, Integer setDescuento, Integer setEstrellas){
            this.ID =setID; 
            this.Nombre= setNombre;
            this.Categoria= setCategoria;
            this.Descuento= setDescuento;
            this.Precio = setPrecio;
            this.Estrellas= setEstrellas;   
        }
        
        public int setID(int ID){
            return ID;
        }
        /*
        public String setNomre(){
    
        }
        
        public String setCategoria(){
    
        }
        
        public int setPrecio(){
    
        }
        
        public int setDescuento(){
    
        }
        
        public int setEstrellas(){
    
        }
        
        public int añadir(){
        
        }
        */

        
}

