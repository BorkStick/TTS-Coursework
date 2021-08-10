// Minimum 3 private instance variables
// An empty constructor
// A constructor that uses only 2 of your 3 variables
// A constructor that uses all 3 of your instance variables
// Get methods for all 3 of your instance variables and Set methods for all 3 of your instance variables
// A method that returns a Boolean
// A method that returns a String (For example, if I created a Santa Custom

public class Servers {
    private String hostname;
    private int ip;
    private String service;

    public Servers(){}

    public Servers(String hostname, int ip) {
        this.hostname = hostname;
        this.ip = ip;
    }

    public String getServerHostname() {
        return hostname;
    }

    public void setServerName(String hostname) {
        this.hostname = hostname;
    }

    public int getServerIp() {
        return ip;
    }

    public void setServerIp(int ip) {
        this.ip = ip;
    }

    public String getServerService() {
        return service;
    }

    public void setLocation(String service) {
        this.service = service;
    }

    public boolean isOnline() {
        return true;
    }

    public String motd() {
        return "This is a test motd";
    }


    public Servers(String hostname, int ip, String service) {
        this.hostname = hostname;
        this.ip = ip;
        this.service = service;
    }

    public static void main(String[] args) {
        Servers servers = new Servers("ubuntu", 10, "nginx");
        System.out.println("hostname: "+servers.getServerHostname());
        System.out.println("ip: "+servers.getServerIp());
        System.out.println("service: "+servers.getServerService());
        System.out.println("online: "+servers.isOnline());

    }
}
