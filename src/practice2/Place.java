package practice2;

public class Place {
    int code1;
    int code2;
    int code3;
    int code4;
    String status;
    String name;

    public Place(int code1, int code2, int code3, int code4, String status, String name) {
        this.code1 = code1;
        this.code2 = code2;
        this.code3 = code3;
        this.code4 = code4;
        this.status = status;
        this.name = name;
    }

    public int getCode1() {
        return code1;
    }

    public int getCode2() {
        return code2;
    }

    public int getCode3() {
        return code3;
    }

    public int getCode4() {
        return code4;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(code1).append(';')
                .append(code2).append(';')
                .append(code3).append(';')
                .append(code4).append(';')
                .append(status).append(' ').append(name);
        return sb.toString();
    }
}
