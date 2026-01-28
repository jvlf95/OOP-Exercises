package POO.Ex27;

public class Title implements Comparable<Title>{
    private String name;

    public Title(String name){
        setName(name);
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    @Override
    public int compareTo(Title outroTitulo) {
        return this.getName().compareTo(outroTitulo.getName());
    }

    @Override
    public String toString(){
        return "Name: " + getName();
    }
}
