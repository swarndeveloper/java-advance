package AdvanceJava.Interface;

interface Computer {
    void officeWork(Computer computer);

    void gaming(Computer computer);

    void programming(Computer computer);

}

class OfficeComputer implements Computer {
    public void officeWork(Computer computer) {
        System.out.println("Performing office work.");
    }

    @Override
    public void gaming(Computer computer) {
        System.out.println("Gaming is not the primary function of an office computer.");
    }

    @Override
    public void programming(Computer computer) {
        System.out.println("Programming on an office computer.");
    }
}

class GamingComputer implements Computer {
    @Override
    public void officeWork(Computer computer) {
        System.out.println("Office work is not the primary function of a gaming computer.");
    }

    @Override
    public void gaming(Computer computer) {
        System.out.println("Playing high-end games.");
    }

    @Override
    public void programming(Computer computer) {
        System.out.println("Programming on a gaming computer.");
    }
}


public class OfficeInterface {
    public static void main(String[] args) {
        Computer officeComputer = new OfficeComputer();
        officeComputer.officeWork(officeComputer);
        officeComputer.gaming(officeComputer);
        officeComputer.programming(officeComputer);

        Computer gamingComputer = new GamingComputer();
        gamingComputer.officeWork(gamingComputer);
        gamingComputer.gaming(gamingComputer);
        gamingComputer.programming(gamingComputer);
    }

}
