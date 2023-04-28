package data;

public enum User {
    ME("hipstakrippo@gmail.com"),
    SERGEY200("sereza200500@gmail.com"),
    SERGEY300("sereza300500@gmail.com"),
    ZAUR("zaurchik.ogurchik@gmail.com"),
    ;

    private final String EMAIL;
    User( String email) {
        EMAIL = email;
    }
    public String getEMAIL() {
        return EMAIL;
    }
}
