/*You are given four classes — Publication, Newspaper, Article and
Announcement. You need to override methods getType() and getDetails() in
classes inherited from the class Publication.
Then you need to implement getInfo() in the class Publication using getType()
and getDetails(). The method should return a String with a type of publication
in the first place, then details in round brackets and the title after a colon.
Examples are shown below. Input is creating an object and giving parameters as
listed below. And output is when calling the getInfo() method through Publication
reference.

Sample Input 1: Publication; The new era
Sample Output 1: Publication: The new era
Sample Input 2: Newspaper; Football results; Sport news
Sample Output 2: Newspaper (source - Sport news): Football results
Sample Input 3: Article; Why the Sun is hot; Dr James Smith
Sample Output 3: Article (author - Dr James Smith): Why the Sun is hot
Sample Input 4: Announcement; Will sell a house; 30
Sample Output 4: Announcement (days to expire - 30): Will sell a house*/
public class Main {
    public static void main(String[] args) {
        Publication announ_1 = new Announcement("Will sell a house",30);
        Publication article_1 = new Article("Why the sun is hot", "Dr James Smith");
        Publication newspap_1 = new Newspaper("Football results", "Sport news");
        Publication public_1 = new Publication("The new era");

        about(public_1);
        about(newspap_1);
        about(article_1);
        about(announ_1);
    }
    private static void about(Publication publication){
        System.out.println(publication.getInfo());
    }
}