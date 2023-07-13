package prueba.listas;

public class ListItem {
    public String name;
    public String type;
    public int cantidad;

    public ListItem(){
        this("default Item", "defautl type");
    }

    public ListItem(String name, String type){
        this.name = name;
        this.type = type;
        this.cantidad = 0;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return this.type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getCantidad() {
        return this.cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}
