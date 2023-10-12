public class Token {
    public static String Operator = "OP";
    
    private String name;
    private String attribute;

    public Token(String name, String attribute) {
        this.name = name;
        this.attribute = attribute;
    }

    public Token(String name) {
        this.name = name;
        this.attribute = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String toString() {
        return attribute == null ? name : "(" + name + ", \"" + attribute + "\")";
    }
}
