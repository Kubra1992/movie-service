package movieTheater;

public class Child extends Person implements Mother, Father, Society {

    @Override
    public void beKind() {

    }

    @Override
    public void getAngry() {

    }

    @Override
    public void worryAboutOthers() {

    }
}

class Person{
    String name;
    int age;
}

interface Mother{
    public void beKind();
}
interface Father{
    public void getAngry();
}

interface Society{
    public void worryAboutOthers();
}

