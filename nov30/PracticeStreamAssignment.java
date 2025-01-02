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

        // Find the highest-rated movie in each genre
        Map<String, Optional<Integer>> movieRatingGenreeMap1 = movieList.stream()
                .collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.mapping((m) -> m.getRating(), Collectors.maxBy((m1, m2) -> m1 - m2))));
        movieRatingGenreeMap1.forEach((a, b) -> System.out.println("movie genre: " + a + " highest rating: " + b.get()));

        // For each genre, find the count of movies released in the 2000s and the 2010s
        Map<String, Long> movieCountMap = movieList.stream().filter((m) -> m.getReleaseYear() == 2010).collect(Collectors.groupingBy((m) -> m.getGenre(), Collectors.counting()));
        System.out.println("movieCountMap = " + movieCountMap);

        // Sort genres by the average rating in descending order
        Collection<Double> values = averageMapGenreeRating.values();
        List<Double> collect = values.stream().sorted((a, b) -> Double.compare(b, a)).collect(Collectors.toList());
        System.out.println("collect = " + collect);

        //Return a map of genres to a list of movie titles that have a rating of 8 or higher.
        Map<String, List<String>> mapGenreListMovieTitle = movieList.stream().filter((a) -> a.getRating() > 6)
                .collect(Collectors.groupingBy((b) -> b.getGenre(), Collectors.mapping((c) -> c.getTitle(), Collectors.toList())));
        System.out.println("mapGenreListMovieTitle = " + mapGenreListMovieTitle);

        //problem 3
        List<Shipment> shipment = Arrays.asList(new Shipment(101, 253, 67, 2, 24),
                new Shipment(102, 254, 68, 300, 25),
                new Shipment(103, 255, 69, 90, 26),
                new Shipment(104, 256, 70, 50, 27),
                new Shipment(105, 257, 71, 600, 28),
                new Shipment(106, 258, 72, 70, 29));

        //Groups shipments by supplier ID
        Map<Integer, List<Shipment>> shipmentMap = shipment.stream().collect(Collectors.groupingBy((a) -> a.getSupplierId()));
        System.out.println("shipmentMap = " + shipmentMap);

        //For each supplier, calculate the total quantity shipped for each item
        Map<Integer, Integer> supplierQuantityShippedMap = shipment.stream().collect(Collectors.toMap(Shipment::getSupplierId, Shipment::getQuantityShipped));
        System.out.println("supplierQuantityShippedMap = " + supplierQuantityShippedMap);

        //Identify items that have been shipped less than 100 units.
        List<Shipment> collect1 = shipment.stream().filter((a) -> a.getQuantityShipped() < 100).collect(Collectors.toList());
        System.out.println("collect1 = " + collect1);
