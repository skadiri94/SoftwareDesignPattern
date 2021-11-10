package Decorator;

public class EncryptedCloudSteam implements Stream{
    private Stream stream;

    public EncryptedCloudSteam (Stream stream){
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data){
        return "adfagfjh%$#";
    }
}
