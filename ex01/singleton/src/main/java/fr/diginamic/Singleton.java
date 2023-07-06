package fr.diginamic;

public class Singleton {
    private String message =" Mon message";
    private static Singleton instance;

    private Singleton() {
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public static Singleton getInstance() {
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }


    @Override
    public Singleton clone() throws CloneNotSupportedException {
            throw new CloneNotSupportedException("Clonage interdit");
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Singleton{");
        sb.append("message='").append(message).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
