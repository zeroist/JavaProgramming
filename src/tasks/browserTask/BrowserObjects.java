package tasks.browserTask;
public class BrowserObjects {
    public static void main(String[] args) {
        ChromeBrowser chromeBrowser1=new ChromeBrowser();
        FireFox fireFox1=new FireFox();
        Opera opera1=new Opera();
        Safari safari1=new Safari();
        chromeBrowser1.openBrowser();
        chromeBrowser1.closeBrowser();
        fireFox1.openBrowser();
        fireFox1.closeBrowser();
        opera1.openBrowser();
        opera1.closeBrowser();
        safari1.openBrowser();
        safari1.closeBrowser();
    }
}
