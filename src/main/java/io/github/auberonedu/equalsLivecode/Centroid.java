package io.github.auberonedu.equalsLivecode;

public class Centroid {
    private int r;
    private int c;
    private String name;
    
    public Centroid(int r, int c, String name) {
        this.r = r;
        this.c = c;
        this.name = name;
    }

    public int getR() {
        return r;
    }

    public int getC() {
        return c;
    }

    public String getName() {
        return name;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + r;
        result = prime * result + c;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (getClass() != obj.getClass()) return false;
        Centroid other = (Centroid) obj;
        if (r != other.r) return false;
        if (c != other.c) return false;
        return true;
    }

    /*
    @Override
    public int hashCode() {
        return r + c;
    }

    @Override
    public boolean equals(Object other) {
        if(other == null) return false;
        if(!this.getClass().equals(other.getClass())) return false; //technically can remove this
        Centroid otherCentroid = (Centroid) other;
        return this.r != otherCentroid.r || this.c != otherCentroid.c; //|| !name.equals(otherCentroid.name)
        //if(this.name == null) { return otherCentroid.name == null; }
        //return name.equals(otherCentroid.name);
    }
    */
}