//        Map<Integer, Integer> collect2 = shipment.stream().filter((a) -> a.getQuantityShipped() < 100).collect(Collectors.toMap((b) -> b.getShipmentId(), (c) -> c.getQuantityShipped()));
//        System.out.println("collect2 = " + collect2);

        //For the top 3 suppliers with the highest total shipments, return the list of items they shipped the most
        List<Shipment> collect2 = shipment.stream().sorted((a, b) -> b.getQuantityShipped() - a.getQuantityShipped()).collect(Collectors.toList());
        System.out.println("collect2 = " + collect2);
        List<Shipment> collect3 = shipment.stream().sorted(Collections.reverseOrder(Comparator.comparingInt(Shipment::getQuantityShipped))).collect(Collectors.toList());
        System.out.println("collect3 = " + collect3);
        Map<Integer, Integer> collect4 = shipment.stream().sorted((a, b) -> b.getQuantityShipped() - a.getQuantityShipped()).limit(3).collect(Collectors.toMap(Shipment::getSupplierId, Shipment::getQuantityShipped));
        System.out.println("collect4 = " + collect4);

        //problem 4
        List<EmployeeNew> empList = Arrays.asList(new EmployeeNew("amit", 24, "mechanical", 3500.50, 5),
                new EmployeeNew("rahul", 25, "computer", 4500.50, 4),
                new EmployeeNew("ashok", 26, "civil", 5500.50, 1),
                new EmployeeNew("pushap", 27, "mechanical", 8500.50, 7),
                new EmployeeNew("harpreet", 28, "computer", 1500.50, 3),
                new EmployeeNew("manpreet", 22, "civil", 1500.50, 1),
                new EmployeeNew("kuldeep", 42, "civil", 10500.50, 1),
                new EmployeeNew("kushal", 43, "computer", 6500.50, 10),
                new EmployeeNew("robin", 45, "civil", 7500.50, 12));

        //Groups employees by department
        Map<String, List<EmployeeNew>> collect5 = empList.stream().collect(Collectors.groupingBy(EmployeeNew::getDepartment));
        System.out.println("collect5 = " + collect5);

        //For each department, calculate the average salary and the highest salary
        Map<String, Double> collect6 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.averagingDouble((d) -> d.getSalary())));
        System.out.println("collect6 = " + collect6);

        Map<String, Optional<EmployeeNew>> collect7 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.maxBy((a, b) -> Double.compare(a.getSalary(), b.getSalary()))));
        System.out.println("collect7 = " + collect7);
        Set<Map.Entry<String, Optional<EmployeeNew>>> entries = collect7.entrySet();
        for (Map.Entry<String, Optional<EmployeeNew>> entry : entries) {
            System.out.println(entry.getKey() + entry.getValue().orElseThrow(() -> new RuntimeException("error in fetching value")));
        }

        Map<String, Optional<EmployeeNew>> collect8 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.maxBy(Comparator.comparingDouble(EmployeeNew::getSalary))));

        // Filters out employees who have been with the company for less than 2 years
        List<EmployeeNew> collect9 = empList.stream().filter((a) -> a.getYearsExperience() < 2).collect(Collectors.toList());
        System.out.println("collect9 = " + collect9);

        // For each department, calculate the total compensation of employees over 40 years of age
        Map<String, Double> collect10 = empList.stream().filter((a) -> a.getAge() > 40)
                .collect(Collectors.groupingBy(EmployeeNew::getDepartment, Collectors.summingDouble(EmployeeNew::getSalary)));
        System.out.println("collect10 = " + collect10);


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

class Shipment {
    private int shipmentId;
    private int supplierId;
    private int itemId;
    private int quantityShipped;
    private int shipmentDate;

    public Shipment(int shipmentId, int supplierId, int itemId, int quantityShipped, int shipmentDate) {
        this.shipmentId = shipmentId;
        this.supplierId = supplierId;
        this.itemId = itemId;
        this.quantityShipped = quantityShipped;
        this.shipmentDate = shipmentDate;
    }

    public int getShipmentId() {
        return shipmentId;
    }

    public int getSupplierId() {
        return supplierId;
    }

    public int getItemId() {
        return itemId;
    }

    public int getQuantityShipped() {
        return quantityShipped;
    }

    public int getShipmentDate() {
        return shipmentDate;
    }

    @Override
    public String toString() {
        return "Shipment{" +
                "shipmentId=" + shipmentId +
                ", supplierId=" + supplierId +
                ", itemId=" + itemId +
                ", quantityShipped=" + quantityShipped +
                ", shipmentDate=" + shipmentDate +
                '}';
    }
}

class EmployeeNew {
    private String name;
    private int age;
    private String department;
    private double salary;
    private int yearsExperience;

    public EmployeeNew(String name, int age, String department, double salary, int yearsExperience) {
        this.name = name;
        this.age = age;
        this.department = department;
        this.salary = salary;
        this.yearsExperience = yearsExperience;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmployeeNew that = (EmployeeNew) o;
        return age == that.age && Double.compare(that.salary, salary) == 0 && yearsExperience == that.yearsExperience && Objects.equals(name, that.name) && Objects.equals(department, that.department);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, department, salary, yearsExperience);
    }

    @Override
    public String toString() {
        return "EmployeeNew{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", yearsExperience=" + yearsExperience +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    public int getYearsExperience() {
        return yearsExperience;
    }
}
