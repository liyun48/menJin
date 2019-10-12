package bean;

public class User {
    private int JID;
    private String name;
    private String pwd;
    private int CID;
    private int FID;
    private int FaceID;

    public User() {
    }

    public User(int JID, String name, String pwd, int CID, int FID, int faceID) {
        this.JID = JID;
        this.name = name;
        this.pwd = pwd;
        this.CID = CID;
        this.FID = FID;
        FaceID = faceID;
    }

    public User(int JID, String name){
        this.JID = JID;
        this.name = name;
    }

    public int getJID() {
        return JID;
    }

    public void setJID(int JID) {
        this.JID = JID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public int getCID() {
        return CID;
    }

    public void setCID(int CID) {
        this.CID = CID;
    }

    public int getFID() {
        return FID;
    }

    public void setFID(int FID) {
        this.FID = FID;
    }

    public int getFaceID() {
        return FaceID;
    }

    public void setFaceID(int faceID) {
        FaceID = faceID;
    }

    @Override
    public String toString() {
        return "User{" +
                "JID=" + JID +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", CID=" + CID +
                ", FID=" + FID +
                ", FaceID=" + FaceID +
                '}';
    }
}
