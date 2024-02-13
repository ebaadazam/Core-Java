// MARKER INTERFACE - an Interface with no method

interface Lockable {
    // No methods, just a marker
}

class SecureDocument implements Lockable {

    private String content;
    private boolean isLocked = true;

    public SecureDocument() {
        content = "The Password is not set";
        System.out.println("Document Details: " + content);
    }

    public void unLock() {
        isLocked = false;
        System.out.println("The Document has been UnLocked");
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        if (isLocked == false) {
            this.content = content;
        } else {
            System.out.println("Cannot Open SecureDocument: Document is locked.");
        }
    }
}

public class MarkerInterface {
    public static void main(String[] args) {

        SecureDocument obj = new SecureDocument();

        if (obj instanceof Lockable) {
            obj.unLock();
            obj.setContent("The Password is set to ebaad@azam");
        } else {
            System.out.println("You are not allowed to access the File Content");
        }

        System.out.println("Updated Document Details: " + obj.getContent());
    }
}
