public class ClientEvent {
    private Client client;
    public ClientEvent(Client client) {
        this.client = client;
    }
    
    public String getName() {
        return client.name;
    }//get
    
    public String getIp() {
        return client.ip;
    }//get
}//針對client事件 不同客戶做不同動作