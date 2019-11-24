public class Device {

    private String name;
    private String address;
    private String productionType;
    private String devices;

    Device(String address, String productionType, String devices) {

        this.address = address;
        this.productionType = productionType;
        this.devices = devices;
    }

    public String getaddress() {
        return address;
    }

    public String productionType() {
        return productionType;
    }

    public String devices() {
        return devices;
    }

}




