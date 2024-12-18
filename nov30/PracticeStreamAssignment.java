package nov30;

import java.util.*;
import java.util.stream.Collectors;

public class PracticeStreamAssignment {

    public static void main(String[] args) {
//        List<SocialMediaPost> socialMediaPosts = Arrays.asList(new SocialMediaPost("amit", "java tutorials", 5000, 2500),
//                new SocialMediaPost("rahul", "python tutorials", 3000, 1500),
//                new SocialMediaPost("naveen", "ruby tutorials", 2500, 1250),
//                new SocialMediaPost("pavan", "selenium tutorials", 4000, 2000));
//
//        // Groups the posts by user.
//        Map<String, List<SocialMediaPost>> userMapPosts = socialMediaPosts.stream().collect(Collectors.groupingBy((a) -> a.getUser()));
//        System.out.println("userMapPosts = " + userMapPosts);
//
//        // For each user, calculate the total likes, total shares, and the average number of likes per post.
//        Map<String, List<Integer>> userMapLikes = socialMediaPosts.stream().collect(Collectors.groupingBy((d) -> d.getUser(), Collectors.mapping((a) -> a.getNumberOfLikes(), Collectors.toList())));
//        System.out.println("userMapLikes = " + userMapLikes);
//
//        Map<String, List<Integer>> userMapShares = socialMediaPosts.stream().collect(Collectors.groupingBy((d) -> d.getUser(), Collectors.mapping((a) -> a.getNumberOfShares(), Collectors.toList())));
//        System.out.println("userMapLikes = " + userMapShares);

        //Problem 2 Movies
        List<Movie> movieList = Arrays.asList(new Movie("abc", "horror", 7, 2012),
                new Movie("def", "action", 6, 2013),
                new Movie("fg", "drama", 8, 2015),
                new Movie("xy", "comedy", 9, 2017),
                new Movie("fd", "comedy", 4, 2010),
                new Movie("sc", "comedy", 5, 2016),
                new Movie("red", "drama", 7, 2020),
                new Movie("xoi", "drama", 2, 2014),
                new Movie("ki", "horror", 5, 2010),
                new Movie("po", "horror", 8, 2016),
                new Movie("opuy", "action", 2, 2017),
                new Movie("iu", "action", 8, 2010));

        // Group movies by genre
        Map<String, List<Movie>> movieGenreMap = movieList.stream().collect(Collectors.groupingBy((m) -> m.getGenre()));
        System.out.println("movieGenreMap = " + movieGenreMap);

        // Calculate the average rating for each genre
        Map<String, Double> averageMapGenreeRating = movieList.stream()
                .collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.averagingInt((m) -> m.getRating())));
        System.out.println("average = " + averageMapGenreeRating);
        Collection<Double> values = averageMapGenreeRating.values();
        List<Double> collect = values.stream().sorted((a, b) -> Double.compare(b, a)).collect(Collectors.toList());
        System.out.println("collect = " + collect);


        // Find the highest-rated movie in each genre
//        Map<String, Optional<Movie>> movieRatingGenreeMap = movieList.stream()
//                .collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.maxBy((m1, m2) -> m1.getRating() - m2.getRating())));
//        System.out.println("collect = " + movieRatingGenreeMap);

        Map<String, Optional<Integer>> movieRatingGenreeMap1 = movieList.stream()
                .collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.mapping((m) -> m.getRating(), Collectors.maxBy((m1, m2) -> m1 - m2))));
        movieRatingGenreeMap1.forEach((a, b) -> System.out.println("movie genre: " + a + " highest rating: " + b.get()));

        // For each genre, find the count of movies released in the 2000s and the 2010s
        Map<String, Long> movieCountMap = movieList.stream().filter((m) -> m.getReleaseYear() == 2010).collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.counting()));
        System.out.println("movieCountMap = " + movieCountMap);

        // Sort genres by the average rating in descending order
       // movieList.stream().sorted((a,b)->a.getGenre().compareTo(b.getGenre()));
//        Map<String, Double> collect1 = movieList.stream().collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.averagingInt((m) -> m.getRating(),Collectors.toMap((a)->a,(b)->b))));
//        System.out.println("collect1 = " + collect1);

        




    }


}

class SocialMediaPost {
    private String user;
    private String content;
    private int numberOfLikes;
    private int numberOfShares;

    public SocialMediaPost(String user, String content, int numberOfLikes, int numberOfShares) {
        this.user = user;
        this.content = content;
        this.numberOfLikes = numberOfLikes;
        this.numberOfShares = numberOfShares;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public int getNumberOfLikes() {
        return numberOfLikes;
    }

    public void setNumberOfLikes(int numberOfLikes) {
        this.numberOfLikes = numberOfLikes;
    }

    public int getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(int numberOfShares) {
        this.numberOfShares = numberOfShares;
    }

    @Override
    public String toString() {
        return "SocialMediaPost{" +
                "user='" + user + '\'' +
                ", content='" + content + '\'' +
                ", numberOfLikes=" + numberOfLikes +
                ", numberOfShares=" + numberOfShares +
                '}';
    }


}

class Movie {
    private String title;
    private String genre;
    private int rating;
    private int releaseYear;

    public Movie(String title, String genre, int rating, int releaseYear) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.releaseYear = releaseYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating=" + rating +
                ", releaseYear=" + releaseYear +
                '}';
    }
}
