package basicJava;
public class ObjClassImplementation {
    public static void main(String[] args) {
       System.out.println("Object class implementation");
        Sample obj1 = new Sample();
        System.out.println(obj1.getClass().getName());
    }
}

class Sample extends Object {
    int data = 20;
    
    public Sample() {
        int data = 10;
        System.out.println("Constructor called, data = " + data);
    }

    public Sample(int data) {
        this.data = data;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + data;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Sample other = (Sample) obj;
        if (data != other.data)
            return false;
        return true;
    }

    
}
