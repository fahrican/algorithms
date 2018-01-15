import java.util.Scanner;

public class DrawingBook {

    static int solve(int n, int p) {
        // n = number of pages the book has
        // p = page we are looking for
        int fromLastPage;
        int fromFirstPage;

        fromLastPage = getNumberFromLastPage(n, p);
        fromFirstPage = getNumberFromFirstPage(p);

        return Math.min(fromFirstPage, fromLastPage);
    }

    private static int getNumberFromLastPage(int numberOfTotalPages, int pageNumber) {

        int fromLastPage;
        // start from last page of the book e.g. n=6
        if (numberOfTotalPages % 2 == 0) {

            if (numberOfTotalPages == pageNumber) {

                fromLastPage = 0;
            } else if (pageNumber % 2 == 0) {

                fromLastPage = numberOfTotalPages - pageNumber;
                fromLastPage /= 2;
            } else {
                fromLastPage = numberOfTotalPages - pageNumber;
            }
        } else {
            //if the page number +1 is equal e.g. n=5 p=4, so don't have to scroll for a page
            if ((pageNumber + 1) == numberOfTotalPages) {
                fromLastPage = 0;
            } else {
                fromLastPage = numberOfTotalPages - pageNumber;
                fromLastPage /= 2;
            }
        }
        return fromLastPage;
    }

    private static int getNumberFromFirstPage(int pageNumber) {
        // start from first page of the book n = 1
        int fromFirstPage;
        if (pageNumber % 2 == 0) {

            fromFirstPage = pageNumber;
            fromFirstPage /= 2;
        } else {
            fromFirstPage = pageNumber - 1;
            fromFirstPage /= 2;
        }
        return fromFirstPage;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        in.close();
        System.out.println(result);
    }

}// end of class Solution
