package com.developer.david.apprestaurant;

public class itemRestaurant {

    public String Name;
    public String Nid;
    public String Owner;
    public String Streed;
    public String Phone;

    public int id;

    public void setNombre​(String nombre​){
        this.Name = nombre​;
    }
    public void setNit​(String nit​){ this.Nid = nit​; }
    public void setPropietario(String propietario){this.Owner = propietario;}
    public void setCalle(String calle){
        this.Streed = calle;
    }
    public void setTelefono​(String telefono​){ this.Phone = telefono​;}

    public int getId​(){
        return this.id;
    }
    public String getNombre(){ return  this.Name; }
    public String getNit(){
        return  this.Nid;
    }
    public String getPropietario(){
        return  this.Owner;
    }
    public String getCalle(){
        return  this.Streed;
    }
    public String getTelefono​(){
        return this.Phone;
    }
}
