package singleton;

public class ConnectDB {
    private String host;
    private String port;
    private String user;
    private String password;
    private String db;

    private static ConnectDB instance = null;

    private ConnectDB(String host, String port, String user, String password, String db) {
        this.host = host;
        this.port = port;
        this.user = user;
        this.password = password;
        this.db = db;
    }

    public static ConnectDB getInstance() {
        if (instance == null) {
            instance = new ConnectDB("127.0.0.0", "3306", "root", "", "d06");
        }
        return instance;
    }
}
