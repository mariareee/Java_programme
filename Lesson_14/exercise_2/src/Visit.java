public class Visit extends BaseEntity {
    protected WebSite site;
    protected User user;

    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }

    public WebSite getSite() {
        return site;
    }
    public void setSite(WebSite site) {
        this.site = site;
    }
}
