/*You are writing the application which collects information about what
sites were visited by what users. There are three classes: User, WebSite
and Visit. Many fields and methods of these classes are the same.
Write a new base abstract class named BaseEntity. Provided classes must extend
it. Move all repeating fields and methods to the new class.*/
public class Main {
    public static void main(String[] args) {
        //Sample code for running
        User user = new User();
        user.setName("John Grant");
        BaseEntity userEntity = user;
        userEntity.setId(100);
        userEntity.setVersion(1);
        WebSite site = new WebSite();
        site.setUrl("https://tekwill.md");
        BaseEntity siteEntity = site;
        siteEntity.setId(101);
        siteEntity.setVersion(1);
        Visit visit = new Visit();
        visit.setUser(user);
        visit.setSite(site);
        BaseEntity baseVisit = visit;
        baseVisit.setId(102);
        baseVisit.setVersion(103);
    }
}